package com.javassem.dao;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.GonziVO;


@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public List<GonziVO> gonziList(String table) {
		
		System.out.println("=======> 공지사항 리스트 출동!! 이것은 MemberDAOImpl까지 왔다는 증거!" + table);
		
		return mybatis.selectList("user.gonziList",table);
		
	}


	

}
