package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
/**
 * JavaFX App
 */
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class App extends Application {
        @Override
        public void start(Stage stage) {
            var table = new TableView<Person>();
            table.getItems().addAll(
                    new Person("Adam", 21, Person.Gender.MALE),
                    new Person("Pioter", 37, Person.Gender.MALE),
                    new Person("Adrianna", 42, Person.Gender.FEMALE)
            );
            var nameColumn = new TableColumn<Person, String>("Name");
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
            var ageColumn = new TableColumn<Person, Integer>("Age");
            ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
            var genderColumn = new TableColumn<Person, Person.Gender>("Gender");
            genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
            table.getColumns().addAll(nameColumn, ageColumn, genderColumn);
            // ex2
            table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

            var button = new Button("Print info about selected");
            button.setOnMouseClicked(mouseEvent -> {
                var sb = new StringBuilder();
                for(Person p: table.getSelectionModel().getSelectedItems()) {
                    if(p.getAge() >= 30) {
                        sb.append(p.toString());
                        sb.append(System.lineSeparator());
                    }
                }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ur chosen People");
                alert.setHeaderText("List of people: ");
                alert.setContentText(sb.toString());

                alert.showAndWait();
            });
            var scene = new Scene(new StackPane(new VBox(button, table)), 640, 480);
            stage.setScene(scene);
            stage.show();
        }
        public static void main(String[] args) {
            launch();
        }
    }