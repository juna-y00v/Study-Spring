package myAssignment.assignment1.service;

import myAssignment.assignment1.domain.Member;
import myAssignment.assignment1.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }
}
