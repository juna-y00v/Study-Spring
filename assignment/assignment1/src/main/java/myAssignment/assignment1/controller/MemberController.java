package myAssignment.assignment1.controller;

import myAssignment.assignment1.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
