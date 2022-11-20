package com.hq2145.hqpc.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;

import com.hq2145.hqpc.dto.UserDto;
import com.hq2145.hqpc.entity.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class UserSpecification {
    public Specification<User> filter(final UserDto criteria) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if(criteria.getEnable()) {
                predicates.add(cb.equal(root.get("enable"), true));
            }

            if(StringUtils.hasLength(criteria.getUsername())) {
                predicates.add(cb.like(root.get("username"), criteria.getUsername().trim()));
            }

            if(StringUtils.hasLength(criteria.getName())) {
                predicates.add(cb.like(cb.upper(root.get("name")), "%" + criteria.getName().trim().toUpperCase()+ "%"));
            }

            if(StringUtils.hasLength(criteria.getEmail())) {
                predicates.add(cb.like(cb.upper(root.get("email")), "%" + criteria.getEmail().trim().toUpperCase()+ "%"));
            }

            if(StringUtils.hasLength(criteria.getRole())) {
                predicates.add(cb.like(cb.upper(root.get("name")), criteria.getRole().trim().toUpperCase()));
            }

            if(StringUtils.hasLength(criteria.getPhone())) {
                predicates.add(cb.like(root.get("phone"), "%" + criteria.getPhone().trim()+ "%"));
            }

            return cb.and(predicates.toArray(Predicate[]::new));
        };

    }
}
