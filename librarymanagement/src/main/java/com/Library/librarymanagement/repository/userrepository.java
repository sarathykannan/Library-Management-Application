package com.Library.librarymanagement.repository;

import com.Library.librarymanagement.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userrepository extends JpaRepository<user,Integer> {
    public user findByemail(String email);
    public user findByEmailAndPassword(String email,String password);
//    @Query("SELECT u.username,b.bookid FROM USERTABLE u JOIN b.borrowedbook b")
//    public String joinuserandbook();

}
