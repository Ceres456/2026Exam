package kr.ac.kopo.wodyd._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("/exam13_02")
public class Chap13_02Controller {
    @GetMapping
    public String showForm(){
        return "viewPage13_02_form";
    }

    @PostMapping
    @ResponseBody
    public String submit(@RequestBody HashMap<String, String> map){
        System.out.println(map);
        return "JSON 형식의 데이터 전송 성공";
    }
}
