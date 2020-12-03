/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxanimationeffects;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author ddren
 */
public class FxAnimationEffects extends Application {
    
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
      
        //Creating Rectangle   
        Rectangle rect = new Rectangle(200,100,200,200);  
        rect.setFill(Color.BLUE);  // update colour
        rect.setStroke(Color.GREEN);  //Update colour
        rect.setStrokeWidth(5);  
          
        //Instantiating RotateTransition class   
        RotateTransition rotate = new RotateTransition();  
          
        //Setting Axis of rotation   
        rotate.setAxis(Rotate.X_AXIS);  
          
        // setting the angle of rotation   
        rotate.setByAngle(220);  
          
        //setting cycle count of the rotation   
        rotate.setCycleCount(500);  
          
        //Setting duration of the transition   
        rotate.setDuration(Duration.millis(2000));  
          
        //the transition will be auto reversed by setting this to true   
        rotate.setAutoReverse(true);  
              
        //setting Rectangle as the node onto which the   
// transition will be applied  
        rotate.setNode(rect);  
          
        //playing the transition   
        rotate.play();  
          
        //Configuring Group and Scene   
        Group root = new Group();  
        root.getChildren().add(rect);  
        Scene scene = new Scene(root,600,400,Color.RED);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Animation and Effects projects");  
        primaryStage.show();  
          
    }  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
