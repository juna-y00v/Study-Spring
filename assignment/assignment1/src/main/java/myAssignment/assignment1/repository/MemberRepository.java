package myAssignment.assignment1.repository;

import myAssignment.assignment1.domain.Member;

import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findByUserId(String userId);
}
