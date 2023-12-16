package br.com.alura.bytebank;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
/*Os padrões factory têm como principal objetivo nos auxiliar a reduzir acoplamento em nosso software, ou seja,
manter dependências flexíveis*/
    public Connection recuperarConexao() {
        try {
            return createDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //método do driver HikariCP para gerenciar a quantidade de conexões com o banco de dados
    private HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/byte_bank");
        config.setUsername("root");
        config.setPassword("1007");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}