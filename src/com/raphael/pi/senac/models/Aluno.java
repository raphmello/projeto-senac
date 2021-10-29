package com.raphael.pi.senac.models;

import java.time.LocalDate;

public class Aluno extends PessoaFisica implements SalvavelEmTxt {

   private Integer idAluno;
   private LocalDate dataDeInscricao;
   private Integer ano;
   private String periodo;

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public LocalDate getDataDeInscricao() {
        return dataDeInscricao;
    }

    public void setDataDeInscricao(LocalDate dataDeInscricao) {
        this.dataDeInscricao = dataDeInscricao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "idAluno=" + idAluno +
               ", dataDeInscricao=" + dataDeInscricao +
               ", ano=" + ano +
               ", periodo=" + periodo +
                ", cpf=" + getCpf() +
                ", nomeCompleto=" + getNomeCompleto() +
                ", dataDeNascimento=" + getDataDeNascimento() +
                ", endereco=" + getEndereco() +
                ", telefone=" + getTelefone() +
                ", email=" + getEmail();
    }
}
