package com.techcushy.dataBase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="USERS")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_ADDRESS")
    private String userAddress;
    @Column(name ="SALARY")
    private int salary;

}
