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
 * 
 * How do you define a JavaFX main class? 
 *      public static void main(args[]) ** false
 *      public static void main(String[] args) ** correct
 * What is the signature of the start method? 
 *      public void start(Stage stageName)
 * What is a stage? 
 *      The main window for an application where you put all the nodes
 * What is a primary stage? 
 *      An object of Stage 
 * Is a primary stage automatically created? 
 *      Yes, in the signature of the start method. 
 * How do you display a stage? 
 *      stageName.show()
 * Can you prevent the user from resizing the stage? 
 *      stageName.resizable(false)
 * Can you replace Application.launch(args)by launch(args) in line 22 in Listing 14.1?
 *      Yes, because ClassName extends Application
 * 
 * 
 * 
 * @author jeyloh
 */
public class FirstClass extends Application{
    @Override //Run start() and create a Stage object named primaryStage
    public void start(Stage primaryStage) {
        //Create a scene and place a button in the scene
        //The scene object has 3 paramters, Scene(node/button, width, height)
        Scene scene = new Scene(new Button("OK"), 200, 250);
        //Imagine the stage as a platform to support scenes and nodes as actors to perform in the scenes
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Create the second stage with new values, both will show at runtime
        Stage secondStage = new Stage(); //new stage object
        secondStage.setTitle("Second Stage"); //decide stage title
        //Set a scene with a button in the stage
        secondStage.setScene(new Scene(new Button("New Stage"), 100, 100));
        secondStage.setResizable(false); //cant resize the second window
        secondStage.show();
    }
    
    //main is needed if you're not launching from command line 
    //this is always the same for any JavaFX source code
    public static void main(String[] args) {
        //launch is a method from Application used to launch JavaFX applications
        Application.launch(args);
    }
    
    
}
