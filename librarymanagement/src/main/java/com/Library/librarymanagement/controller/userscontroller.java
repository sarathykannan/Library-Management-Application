package com.Library.librarymanagement.controller;

import com.Library.librarymanagement.entity.users;
import com.Library.librarymanagement.service.usersservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userscontroller {
    @Autowired
    private usersservice service;
    @GetMapping("/getusers")

    private List<users> getusers()
    {
        return service.getusers();
    }

//    @GetMapping("/findusername")
//    private List<users> getuser(@RequestParam String username)
//    {
//        return service.getuser(username);
//    }
    @PostMapping("/adduser")
    private users adduser(@RequestBody  users user)
    {
        return service.adduser(user);
    }

    @PutMapping("/updatepassword")
    private users updatepassword(@RequestBody String password, int userid)
    {
        return service.updatepassword(password);
    }
}
