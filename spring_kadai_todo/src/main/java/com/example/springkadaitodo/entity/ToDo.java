package com.example.springkadaitodo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// ToDoエンティティ：データベースのToDoテーブルに対応
@Entity
@Data

public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    private String title;  // タイトル

    @Enumerated(EnumType.STRING)
    private Priority priority;  

    private String status;  

   
    public enum Priority {
        高, 中, 低
    }
}