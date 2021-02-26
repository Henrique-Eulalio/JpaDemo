package com.projeto.jpa.javajpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.jpa.javajpademo.Model.Produto;


public interface  Produtos  extends JpaRepository<Produto, Long> {

}
 