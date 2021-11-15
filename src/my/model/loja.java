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
public class loja {
    private String EnderecoLoja, CodigoLoja, NumeroFuncionarios, NumeroProdutosEstoque, NumeroProdutosVendidos, NumeroProdutosAVenda;
    
    public loja() {
        this.EnderecoLoja = "";
        this.CodigoLoja = "";
        this.NumeroFuncionarios = "";
        this.NumeroProdutosEstoque = "";
        this.NumeroProdutosVendidos = "";
        this.NumeroProdutosAVenda = "";
    }

    public loja(String EnderecoLoja, String CodigoLoja, String NumeroFuncionarios, String NumeroProdutosEstoque, String NumeroProdutosVendidos, String NumeroProdutosAVenda) {
        this.EnderecoLoja = EnderecoLoja;
        this.CodigoLoja = CodigoLoja;
        this.NumeroFuncionarios = NumeroFuncionarios;
        this.NumeroProdutosEstoque = NumeroProdutosEstoque;
        this.NumeroProdutosVendidos = NumeroProdutosVendidos;
        this.NumeroProdutosAVenda = NumeroProdutosAVenda;
    }

    public String getEnderecoLoja() {
        return EnderecoLoja;
    }

    public void setEnderecoLoja(String EnderecoLoja) {
        this.EnderecoLoja = EnderecoLoja;
    }

    public String getCodigoLoja() {
        return CodigoLoja;
    }

    public void setCodigoLoja(String CodigoLoja) {
        this.CodigoLoja = CodigoLoja;
    }

    public String getNumeroFuncionarios() {
        return NumeroFuncionarios;
    }

    public void setNumeroFuncionarios(String NumeroFuncionarios) {
        this.NumeroFuncionarios = NumeroFuncionarios;
    }

    public String getNumeroProdutosEstoque() {
        return NumeroProdutosEstoque;
    }

    public void setNumeroProdutosEstoque(String NumeroProdutosEstoque) {
        this.NumeroProdutosEstoque = NumeroProdutosEstoque;
    }

    public String getNumeroProdutosVendidos() {
        return NumeroProdutosVendidos;
    }

    public void setNumeroProdutosVendidos(String NumeroProdutosVendidos) {
        this.NumeroProdutosVendidos = NumeroProdutosVendidos;
    }

    public String getNumeroProdutosAVenda() {
        return NumeroProdutosAVenda;
    }

    public void setNumeroProdutosAVenda(String NumeroProdutosAVenda) {
        this.NumeroProdutosAVenda = NumeroProdutosAVenda;
    }
    
}
