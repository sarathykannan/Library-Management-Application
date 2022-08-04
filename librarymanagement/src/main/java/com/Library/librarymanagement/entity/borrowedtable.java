package com.Library.librarymanagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="borrowedbookstables")
public class borrowedtable {
    @Id
    @GeneratedValue
    private int dummyid;

    private int bookid;
    private int userid;
    private Date issuedate;
    private Date duedate;
    private Date returndate;

    private boolean status;

}
