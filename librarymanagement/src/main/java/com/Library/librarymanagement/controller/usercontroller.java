package com.Library.librarymanagement.controller;

import com.Library.librarymanagement.entity.user;
import com.Library.librarymanagement.entity.users;
import com.Library.librarymanagement.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class usercontroller {

    @Autowired
    private userservice service;
    @PostMapping("/registeruser")
    @CrossOrigin(origins="http://localhost:4200")
    public user registeruser(@RequestBody user user) throws Exception
    {
        String email= user.getEmail();
        if(email!= null && !"".equals(email))
        {
         user obj=service.fetchuserbymail(email);
         if(obj!=null)
         {
             throw new Exception("user with"+email+" already exist");
         }
        }
      user obj=null;
      obj=service.saveuser(user);
      return obj;
    }

    @GetMapping("/getallusers")

    private List<user> getusers()
    {
        return service.getusers();
    }


    @PostMapping("/login")
    @CrossOrigin(origins="http://localhost:4200/")
    public user userlogin(@RequestBody user user) throws Exception
    {
      String temail=user.getEmail();
      System.out.println(temail);
      String tpassword= user.getPassword();
        System.out.println(tpassword);
      user obj=new user();
      if(temail!=null && tpassword!=null)
      {
       obj = service.fetchuserbymailandpassword(temail,tpassword);
      }
      if(obj==null)
      {
          throw new Exception("user doesnt exist");
      }
 return obj;
    }
    @DeleteMapping("/deleteuser/{id}")
    @CrossOrigin(origins="http://localhost:4200/")

    public void deleteuser(@PathVariable int id)
    {

        service.deleteuser(id);

    }
}
