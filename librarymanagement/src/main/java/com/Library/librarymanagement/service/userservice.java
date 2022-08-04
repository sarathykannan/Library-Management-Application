package com.Library.librarymanagement.service;

import com.Library.librarymanagement.entity.user;
import com.Library.librarymanagement.entity.users;
import com.Library.librarymanagement.repository.borrowedbooksrepository;
import com.Library.librarymanagement.repository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {
@Autowired
public userrepository repository;
public borrowedbooksrepository bookrepo;
public user saveuser(user user)
{
     return repository.save(user);
}

public user fetchuserbymail(String email)
{
    return repository.findByemail(email);
}

public user fetchuserbymailandpassword(String email, String password)
{
    return repository.findByEmailAndPassword(email,password);
}
    public List<user> getusers(){
        return repository.findAll();
    }

    public void deleteuser(int id)
    {
        repository.deleteById(id);

    }
}
