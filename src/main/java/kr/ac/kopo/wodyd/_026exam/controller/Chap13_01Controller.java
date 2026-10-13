package kr.ac.kopo.wodyd._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam13_01")
public class Chap13_01Controller {
    @GetMapping
    public String showForm(){
        return "viewPage13_01_form";
    }

    @PostMapping
    public String submit(@RequestBody String param, Model model){
        model.addAttribute("data1", "@RequestBody로 정보 받기");
        model.addAttribute("data2", param);
        return "viewPage13_01_result";
    }
}
