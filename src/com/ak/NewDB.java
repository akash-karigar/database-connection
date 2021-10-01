package com.ak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewDB {
    public static void main(String[] args) {
        try {
            String connectionString = "jdbc:sqlite:\\F:\\Learning stuff\\TestDB\\entertainment.db";
            Connection connection = DriverManager.getConnection(connectionString);
            connection.close();
        }catch(SQLException e){
            System.out.println("something went wrong: "+e.getMessage());
        }
    }
}
