package com.pet.aki.sec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pet.aki.sec.domain.Member;
import com.pet.aki.sec.mapper.MemberMapper;

@Service
public class MemberService implements UserDetailsService {

    @Autowired
    MemberMapper memberMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = memberMapper.selectMember(username);
        member.setAuthorities(this.selectAuthorities(username));

        return member;
    }


    public List<GrantedAuthority> selectAuthorities(String username) {

        List<String> stringAuthorities = memberMapper.selectAuthorities(username);

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (String authority : stringAuthorities) {
            authorities.add(new SimpleGrantedAuthority(authority));
        }
        return authorities;
    }
}
