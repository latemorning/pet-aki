package com.pet.aki.cmm.mapper;

import java.util.List;

import com.pet.aki.cmm.model.MemberVO;

public interface MemberMapper1 {

	public List<MemberVO> selectMemberList();

	public MemberVO selectMemberById(Long id);
	
	public void insertMember(MemberVO memberVO);
}
