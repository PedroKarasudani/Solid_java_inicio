package br.com.alura.rh.service;

import java.math.BigDecimal;
<<<<<<< d800334be6f5cc82a3306a52897c2f6a97425818
import java.math.RoundingMode;
=======
import java.util.List;
>>>>>>> O - OPEN CLOSED PRINCIPLE - Extraindo validacoes

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

    private List<validacaoReajuste> validacao;

    public ReajusteService(List<validacaoReajuste> validacao) {
        this.validacao = validacao;
    }

    public void ReajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
<<<<<<< d800334be6f5cc82a3306a52897c2f6a97425818
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
=======
        this.validacao.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
>>>>>>> O - OPEN CLOSED PRINCIPLE - Extraindo validacoes
        funcionario.atualizarSalario(salarioReajustado);
    }
}
