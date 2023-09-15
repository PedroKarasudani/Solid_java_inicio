package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
    //USO DA INTERFACE
    private List<validacaoReajuste> validacao;
    //CONSTRUTOR COM INTERFACE, ASSIM ESCOLHE O MODELO NA HORA DA IMPLEMENTACAO
    //DANDO UM NEW NAS DIRETAMENTE NAS CLASSES QUE IMPLEMENTAM validacaoReajuste
    public ReajusteService(List<validacaoReajuste> validacao) {
        this.validacao = validacao;
    }
    //EXECUTA TODAS AS VALIDACOES IMPLEMENTADAS NA LIST
    public void ReajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacao.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.dadosFuncionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
