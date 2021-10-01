package com.ak;

import java.sql.*;

public class QueryStatement {
    public static void main(String[] args) {
        try {
            String connectionString = "jdbc:sqlite:\\F:\\Learning stuff\\TestDB\\entertainment.db";
            Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            statement.execute("SELECT * FROM Movies");
            ResultSet results = statement.getResultSet();
            while(results.next()){
                String movieName = results.getString("movie_name");
                String actor = results.getString("actor");
                String actress = results.getString("actress");
                String director = results.getString("director");
                String yearOfRelease = results.getString("yearOfRelease");
                System.out.println(movieName+"-> "+actor+"-> "+actress+"-> "+director+"-> "+yearOfRelease);
            }
            results.close();
            statement.close();
            connection.close();
        }catch(SQLException e){
            System.out.println("something went wrong: "+e.getMessage());
        }
    }
}
