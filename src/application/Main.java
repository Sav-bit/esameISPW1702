package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("This is hangman!");
			
			GameDynamics thisGame = new GameDynamics();
			
			VBox root = new VBox();
			Scene scene = new Scene(root,1520, 480);
			primaryStage.setScene(scene);
			TextField calculatorDisplay = new TextField();
			calculatorDisplay.setPrefHeight(80);
			calculatorDisplay.setPrefWidth(1000);
			
			//declaring the first row
			HBox zerothRow = new HBox();
			Button buttonTry = new Button("Prova parola");
			buttonTry.setPrefHeight(80);
			
			buttonTry.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						if (thisGame.tryWord(calculatorDisplay.getText()))
							calculatorDisplay.setText("hai vinto!");
						else
							calculatorDisplay.setText("Parola sbagliata, la parola ha "+thisGame.getLen()+" lettere!");
					}
			});
			
			zerothRow.getChildren().addAll(buttonTry,calculatorDisplay);
			zerothRow.setAlignment(Pos.CENTER);
			
			root.getChildren().add(zerothRow);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
