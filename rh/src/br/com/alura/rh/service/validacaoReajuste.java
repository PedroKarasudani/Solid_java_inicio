package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface validacaoReajuste {
    //INTERFACE SEGREGATION PRINCIPLE
    void validar(Funcionario funcionario, BigDecimal aumento);

}
