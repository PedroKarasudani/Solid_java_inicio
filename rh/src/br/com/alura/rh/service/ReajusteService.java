package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

    private List<validacaoReajuste> validacao;

    public ReajusteService(List<validacaoReajuste> validacao) {
        this.validacao = validacao;
    }

    public void ReajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacao.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.dadosFuncionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
