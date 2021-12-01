/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.BEAN.Aluno;
import java.sql.*;
import Conexao.Conexao;
/**
 *
 * @author otavi
 */
public class AlunoDAO {
    
    public String salvar(Aluno a) {
     
        String erro = "";
        
        try{
            
            Connection conexao = Conexao.conectar();
            
            String sql = "INSERT INTO TBALUNOUSUARIO VALUES (?,?,?,?,?,?,?,?,1)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, a.getCurso());
            stmt.setString(2, a.getCPF());
            stmt.setString(2, a.getNascimento());
            stmt.setString(2, a.getEmail());
            stmt.setString(2, a.getLogin());
            stmt.setString(2, a.getSenha());
            Conexao.desconectar();
            
        } catch (SQLException e) {
            erro = "Ocorreu um erro ao Salvar" + e.getMessage();
        }
        
        return erro;
    }
}
