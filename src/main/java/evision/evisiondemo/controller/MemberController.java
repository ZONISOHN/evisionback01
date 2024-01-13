package evision.evisiondemo.controller;

import evision.evisiondemo.repository.MemoryAdminRepository;
import evision.evisiondemo.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    private MemoryAdminRepository adminRepository;
    private MemoryMemberRepository MemberRepository;

    @Autowired
    public MemberController(MemoryAdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("/login")
    public String login(){
        return "members/login";
    }
}
