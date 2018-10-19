package com.attapong.javatest.TestJavaBackend.controller;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.attapong.javatest.TestJavaBackend.handleexception.MemberExcption;
import com.attapong.javatest.TestJavaBackend.jpa.MemberRepository;
import com.attapong.javatest.TestJavaBackend.model.JwtUser;
import com.attapong.javatest.TestJavaBackend.model.Member;
import com.attapong.javatest.TestJavaBackend.security.JwtGenerator;
import com.attapong.javatest.TestJavaBackend.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private MemberService service;
	
	@Autowired
	private JwtGenerator jwtGenerator;
	
	@GetMapping("/api/getMembers")
	public List<Member> retrieveAllMemberInfomation() {
		return memberRepository.findAll();
	}
	
	@PostMapping("/register")
	public String createStudent(@RequestBody Member member) throws MemberExcption {

		
	
		Member	savedStudent = memberRepository.save(service.saveMember(member));

	/*	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();*/

		return jwtGenerator.generate(member);

	}
	

}
