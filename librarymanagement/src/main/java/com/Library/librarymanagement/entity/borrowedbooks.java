package com.Library.librarymanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="borrowedbook")
public class borrowedbooks {
    @Id
    @GeneratedValue
    private int dummyid;

    private int bookid;
    private int userid;
    @JsonFormat(pattern = "dd-MM-yyyy" , shape = JsonFormat.Shape.STRING)
    private String issuedate;
    @JsonFormat(pattern = "dd-MM-yyyy" , shape = JsonFormat.Shape.STRING)
    private String duedate;
    @JsonFormat(pattern = "dd-MM-yyyy" , shape = JsonFormat.Shape.STRING)
    private String returndate;

}
