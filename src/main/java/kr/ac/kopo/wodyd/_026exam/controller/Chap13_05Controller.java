package kr.ac.kopo.wodyd._026exam.controller;

import kr.ac.kopo.wodyd._026exam.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exam13_05")
public class Chap13_05Controller {

    @GetMapping
    public List<Person> showJsonTypeData() {
        List<Person> list = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("PolyKim");
        person1.setAge("30");
        person1.setEmail("polykim@kopo");
        list.add(person1);

        Person person2 = new Person();
        person2.setName("Lee");
        person2.setAge("25");
        person2.setEmail("lee@kopo");
        list.add(person2);

        return list;
    }
}