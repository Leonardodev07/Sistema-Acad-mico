package SistemaAcademico.util;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}