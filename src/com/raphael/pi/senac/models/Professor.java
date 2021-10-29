package com.raphael.pi.senac.models;

import java.time.LocalDate;

public class Professor extends PessoaFisica implements SalvavelEmTxt {

    private Integer idProfessor;
    private String habilitacao;
    private LocalDate dataDeContratacao;
    private Double salario;

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public LocalDate getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(LocalDate dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return  "idProfessor=" + idProfessor +
                ", habilitacao='" + habilitacao + '\'' +
                ", dataDeContratacao=" + dataDeContratacao +
                ", salario=" + salario +
                ", cpf=" + getCpf() +
                ", nomeCompleto=" + getNomeCompleto() +
                ", dataDeNascimento=" + getDataDeNascimento() +
                ", endereco=" + getEndereco() +
                ", telefone=" + getTelefone() +
                ", email=" + getEmail();
    }
}
