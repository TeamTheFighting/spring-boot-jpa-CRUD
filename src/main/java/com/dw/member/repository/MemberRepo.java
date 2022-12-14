package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

//JAP를 상속받는다.
//@Mapper라는 어노테이션을 사용 X
public interface MemberRepo extends JpaRepository<Member, Long>{

}
