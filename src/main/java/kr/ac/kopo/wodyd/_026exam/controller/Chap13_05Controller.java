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
    public List<Person> showJsonTypeData(){
        Person person1 = new Person("PolyPark", "20", "polypark@naver.com");
        Person person2 = new Person("JaeiSim", "16", "jaeiSim@gmail.com");
        Person person3 = new Person("DonheeLee", "25", "donhee@naver.com");
        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        System.out.println(arrayList);
        return arrayList;
    }
}
