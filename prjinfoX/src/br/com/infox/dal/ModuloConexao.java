/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.dal;

  import java.sql.*;
/**
 *
 * @author William Matos
 */
public class ModuloConexao {
    // método responsável por estabelecer a conexão com o Banco de Dados
    
    public static Connection conector(){
         java.sql.Connection conexao = null;
         // a linha abaixo "chama" o driver
         String driver = "com.mysql.jdbc.Driver";
         //Armazenando informações referente ao banco
         String url = "jdbc:mysql://127.0.0.1:3306/dbinfox?characterEncoding=utf-8";
         String user = "dba";
         String password = "infox@123456";
         // Estabelendo a conexão com o banco
         try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
             System.out.println(e);
            return null;
        }
    }

    public static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
