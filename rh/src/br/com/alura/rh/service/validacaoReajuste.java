package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface validacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
