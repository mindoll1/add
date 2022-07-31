package com.javassem.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.MemberDAOImpl;
import com.javassem.domain.GonziVO;


@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAOImpl memberDAO;
	
	
	   
	@Override
	public List<GonziVO> gonziList(String table) {
		return memberDAO.gonziList(table);
	}



}
