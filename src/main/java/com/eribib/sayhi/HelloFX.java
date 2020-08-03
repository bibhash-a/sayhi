package com.eribib.sayhi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage primaryStage) {
		StackPane layout = new StackPane();
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		
		Button button1 = new Button("Click me");
		layout.getChildren().add(button1);
		
		Label label1 = new Label("Hello, Bibhash " + javafxVersion + ", running on Java " + javaVersion + ".");
		label1.setMaxWidth(Double.MAX_VALUE);
		layout.getChildren().add(label1);
		
		Scene newscene = new Scene(layout, 300, 250);
		primaryStage.setScene(newscene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}