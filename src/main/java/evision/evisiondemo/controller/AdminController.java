package evision.evisiondemo.controller;

import com.fasterxml.jackson.annotation.JacksonInject;
import evision.evisiondemo.repository.MemberRepository;
import evision.evisiondemo.service.AdminService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("admin/*")

@Component
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admin/signup")
    public String memberSignup(){
        return "members/SignupForm";

    }

}
