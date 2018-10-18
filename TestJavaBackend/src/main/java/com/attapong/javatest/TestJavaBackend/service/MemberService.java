package com.attapong.javatest.TestJavaBackend.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.attapong.javatest.TestJavaBackend.handleexception.Constant;
import com.attapong.javatest.TestJavaBackend.handleexception.MemberExcption;
import com.attapong.javatest.TestJavaBackend.model.Member;

@Service
public class MemberService {

	public Member saveMember(Member member) throws MemberExcption  {
		
		if(member == null)
			return null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String yyyyMMdd = sdf.format(new Date());
		String code = member.getPhone().substring(member.getPhone().length()-4, member.getPhone().length());
        
		member.setRefSessionCode(yyyyMMdd+code);
		
		if(member.getSalary() > 50000) {
			member.setMemberType("Platinum");
		}else if(member.getSalary() > 30000 && member.getSalary() < 50000) {
			member.setMemberType("Gold");
		}else if(member.getSalary() < 30000 && member.getSalary() > 15000) {
			member.setMemberType("Silver");
		}else {
			throw new MemberExcption("TestJavaBackend", Constant.ERR_CODE_LESS_SALARY, Constant.ERR_DESC_LESS_SALARY);
		}
		return member;
		
	}
}
