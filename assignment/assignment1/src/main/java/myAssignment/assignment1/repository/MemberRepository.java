package myAssignment.assignment1.repository;

import myAssignment.assignment1.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
