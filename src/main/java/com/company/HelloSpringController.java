package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Troy on 10/21/16.
 */
@Controller
public class HelloSpringController {
    @RequestMapping(path = "/person",method = RequestMethod.GET)
    public String person(Model model,String name,String city,Integer age) {
        if (name == null) {
            name = "Troy";
        }
        if (city == null) {
            city = "Charleston";
        }
        if (age == null) {
            age = 23;
        }
        Person p = new Person(name,city,age);
        model.addAttribute("person",p);
        return "person";
    }
}
