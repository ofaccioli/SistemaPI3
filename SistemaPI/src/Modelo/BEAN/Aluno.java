/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.BEAN;

/**
 *
 * @author otavi
 */
public class Aluno {
    
   private String Nome;
   private String CPF;
   private String Nascimento;
   private String Email;
   private String Login;
   private String Senha;
   private String Curso;

   public Aluno(){
       this.Nome = "";
        this.CPF = "";
        this.Nascimento = "";
        this.Email = "";
        this.Login = "";
        this.Senha = "";
        this.Curso = "";
       
   }
  
   
    public Aluno(String Nome, String CPF, String Nascimento, String Email, String Login, String Senha) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Nascimento = Nascimento;
        this.Email = Email;
        this.Login = Login;
        this.Senha = Senha;
    }

   
   
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
   
   public String toString(){
       return "Nome: " + this.Nome +
               "\nCPF: " + this.CPF +
               "\nNascimento: " + this.Nascimento +
               "\nE-mail: " + this.Email +
               "\nCurso: " + this.Curso +
               "\nUsuario: " + this.Login;        
       
   }
}
