package com.menu.custom;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.image.*;

public class GameMenu extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		Pane root = new Pane();
		root.setPrefSize(800, 600);
		
		InputStream iStream = Files.newInputStream(Paths.get("res/background.jpg"));	
		Image img = new Image(iStream);
		iStream.close();
		
		ImageView imgView = new ImageView(img);
		
		root.getChildren().addAll(imgView);
		Scene scene = new Scene(root);
		primary
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
