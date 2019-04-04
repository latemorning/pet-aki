package com.pet.aki.sec.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.pet.aki.sec.domain.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class MemberMapperTest {

	@Autowired MemberMapper memberMapper;
    
    @Test
    public void selectMemberTest() {
         Member member = memberMapper.selectMember("username1");
         assertThat("username1", is(member.getUsername()));
         assertThat("member_name 1", is(member.getMemberName()));
         assertThat("password1", is(member.getPassword()));
         assertThat(member.isEnabled());
    }
    
    @Test
    public void selectAuthorityTest() {
         List<String> authorities = memberMapper.selectAuthorities("username1");
         assertThat(authorities, hasItems("ROLE_ADMIN"));       
          
         authorities= memberMapper.selectAuthorities("username2");
         assertThat(authorities, hasItem("ROLE_USER"));     
         

         List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();

         for (String authority : authorities) {
             grantedAuthorities.add(new SimpleGrantedAuthority(authority));
         }
         
         System.out.println("aaaa");
    }
}
