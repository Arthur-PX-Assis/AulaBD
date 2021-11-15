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
import my.model.funcionario;

/**
 *
 * @author usuario
 */
public class funcionarioDAO {
    public void inserirProduto(funcionario f){
        try {
            String SQL="INSERT INTO funcionario(CPFFuncionario, NomeFuncionario, TelefoneFuncionario, EmailFuncionario, Cargo, CodigoFuncionario, IdadeFuncionario, CargaHorariaDia, Salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection minhaConexao=conexao.getConexao();
            PreparedStatement comando=minhaConexao.prepareStatement(SQL);
            comando.setString(0, f.getCPFFuncionario());
            comando.setString(1, f.getNomeFuncionario());
            comando.setString(2, f.getTelefoneFuncionario());
            comando.setString(3, f.getEmailFuncionario());
            comando.setString(4, f.getCargo());
            comando.setString(5, f.getCodigoFuncionario());
            comando.setString(6, f.getIdadeFuncionario());
            comando.setString(7, f.getCargaHorariaDia());
            comando.setString(8, f.getSalario());
            int retorno=comando.executeUpdate();
            if(retorno>0){
                JOptionPane.showMessageDialog(null, "Funcionário(a) "+f.getNomeFuncionario()+" inserido(a).");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao inserir o(a) funcionário(a): "+f.getNomeFuncionario()+". Verifique os valores.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(produtoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
