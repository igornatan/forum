package com.maxi.forum.repository;

import com.maxi.forum.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findByCursoNome(String nomeCurso);
}
