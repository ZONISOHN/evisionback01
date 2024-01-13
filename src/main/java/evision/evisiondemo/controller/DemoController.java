package evision.evisiondemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("Hello")
    public String Hello(Model model){
        model.addAttribute("data", "Hello");

        return "Hello";
    }
}
