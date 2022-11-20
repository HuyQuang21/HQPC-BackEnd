package com.hq2145.hqpc.service.impl;

import com.hq2145.hqpc.constant.DefaultPageEnum;
import com.hq2145.hqpc.dto.PageDto;
import com.hq2145.hqpc.dto.UserDto;
import com.hq2145.hqpc.entity.User;
import com.hq2145.hqpc.mapper.UserMapper;
import com.hq2145.hqpc.repository.UserRepository;
import com.hq2145.hqpc.service.UserService;
import com.hq2145.hqpc.specification.UserSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserSpecification userSpecification;

    @Autowired
    private UserMapper userMapper;

    public PageDto search(UserDto criteria, String page, String size, String sortDirection, String sortBy){
        log.info("Process=gets-user-by, criteria: {}, page: {}, size: {}, sortDirection: {}, sortBy: {}", criteria, page, size, sortDirection, sortBy);

        Integer selectedPage = 0;
        Integer maxResults = 0;

        try {
            selectedPage = Integer.parseInt(page);
            maxResults = Integer.parseInt(size);

        } catch (NumberFormatException | NullPointerException exception) {
            log.error("Error: Invalid page or size submitted");
            selectedPage = DefaultPageEnum.PAGE.val;
            maxResults = DefaultPageEnum.SIZE.val;
        }

        Page<UserDto> userPage = userRepository.findAll(userSpecification.filter(criteria), PageRequest.of(selectedPage, maxResults, Sort.Direction.valueOf(sortDirection), sortBy)).map(item -> userMapper.entityToDTO(item));

        for (UserDto user: userPage.getContent()) {
            user.setPassword(null);
        }

        return PageDto.builder().content(userPage.getContent()).number(userPage.getNumber())
                .numberOfElements(userPage.getNumberOfElements()).page(userPage.getNumber()).size(userPage.getSize())
                .totalPages(userPage.getTotalPages()).totalElements(userPage.getTotalElements()).build();
    }

    public UserDto findByID(long id){
        User result = userRepository.findById(id).orElse(null);
        if(result == null){
            return null;
        }

        result.setPassword(null);

        return userMapper.entityToDTO(result);
    }

    public boolean delete(String id){
        long selectedID = Long.parseLong(id);

        if(findByID(selectedID) == null){
            throw new NumberFormatException();
        }

        userRepository.deleteById(selectedID);

        return !userRepository.existsById(selectedID);
    }

    public UserDto save(UserDto userDto) {
        User userEntity;

        userEntity = userMapper.dtoToEntity(userDto);

        if(userDto.getPassword().trim().length() > 0){
            userEntity.setPassword(BCrypt.hashpw(userDto.getPassword(), BCrypt.gensalt(10)));
        } else {
            try {
                userEntity.setPassword(userRepository.findByIdAndEnableTrue(userDto.getId()).orElse(null).getPassword());
            } catch (NullPointerException exception){
                log.error("Error: invalid information was submitted");
                return null;
            }
        }

        userEntity.setEnable(true);

        return userMapper.entityToDTO(userRepository.save(userEntity));

    }

}
