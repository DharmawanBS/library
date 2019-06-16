package bit5.team2.library.test;

import bit5.team2.library.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("")
public class AdminController {
    @Autowired
    AdminRepo adminRepo;

    @GetMapping("/get")
    public Object get() {
        return adminRepo.findAll();
    }

    @PostMapping("/post")
    public String post(@RequestBody @Valid AdminInput adminInput) {
        Admin admin = new Admin();
        admin.setAdminCode(adminInput.getAdminCode());
        admin.setAdminUsername(adminInput.getAdminUsername());
        admin.setAdminPassword(adminInput.getAdminPassword());
        admin.setCreatedBy(adminInput.getCreatedBy());
        adminRepo.save(admin);
        return "ok";
    }
}
