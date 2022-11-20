package com.hq2145.hqpc.service;

import com.hq2145.hqpc.dto.PageDto;
import com.hq2145.hqpc.dto.UserDto;

public interface UserService {
    PageDto search(UserDto criteria, String page, String size, String sortDirection, String sortBy);
    UserDto findByID(long id);
    boolean delete(String id);
    UserDto save(UserDto userDto);
}
