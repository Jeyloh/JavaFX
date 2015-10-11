/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_14_javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



/**
 *
 * @author Tyrion
 */
public class firstClass extends Application{
    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        //Constructor Scene(node, width, height)
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //main is needed if you're not launching from command line 
    public static void main(String[] args) {
        //launch is a method from Application used to launch JavaFX applications
        Application.launch(args);
    }
    
    
}
