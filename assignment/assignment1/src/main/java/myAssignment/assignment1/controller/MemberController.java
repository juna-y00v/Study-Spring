package myAssignment.assignment1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberRepository member;

    public MemberController(MemberRepository member) {
        this.member = member;
    }

    @RequestMapping("/")
    public String login() {
        return "login";
    }
}
