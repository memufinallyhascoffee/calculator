package de.hannover.dorostimehrnoush;

import de.hannover.dorostimehrnoush.calculator.Calculator;
import de.hannover.dorostimehrnoush.util.Parser;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        Scene scene;
        StackPane pane = new StackPane();
        TextField textField = new TextField();
        float operators[] = new float[2];
        operators[1] = 0;
        operators[2] = 0;


        Parser parser = new Parser();
        operators = parser.getOperators(textField.getCharacters());


        /**
         * NummerButtons des Taschenrechners
         */
        Button buttons[] = new Button[10];

        for(int i = 0; i < 11; i++){
            buttons[i]= new Button(Integer.toString(i));
            buttons[i].getStylesheets().getClass().getResource("/ressources/Button.css");
        }

        /**
         * OperatorButtons des Taschenrechners
         */

        Button add = new Button();
        add.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        add.setOnAction(e -> Parser.evaluate());

        Button sub = new Button();
        sub.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        sub.setOnAction(e -> Parser.evaluate());

        Button mult = new Button();
        mult.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        mult.setOnAction(e -> Parser.evaluate());

        Button div = new Button();
        div.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        div.setOnAction(e -> Parser.evaluate());

        Button abs = new Button();
        abs.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        abs.setOnAction(e -> Parser.evaluate());

        Button pow = new Button();
        pow.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        pow.setOnAction(e -> Parser.evaluate());

        Button root = new Button();
        root.getStylesheets().getClass().getResource("/ressources/OpButton.css");
        root.setOnAction(e -> Parser.evaluate());


    }
}
