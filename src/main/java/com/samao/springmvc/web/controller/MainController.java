package com.samao.springmvc.web.controller;

import com.samao.springmvc.service.DataManager;
import com.samao.springmvc.service.Person;
import com.samao.springmvc.service.PersonForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by samao on 12/12/15.
 */

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private DataManager dataManager;

    @RequestMapping( method = RequestMethod.GET)
    public String showMessage(@ModelAttribute("person") Person person ){

        person.setId(1234L);
        person.setFirstName("Hussein");
        person.setLastName("Samao");
        person.setGrade(12);

        dataManager.setPerson(person);
        dataManager.getPerson();

        return "viewData";
    }


    @RequestMapping (value = "/form",method = RequestMethod.POST)
    public String newPersonInfo (@ModelAttribute("person") Person person){

        dataManager.setPerson(person);
        dataManager.getPerson();

        return "personInfo";
    }
}
