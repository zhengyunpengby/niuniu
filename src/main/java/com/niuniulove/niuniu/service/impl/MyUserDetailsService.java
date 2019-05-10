package com.niuniulove.niuniu.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @program: niuniu
 * @description: 用户登录验证
 * @author:
 * @create: 2019-05-10 15:18
 **/
@Slf4j
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("查询用户登录信息");
        return new User(s, "niuniu520", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
