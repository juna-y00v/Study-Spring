package myAssignment.assignment1.service;

import myAssignment.assignment1.domain.Member;
import myAssignment.assignment1.domain.MemberVo;
import myAssignment.assignment1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void login(Member member) {

    }

    @Override
    public Long join(Member member) {
      validateDuplicateMember(member);
        memberRepository.save(member);
                return member.getId();
    }

    //중복 회원 검증 로직
    private void validateDuplicateMember(Member member) {
        memberRepository.findById(member.getId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }
    //아이디 규정 검증 로직
    private void validateIdRule(Member member) {
        if (member.getUserId().length() > 11 || member.getUserId().length() < 4) {
            //
        }

        if (member.getUserId().)
    }

    //
}
