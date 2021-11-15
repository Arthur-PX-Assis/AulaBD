/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

/**
 *
 * @author usuario
 */
public class produto {
    private String NomeProduto, Status, Cor, CodigoProduto, Quantidade, Valor;
    
    public produto() {
        this.NomeProduto = "";
        this.Status = "";
        this.Cor = "";
        this.CodigoProduto = "";
        this.Quantidade = "";
        this.Valor = "";
    }
    public produto(String NomeProduto, String Status, String Cor, String CodigoProduto, String Quantidade, String Valor) {
        this.NomeProduto = NomeProduto;
        this.Status = Status;
        this.Cor = Cor;
        this.CodigoProduto = CodigoProduto;
        this.Quantidade = Quantidade;
        this.Valor = Valor;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Stauts) {
        this.Status = Stauts;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(String CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
}
