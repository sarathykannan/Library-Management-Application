package com.Library.librarymanagement.repository;

import com.Library.librarymanagement.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface usersrepository extends JpaRepository<users,Integer> {
//    List<users> findByName(String username);
}
