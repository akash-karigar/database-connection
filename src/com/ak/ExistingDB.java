package com.ak;

import java.sql.*;

public class ExistingDB {
    public static void main(String[] args) {
        try {
            String connectionString = "jdbc:sqlite:\\F:\\Learning stuff\\TestDB\\testjava.db";
            Connection connection = DriverManager.getConnection(connectionString);

        }catch(SQLException e){
            System.out.println("something went wrong: "+e.getMessage());
        }
    }
}
