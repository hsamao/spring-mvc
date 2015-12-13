package com.samao.springmvc.service;

import org.springframework.stereotype.Service;

/**
 * Created by samao on 12/13/15.
 */
@Service
public class DataManager {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}


