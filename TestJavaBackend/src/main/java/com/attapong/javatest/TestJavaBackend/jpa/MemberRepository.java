package com.attapong.javatest.TestJavaBackend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attapong.javatest.TestJavaBackend.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
