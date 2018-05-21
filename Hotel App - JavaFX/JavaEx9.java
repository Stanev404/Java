/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author STAN-PC
 */
public class JavaEx9 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        primaryStage.setTitle("Hotel app");

        
        FlowPane rootNode = new FlowPane();
        FlowPane name = new FlowPane();
        FlowPane address = new FlowPane();
        FlowPane swimmingPool = new FlowPane();
        FlowPane category = new FlowPane();
        FlowPane facilities = new FlowPane();
        FlowPane show_info = new FlowPane();
        FlowPane save_deserialize = new FlowPane();
        
        name.setHgap(10);
        address.setHgap(10);
        swimmingPool.setHgap(10);
        rootNode.setVgap(10);
        category.setHgap(10);
        facilities.setHgap(10);
        show_info.setVgap(10);
        save_deserialize.setHgap(10);
        
        rootNode.setPadding(new Insets(10, 10, 10, 10));
        
        ImageView hotelicon = new ImageView("hotel.png");
       
        Label enter_info = new Label("Enter info about the hotel:",hotelicon);
        Label enter_name = new Label("Name: ");
        Label enter_address = new Label("Address: ");
        Label isSwimmingPool = new Label("Swimming pool: ");
        Label category_text = new Label("Category: ");
        Label facilities_text = new Label("Facilities: ");
        Label deserialisation = new Label("Deserialized Data");
        
        TextField name_tf = new TextField();
        TextField address_tf = new TextField();
        RadioButton yes = new RadioButton("yes");
        RadioButton no = new RadioButton("no");
        ToggleGroup yesNo = new ToggleGroup();
        yes.setToggleGroup(yesNo);
        no.setToggleGroup(yesNo);
        ObservableList<String> category_types = FXCollections.observableArrayList( "One Star", "Two Stars", "Three Stars", "Four Stars","Five Stars");
        ComboBox<String> cbCategory = new ComboBox<String>(category_types);
        cbCategory.setValue("Three Stars");
        CheckBox cbParking = new CheckBox("parking");
        CheckBox cbAnimators = new CheckBox("animators");
        CheckBox cbFitness = new CheckBox("fitness");
        CheckBox cbSauna = new CheckBox("sauna");
        Separator separator_line = new Separator();
        separator_line.setPrefWidth(400);
        Separator separator_line2 = new Separator();
        separator_line2.setPrefWidth(400);
        Button save = new Button("Save",new ImageView("save.png")); 
        Button deserialize = new Button("Deserialize",new ImageView("deserialize.png")); 




        name_tf.setPromptText("Name");
        address_tf.setPromptText("Address");
        
        name.getChildren().addAll(enter_name,name_tf);
        address.getChildren().addAll(enter_address,address_tf);
        swimmingPool.getChildren().addAll(isSwimmingPool,yes,no);
        category.getChildren().addAll(category_text,cbCategory);
        facilities.getChildren().addAll(facilities_text,cbParking,cbAnimators,cbFitness,cbSauna);
        show_info.getChildren().addAll(separator_line,deserialisation,separator_line2);
        save_deserialize.getChildren().addAll(save,deserialize);
       // show_info.setAlignment(Pos.CENTER_RIGHT);
        
        
        rootNode.getChildren().addAll(enter_info,name,address,swimmingPool,category,facilities,show_info,save_deserialize);
        
        
        
        Scene myScene = new Scene(rootNode,400,500);
        
        
        save.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent ae) {
        System.out.println("Name: " + name_tf.getText());
        String name = name_tf.getText();
        
        System.out.println("Address: " + address_tf.getText());
        String address = address_tf.getText();
        
        RadioButton selectedRadioButton = (RadioButton) yesNo.getSelectedToggle();
        String swimmingpool = selectedRadioButton.getText();
        boolean hasSwimmingpool = false;
        if("yes".equals(swimmingpool)){
            hasSwimmingpool = true;
        }
             System.out.println("Toggled: " + swimmingpool);
             
             String category = cbCategory.getValue();
             System.out.println("Category: " + category);
             
             boolean hasParking = false,hasAnimators = false,hasFitness = false,hasSauna = false;
             if (cbParking.isSelected()){
                hasParking = true;
                }
             if (cbAnimators.isSelected()){
                 hasAnimators = true;
                }
             if (cbFitness.isSelected()){
                 hasFitness = true;
                }
             if (cbSauna.isSelected()){
                 hasSauna = true;
                }
             // Do something here with the userData of newly selected radioButton
                
                Hotel current = new Hotel(name,address,hasSwimmingpool,category,hasParking,hasAnimators,hasFitness,hasSauna);
                try (FileOutputStream fos = new FileOutputStream("currenthotel.ser"); ObjectOutputStream outputStream = new ObjectOutputStream(fos)) {
                
                outputStream.writeObject(current);
                
                
                    } 
        catch (IOException ex) {
        System.err.println("IOException is caught." + ex);
        }
                
                
                System.out.println(current.toString());
        

     }
        
});
        
         deserialize.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent ae) {
            try(FileInputStream fin = new FileInputStream("currenthotel.ser");
                ObjectInputStream ois = new ObjectInputStream(fin)){
                 
                //deserialization
                
                
                Hotel read_hotel = (Hotel) ois.readObject();
                deserialisation.setText(read_hotel.toString());

                //System.out.println(read_good);
                
            } catch (FileNotFoundException ex) {
                System.err.println("FileNotFoundException is caught." + ex);
            } catch (IOException ex) {
                System.err.println("IOException is caught." + ex);
            } catch (ClassNotFoundException ex) {
                System.err.println("ClassNotFoundException is caught." + ex);
            }
        }
         });
        
    

        
        

        
        //root.getChildren().add(btn);
        
        
        
        
        primaryStage.setScene(myScene);
        primaryStage.show();
    
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}