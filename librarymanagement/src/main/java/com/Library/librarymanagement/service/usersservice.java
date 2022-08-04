package com.Library.librarymanagement.service;

import com.Library.librarymanagement.entity.users;
import com.Library.librarymanagement.repository.usersrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usersservice {
    @Autowired
    private usersrepository repository;

    public users adduser(users user)
    {
        return repository.save(user);
    }

    public users updatepassword(String password)
    {

        users u=new users();
        u.password=password;
        return repository.save(u);
    }
    public List<users> getusers(){
        return repository.findAll();
    }
//    public List<users> getuser(String username)
//    {
//        return repository.findByName(username);
//    }


}
