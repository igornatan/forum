package com.maxi.forum.config.validation;

public class ErrorDto {

    private String campo;
    private String erro;

    public ErrorDto(final String campo, final String erro){
        this.campo = campo;
        this.erro = erro;
    }

    /**
     * @return o campo do form com erro
     */
    public String getCampo() {
        return campo;
    }

    /**
     * @return a mensagem de erro ocorrida com o campo
     */
    public String getErro() {
        return erro;
    }
}
