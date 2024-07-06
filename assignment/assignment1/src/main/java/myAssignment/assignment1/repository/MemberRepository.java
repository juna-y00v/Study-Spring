package myAssignment.assignment1.repository;

import myAssignment.assignment1.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //DB에 저장

    Optional<Member> findById(String id); //ID 데이터 조회

    Optional<Member> findByPassword(String password); //Password 데이터 조회

    List<Member> findAll(); // 모든 데이터 조회
}
