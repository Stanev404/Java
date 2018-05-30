/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author STAN-PC
 */
public class HW8F82876 extends Application {
    public void start(Stage primaryStage) {
        
    BorderPane root = new BorderPane();
    
        MenuBar mainmenu = new MenuBar();
        Menu menu1 = new Menu("_Pets",new ImageView("Icons/pets.png")); // mnemonics
        Menu ListMenu = new Menu("_List"); // mnemonics
        root.setTop(mainmenu);
        
        mainmenu.getMenus().add(menu1);
        
        MenuItem register = new MenuItem("Register",new ImageView("Icons/register.png"));
        register.setAccelerator(KeyCombination.keyCombination("shortcut+r")); // shortcut
        MenuItem exit = new MenuItem("Exit",new ImageView("Icons/exit.png"));
        exit.setAccelerator(KeyCombination.keyCombination("shortcut+e")); // shortcut
       
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        
        
        
        menu1.getItems().addAll(register,ListMenu,separatorMenuItem,exit);
        MenuItem dogs = new MenuItem("Dogs",new ImageView("Icons/dog.png"));
        dogs.setAccelerator(KeyCombination.keyCombination("shortcut+d"));
        MenuItem allPets = new MenuItem("All Pets",new ImageView("Icons/allPets.png"));
        allPets.setAccelerator(KeyCombination.keyCombination("shortcut+a"));
        MenuItem cats = new MenuItem("Cats",new ImageView("Icons/cat.png"));
        cats.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
        
        EventHandler<ActionEvent> MEHandler;
        MEHandler = (ActionEvent ae) -> {
            String name = ((MenuItem) ae.getTarget()).getText();
            if (name.equals("Exit")) {
                Platform.exit();
            }
    };
            exit.setOnAction(MEHandler);        
        ListMenu.getItems().addAll(allPets,dogs,cats);
        
        //interface
        
       
       
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
        //gridPane.gridLinesVisibleProperty().set(true);
        
        Label enterinfo = new Label("Enter info about the pet:");
        GridPane.setConstraints(enterinfo,1,0);
        Label nameLabel = new Label("Name: ");
        GridPane.setConstraints(nameLabel, 0, 1);
        
        TextField nameTextField = new TextField();
        GridPane.setConstraints(nameTextField, 1, 1);
        nameTextField.setPromptText("Pet's name");
        
        
        Label dateLabel = new Label("Date of birth: ");
        GridPane.setConstraints(dateLabel, 0, 2);
        
        DatePicker datePicker = new DatePicker();
        GridPane.setConstraints(datePicker, 1, 2);
        
        Label kindLabel = new Label("Kind: ");
        GridPane.setConstraints(kindLabel, 0, 3);
        
        RadioButton dog = new RadioButton("dog");
        RadioButton cat = new RadioButton("cat");
        FlowPane radioPane = new FlowPane();
        
        radioPane.setVgap(10);
        radioPane.setHgap(10);
        GridPane.setConstraints(radioPane, 1, 3);
        radioPane.getChildren().addAll(dog,cat);
        ToggleGroup dogCat = new ToggleGroup();
        dog.setToggleGroup(dogCat);
        cat.setToggleGroup(dogCat);

        
        
        Label genderLabel = new Label("Gender: ");
        GridPane.setConstraints(genderLabel, 0, 4);
        
        RadioButton male = new RadioButton("male");
        RadioButton female = new RadioButton("female");
        FlowPane genderPane = new FlowPane();
        
        genderPane.setVgap(10);
        genderPane.setHgap(10);
        GridPane.setConstraints(genderPane, 1, 4);
        genderPane.getChildren().addAll(male,female);
        ToggleGroup maleFemale = new ToggleGroup();
        male.setToggleGroup(maleFemale);
        female.setToggleGroup(maleFemale);
        
        Label breedLabel = new Label("Breed: ");
        GridPane.setConstraints(breedLabel, 0, 5);
        
        final String[] dogBreeds = {"Beagle", "Doberman", "Labrador", "Mops"};     
        final String[] catBreeds = {"Persian", "Angora", "Norwegian"}; 
        final ObservableList<String> breedDogTypes = FXCollections.observableArrayList(dogBreeds);         
        final ObservableList<String> breedCatTypes = FXCollections.observableArrayList(catBreeds); 
 
        dog.setUserData("dog");    
        cat.setUserData("cat"); 
 
        ComboBox<String> comboBoxBreed = new ComboBox<>(); 
        comboBoxBreed.setItems(breedDogTypes);
        comboBoxBreed.setPromptText("Select Breed");
        GridPane.setConstraints(comboBoxBreed, 1, 5);
        dogCat.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {            
            @Override
            public void changed(ObservableValue<? extends Toggle> ov,Toggle old_toggle, Toggle new_toggle) {                 
                if (dogCat.getSelectedToggle() != null) {                     
                    if (dogCat.getSelectedToggle().getUserData().toString().equals("dog")) {                         
                        comboBoxBreed.setItems(breedDogTypes);                     } 
                    else {                         
                        comboBoxBreed.setItems(breedCatTypes);                     }
                } 
            }         
        });
        
