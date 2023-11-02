package hello;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String SayHello(Model model) {
        model.addAttribute("msg", "Hello World!!!");
System.out.println("SayHello");
        return "hello";
    }
}
