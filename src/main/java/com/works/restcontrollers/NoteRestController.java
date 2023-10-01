package com.works.restcontrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
@CrossOrigin
public class NoteRestController {

    @GetMapping("/data")
    public String data(){
        return "Note Data";
    }
}
