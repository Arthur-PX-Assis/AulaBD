/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import my.conexao.conexao;
import my.model.loja;

/**
 *
 * @author usuario
 */
public class lojaDAO {
    public void inserirLoja(loja l){
        try {
            String SQL="INSERT INTO loja(EnderecoLoja, CodigoLoja, NumeroFuncionarios, NumeroProdutosEstoque, NumeroProdutosVendidos, NumeroProdutosAVenda) VALUES (?, ?, ?, ?, ?, ?)";
            Connection minhaConexao=conexao.getConexao();
            PreparedStatement comando=minhaConexao.prepareStatement(SQL);
            comando.setString(0, l.getEnderecoLoja());
            comando.setString(1, l.getCodigoLoja());
            comando.setString(2, l.getNumeroFuncionarios());
            comando.setString(3, l.getNumeroProdutosEstoque());
            comando.setString(4, l.getNumeroProdutosVendidos());
            comando.setString(5, l.getNumeroProdutosAVenda());
            int retorno=comando.executeUpdate();
            if(retorno>0){
                JOptionPane.showMessageDialog(null, "Loja no endereço  "+l.getEnderecoLoja()+" inserida.");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao inserir a loja do endereço: "+l.getEnderecoLoja()+". Verifique os valores.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
