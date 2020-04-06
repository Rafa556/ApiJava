package com.rafa.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafa.socialbooksapi.domain.Livro;

public interface LivrosRepository extends JpaRepository <Livro, Long> {


}