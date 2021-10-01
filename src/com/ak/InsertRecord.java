package com.ak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            String connectionString = "jdbc:sqlite:\\F:\\Learning stuff\\TestDB\\entertainment.db";
            Connection connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('Barfi', 'Ranbir Kapoor', 'Priyanka Chopra', 'Anurag Basu', 2012)");
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('PK', 'Aamir Khan', 'Anushka Sharma', 'Rajkumar Hirani', 2014)");
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('Bajrangi Bhaijaan', 'Salman Khan', 'Harshaali Malhotra', 'Kabir Khan', 2015)");
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('Jab We Met', 'Shahid Kapoor', 'Kareena Kapoor', 'Imtiaz Ali', 2007)");
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('Baby', 'Akshay Kumar', 'Taapsee Pannu', 'Neeraj Pandey', 2015)");
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('Airlift', 'Akshay Kumar', 'Nimrat Kaur', 'Raja Menon', 2016)");
            statement.execute("INSERT INTO Movies (movie_name, actor, actress, director, yearOfRelease) VALUES ('Sanju', 'Ranbir Kapoor', 'Manisha Koirala', 'Rajkumar Hirani', 2018)");
            statement.close();
            connection.close();
        }catch(SQLException e){
            System.out.println("something went wrong: "+e.getMessage());
        }
    }
}
