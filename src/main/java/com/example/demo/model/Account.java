package com.example.demo.model;

import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @program: demo
 * @description: 账户类
 * @author: axyman
 * @create: 2021-07-20 21:39
 **/
@Table(name = "account")
@Entity
@DynamicInsert
@DynamicUpdate
@Data
public class Account {

    @Id
    @GenericGenerator(strategy = "uuid2" , name = "uuid")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id")
    private String id;

    @Column(name = "account")
    private String account;
}
