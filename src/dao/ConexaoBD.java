/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author peter
 */
public class ConexaoBD {
    
    //conexão do BD MySQL com a API jdbc
    public static Connection abreConexao() throws SQLException {
        //Representa uma conexão ao banco de dados
        Connection connect = null;
        
        /*Driver - Além de atuar como uma interface entre os SGBDs e as aplicações, também pode ser considerado
        como um tradutor que ajuda na definição das mensagens binárias trocadas com um protocolo de um SGBD*/
        String driverClass = "com.mysql.jdbc.Driver";
        
        //url - url que está localizada o banco
        String url = "jdbc:mysql://localhost:3306/construtora_rzm";
        //usuario - usuario do SGBD
        String usuario = "root";
        //senha - senha do SGBD
        String senha = "bdprojects";
        
        try {
            Class.forName(driverClass);
            /*DriveManager - Cada driver que se deseja a usar precisa ser registrado nessa classe, pois oferece
            métodos estáticos para gerenciar um driver JDBC*/
            connect = DriverManager.getConnection(url, usuario, senha);
            
            
        } catch (ClassNotFoundException error) {
            
            JOptionPane.showMessageDialog(null, "Erro ao conectar " + error.getMessage());
        } 
        
        //retorna a conexão
        return connect;

    }
}
