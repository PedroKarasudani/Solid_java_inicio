package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Tercerizado extends DadosFuncionario{

    private DadosFuncionario dadosFuncionario;
    private String empresa;

    public Tercerizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
        this.dadosFuncionario.setNome(nome);
		this.dadosFuncionario.setCpf(cpf);
		this.dadosFuncionario.setCargo(cargo);
		this.dadosFuncionario.setSalario(salario);
        this.empresa = empresa;
        }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
