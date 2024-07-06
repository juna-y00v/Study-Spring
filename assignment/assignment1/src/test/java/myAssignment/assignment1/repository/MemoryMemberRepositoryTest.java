package myAssignment.assignment1.repository;

import myAssignment.assignment1.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    //저장소에 저장되는지 확인하는 테스트
    @Test
    public void save() {
        Member member = new Member();
        member.setUserId("Juna");

        memberRepository.save(member);

        Member result = memberRepository.findById(member.getId()).get();
        System.out.println(result.getUserId());
        assertThat(member).isEqualTo(result);
    }
}