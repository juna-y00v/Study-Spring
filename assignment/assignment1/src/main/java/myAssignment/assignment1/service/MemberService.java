package myAssignment.assignment1.service;

import myAssignment.assignment1.domain.Member;
import myAssignment.assignment1.domain.MemberVo;

public interface MemberService {

    void login(MemberVo memberVo);

    Long join (MemberVo memberVo);
}
