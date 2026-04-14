package kr.ac.kopo.wodyd._026exam.controller;
import org.springframework.ui.Model;
import kr.ac.kopo.wodyd._026exam.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class EX09Controller {
    @GetMapping("/member")
    public String requestForm(){
        return "signUp";
    }

    @PostMapping("/member")
    public String requestFormResult(@ModelAttribute Member member, Model model){
        model.addAttribute("member", member);
        return "signUpResult";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
//        binder. setAllowedFields("id", "city", "hobby");
        binder.setDisallowedFields("passwd", "city");
    }
}
