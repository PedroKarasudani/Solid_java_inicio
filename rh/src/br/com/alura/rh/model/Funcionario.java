package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosFuncionario dadosFuncionario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosFuncionario.setNome(nome);
		this.dadosFuncionario.setCpf(cpf);
		this.dadosFuncionario.setCargo(cargo);
		this.dadosFuncionario.setSalario(salario);
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosFuncionario.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

    public void promover(Cargo novoCargo) {
		this.dadosFuncionario.setCargo(novoCargo);
	}
}