        Label charLabel  = new Label("Characteristics: ");
        GridPane.setConstraints(charLabel, 0, 7);
        
        CheckBox cbLongCoat = new CheckBox("Long Coat");
        GridPane.setConstraints(cbLongCoat, 1, 6);
        CheckBox cbAggressive = new CheckBox("Aggressive");
        GridPane.setConstraints(cbAggressive, 1, 7);
        CheckBox cbAppropriate = new CheckBox("Appropriate for Kids");
        GridPane.setConstraints(cbAppropriate, 1, 8);
        
        Button save = new Button("Save");
        GridPane.setConstraints(save,1,9);
        
        save.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent ae) {
        //System.out.println("Name: " + name_tf.getText());
        String name = nameTextField.getText();
       
        //System.out.println("Address: " + address_tf.getText());
        LocalDate calendar = datePicker.getValue();
            //System.out.println(calendar);
       
            
            
        RadioButton selectedRadioButton = (RadioButton) dogCat.getSelectedToggle();
        String kind = selectedRadioButton.getText();
          //  System.out.println(kind);
        boolean isDog = false;
        if("dog".equals(kind)){
            isDog = true;
        }
        
        RadioButton selectedRadioButton2 = (RadioButton) maleFemale.getSelectedToggle();
        String gender = selectedRadioButton2.getText();
        boolean isMale = false;
        if("male".equals(gender)){
            isMale = true;
        }
        
        
        
        
//             System.out.println("Toggled: " + swimmingpool);
//             
        String breed = comboBoxBreed.getValue();
        //System.out.println("Category: " + breed);
        
        boolean longCoat = false,aggressive = false,appropriateForKids = false;
        
        if(cbLongCoat.isSelected()){
            longCoat = true;
        }
        if(cbAggressive.isSelected()){
            aggressive = true;
        }
        if(cbAppropriate.isSelected()){
            appropriateForKids = true;
        }
        
        Pet curr = new Pet(name, calendar,isMale,isDog , breed, longCoat, aggressive, appropriateForKids);
            //System.out.println(curr);
        
        try(FileWriter fw = new FileWriter("pets.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw)) {
            out.println(curr);
        } 
        catch (IOException ex) {
             System.out.println("Exception caught: " + ex);
            }
        
               
               
                    }}); 
        
        
        //titlePane.getChildren().add(enterinfo);
        gridPane.getChildren().addAll(enterinfo,nameLabel,nameTextField,
                dateLabel,datePicker,kindLabel,radioPane,
                genderLabel,genderPane,breedLabel,comboBoxBreed,charLabel,
                cbLongCoat,cbAggressive,cbAppropriate,save);
        
        //mainFlowPane.getChildren().addAll(enterinfo,gridPane);
        //root.setCenter(mainFlowPane);
        root.setCenter(gridPane);
        



        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Pets Shop");
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