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
import my.model.produto;
import my.conexao.conexao;
/**
 *
 * @author usuario
 */
public class produtoDAO {

    public produtoDAO() {
    }
    
    public void inserirProduto(produto p){
        try {
            String SQL="INSERT INTO produto(NomeProduto, Stauts, Cor, CodigoProduto, Quantidade, Valor) VALUES (?, ?, ?, ?, ?, ?)";
            Connection minhaConexao=conexao.getConexao();
            PreparedStatement comando=minhaConexao.prepareStatement(SQL);
            comando.setString(0, p.getNomeProduto());
            comando.setString(1, p.getStatus());
            comando.setString(2, p.getCor());
            comando.setString(3, p.getCodigoProduto());
            comando.setString(4, p.getQuantidade());
            comando.setString(5,p.getValor());
            int retorno=comando.executeUpdate();
            if(retorno>0){
                JOptionPane.showMessageDialog(null, "Produto "+p.getNomeProduto()+" inserido.");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao inserir o produto: "+p.getNomeProduto()+". Verifique os valores.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
