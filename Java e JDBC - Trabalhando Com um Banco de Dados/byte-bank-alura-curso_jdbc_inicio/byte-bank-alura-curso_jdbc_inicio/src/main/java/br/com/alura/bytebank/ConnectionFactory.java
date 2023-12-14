package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
/*Os padrões factory têm como principal objetivo nos auxiliar a reduzir acoplamento em nosso software, ou seja,
manter dependências flexíveis*/
    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=1007");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}