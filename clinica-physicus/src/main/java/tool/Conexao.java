package tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static Connection obterConexao() {
        try {
            String url = "jdbc:postgresql://200.18.128.56:5432/physicus"; //casa: 200.18.128.56 escola: 10.90.24.56
            String usuario = "luisleao";
            String senha = "Yoda2023";

            Connection con = DriverManager.getConnection(url, usuario, senha);
            return con;
        } catch (java.sql.SQLException ex) {
            System.out.println("Erro ao conectar no banco: " + ex.getMessage());
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
