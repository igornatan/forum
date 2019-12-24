package com.maxi.forum.controller.dto;

import java.time.LocalDateTime;

import com.maxi.forum.models.Resposta;

public class RespostaDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @return the dataCriacao
     */
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @return the nomeAutor
     */
    public String getNomeAutor() {
        return nomeAutor;
    }
}