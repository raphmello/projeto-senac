package com.raphael.pi.senac.models;

import java.time.LocalDate;

public class Fornecedor extends PessoaJuridica implements SalvavelEmTxt{

    private Integer idFornecedor;
    private String segmento;
    private String formaDePagamento;
    private String dataPrimeiraCompra;
    private String dataUltimaCompra;

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataPrimeiraCompra() {
        return dataPrimeiraCompra;
    }

    public void setDataPrimeiraCompra(String dataPrimeiraCompra) {
        this.dataPrimeiraCompra = dataPrimeiraCompra;
    }

    public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }

    @Override
    public String toString() {
        return "idFornecedor=" + idFornecedor +
                ", segmento='" + segmento +
                ", formaDePagamento='" + formaDePagamento +
                ", dataPrimeiraCompra=" + dataPrimeiraCompra +
                ", dataUltimaCompra=" + dataUltimaCompra +
                ", cnpj=" + getCnpj() +
                ", razaoSocial=" + getRazaoSocial() +
                ", inscricaoEstadual=" + getInscricaoEstadual() +
                ", endereco=" + getEndereco() +
                ", telefone=" + getTelefone() +
                ", email=" + getEmail();
    }
}
