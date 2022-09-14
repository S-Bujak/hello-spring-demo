package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {

//Handles request at path /hello
//    @GetMapping("hello1")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){

        return "Goodbye, Spring!";
    }



    //Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloQueryParam(@RequestParam String name) {

        return "Hello, " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithoutParam(@PathVariable String name){

        return "Hello, " + name + "!";
    }

// lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }
}
