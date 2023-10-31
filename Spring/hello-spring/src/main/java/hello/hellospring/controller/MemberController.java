package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberController memberController){
        this.memberService = memberService;
    }

    @GetMapping("/member/new")
    public String createForm(){
        return "member/crteateMemberFrom";
    }
}
