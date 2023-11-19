package hello.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String SayHello(Model model) {
        model.addAttribute("msg", "Hello World!!!");
        return "hello";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String SayHello2(Model model) {
        model.addAttribute("msg", "Hello2");
        return "hello2";
    }

    @GetMapping("/responsebody")
    @ResponseBody
    public String sample() {
      return "responsebody";
    }

}
