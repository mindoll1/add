package com.javassem.dao;

import java.util.List;


import com.javassem.domain.GonziVO;


public interface MemberDAO {


	//공지사항 확인기능
	List<GonziVO> gonziList(String table);
	
	
	
	
}
