package com.example.springkadaitodo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springkadaitodo.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

    // タイトルで検索する例（任意で追加）
    List<ToDo> findByTitle(String title);
}

