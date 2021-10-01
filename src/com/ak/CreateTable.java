package com.ak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            String connectionString = "jdbc:sqlite:\\F:\\Learning stuff\\TestDB\\entertainment.db";
            Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE Movies(movie_name TEXT, actor TEXT, actress TEXT, director TEXT, yearOfRelease INTEGER)");
            statement.close();
            connection.close();
        }catch(SQLException e){
            System.out.println("something went wrong: "+e.getMessage());
        }
    }
}
