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
            
            String sql = "INSERT INTO TBALUNOUSUARIO (CODCURSO, NOMEALUNO, CPFALUNO, DATANASCIMENTOALUNO, EMAILALUNO, LOGINUSUARIO, SENHAUSUARIO, CODPERFIL) VALUES (?,?,?,?,?,?,?,1)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, a.getCurso());
            stmt.setString(2, a.getNome());
            stmt.setString(3, a.getCPF());
            stmt.setString(4, a.getNascimento());
            stmt.setString(5, a.getEmail());
            stmt.setString(6, a.getLogin());
            stmt.setString(7, a.getSenha());
            stmt.execute();
            Conexao.desconectar();
            
        } catch (SQLException e) {
            erro = "Ocorreu um erro ao Salvar" + e.getMessage();
        }
        
        return erro;
    }
}
