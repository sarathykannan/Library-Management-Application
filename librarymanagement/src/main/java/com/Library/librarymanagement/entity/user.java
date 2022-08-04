package com.Library.librarymanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usertable")
public class user {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String email;
    public String password;
    private String role;


}
