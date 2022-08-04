package com.Library.librarymanagement.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userstable")
public class users {
    @Id
    @GeneratedValue
    private int userid;
    private String username;
    private String email;
    public String password;
    private boolean type;

}
