package hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloRestController {

    @RequestMapping("/rest1")
    public String rest1() {
        System.out.println("/rest1");
        return "rest1";
    }

    @GetMapping("/get1")
    public String get1() {
        return "get1";
    }

    @GetMapping("/getparam")
    public String getparam(@RequestParam String name) {
        name = name == "" ? "" : name; 
        return name;
    }

    @PostMapping("/post1")
    public void post1() {
        System.out.println("post1");
    }
}