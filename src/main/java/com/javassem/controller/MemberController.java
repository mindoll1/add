package com.javassem.controller;

import java.util.Date;


import java.util.List;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.javassem.domain.GonziVO;
import com.javassem.service.MemberService;

@Controller
public class MemberController {

	@RequestMapping("user/userGonzi.do")
	public void xxx() {
	}
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="user/gonziList.do",
			produces="application/text;charset=UTF-8")
	@ResponseBody
	public String json(String table) {
	System.out.println(table);
	List<GonziVO> glist = memberService.gonziList(table);
	for(GonziVO list : glist) {
		System.out.println(list.getGonziNo());
	}
	JSONArray jsonList = new JSONArray();
	for( GonziVO vo : glist ){
		
		JSONObject obj = new 	JSONObject();
		obj.put("gonziNo",vo.getGonziNo());
		obj.put("gonziName",vo.getGonziName());
		obj.put("gonziDetail",vo.getGonziDetail());
		jsonList.add(obj);
		
	}
	
	return jsonList.toJSONString();
		
		
	
		
		
	}
	
	
	
}
