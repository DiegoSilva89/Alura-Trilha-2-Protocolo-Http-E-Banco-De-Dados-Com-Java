package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Classe de conexão com o banco
public class ConexaoDB {
    public static void main(String... x) {

        //para conectar com o banco de dados da máquina, utiliza-se o try catch por conta do .getConnection
        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=1007");

            System.out.println("Recuperei a conexão");

            connection.close();

        } catch (SQLException e ) {
            System.out.println(e);
        }

    }
}
