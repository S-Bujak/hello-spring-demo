package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//Handles request at path /hello
//    @GetMapping("hello1")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";
    }


    //lives at /hello
    //Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST})
    public String helloQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithoutParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

// lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
