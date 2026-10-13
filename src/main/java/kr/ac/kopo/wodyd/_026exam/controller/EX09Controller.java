package kr.ac.kopo.wodyd._026exam.controller;

import kr.ac.kopo.wodyd._026exam.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EX09Controller {
    @GetMapping("/member")
    public String requestForm(){
        return "signUp";
    }

    @PostMapping("/member")
    public String requestFormResult( Member member, Model model){
        return "signUpResult";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setDisallowedFields("passwd", "city");
    }
}
