package myAssignment.assignment1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MemberConroller {

    private MemberRepository member;

    public MemberConroller(MemberRepository member) {
        this.member = member;
    }

    @RequestMapping("/")
    public String login() {
        return "login";
    }
}
