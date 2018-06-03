

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
/**
 *
 * @author Lenovo
 */
public class exam2 extends Application {
   
    @Override
    public void start(Stage primaryStage) {
       
       
        GridPane gridPane = new GridPane();
       
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setHalignment(HPos.RIGHT);
        column1.setPercentWidth(100.0/3);
        gridPane.getColumnConstraints().add(column1);
 
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHalignment(HPos.LEFT);
        column2.setPercentWidth(100.0/2);
        gridPane.getColumnConstraints().add(column2);
       
        gridPane.setPadding(new Insets(20, 0, 0, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(14);
       
        Label enterinfo = new Label("Enter Data about the DanceClub:");
        GridPane.setConstraints(enterinfo,1,0);
       
        Label name = new Label("Name:");
        GridPane.setConstraints(name,0,1);
       
        Label numberOfPart = new Label("Number of Participants:");
        GridPane.setConstraints(numberOfPart,0,2);
       
        Label isForAdults = new Label("Is for Adults:");
        GridPane.setConstraints(isForAdults,0,3);
       
        TextField nameTextField = new TextField();
        GridPane.setConstraints(nameTextField, 1, 1);
        nameTextField.setPromptText("DanceClub name");
       
        TextField numberTextField = new TextField();
        GridPane.setConstraints(numberTextField, 1, 2);
        numberTextField.setPromptText("Number of Participants");
       
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        FlowPane yesNoPane = new FlowPane();
       
        yesNoPane.setVgap(10);
        yesNoPane.setHgap(10);
        GridPane.setConstraints(yesNoPane, 1, 3);
        yesNoPane.getChildren().addAll(yes,no);
        ToggleGroup yesNo = new ToggleGroup();
        yes.setToggleGroup(yesNo);
        no.setToggleGroup(yesNo);
       
        Button saveData = new Button("Save DanceClub Data");
        GridPane.setConstraints(saveData, 1, 4);
 
       
       
        gridPane.getChildren().addAll(enterinfo,name,numberOfPart,isForAdults,nameTextField,numberTextField,yesNoPane,saveData);
       
        saveData.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent ae) {
        System.out.println("Name: " + nameTextField.getText());
        System.out.println("Number of participants: " + numberTextField.getText());
       
       
        RadioButton selectedRadioButton2 = (RadioButton) yesNo.getSelectedToggle();
        String res = selectedRadioButton2.getText();
        System.out.println("Is for Adults: " + res);
        }});
       
        Scene scene = new Scene(gridPane, 600, 300);
       
        primaryStage.setTitle("DanceClub Data!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}