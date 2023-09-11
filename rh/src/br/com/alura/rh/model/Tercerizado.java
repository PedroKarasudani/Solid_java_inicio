package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Tercerizado{

    private DadosFuncionario dadosFuncionario;
    private String empresa;

    public Tercerizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosFuncionario = new DadosFuncionario (nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
