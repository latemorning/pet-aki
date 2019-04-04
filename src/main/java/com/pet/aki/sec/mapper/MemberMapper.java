package com.pet.aki.sec.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pet.aki.sec.domain.Member;

@Mapper
public interface MemberMapper {

    public Member selectMember(String username);


    public List<String> selectAuthorities(String username);
}
