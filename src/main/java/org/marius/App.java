package org.marius;

import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        String url = "jdbc:mysql://localhost:3306/papyrus?serverTimezone=UTC";
        String user = "admin";
        String pwd = "password";

        try {
            Connection con = DriverManager.getConnection(url , user,pwd);
            System.out.println("ça fonctionne !");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
