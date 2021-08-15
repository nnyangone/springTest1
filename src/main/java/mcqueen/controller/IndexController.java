package mcqueen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value="index.html")
    public void index(Model m){
        m.addAttribute("result", "Yor are welcome to use Spring MVC, My name is Mcqueen Xing.");
    }
}
