import java.awt.Toolkit; 
import java.awt.datatransfer.DataFlavor; 
import java.awt.datatransfer.StringSelection; 
import java.awt.datatransfer.Transferable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 * This simple GUI program allows you to click a button to select a german character and replace it in your clipboard.
 * 
 * @author Bryan Ehrke
 *
 */
public class GUI extends Application {
	
	String status = "None";
	Label statusLabel = new Label();

	@Override
	public void start(Stage primaryStage) {

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 320, 120);

		scene.getStylesheets().add(getClass().getResource("gui.css").toExternalForm());

		primaryStage.setTitle("German Helper");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);


		root.setCenter(addButtons());
		root.setBottom(addStatus());


	}

	public HBox addButtons() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(6));
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(12);
		

		Button buttonä = new Button();
		buttonä.setText("ä");

		Button buttonö = new Button();
		buttonö.setText("ö");

		Button buttonü = new Button();
		buttonü.setText("ü");

		Button buttonß = new Button();
		buttonß.setText("ß");

		buttonä.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "ä";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in buttona");
				}
				
				status = "ä";
				
				statusLabel.setText("Last Pressed Button: " + status);

			}
		});

		buttonö.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			
				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "ö";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in buttonö");
				}

				status = "ö";
				
				statusLabel.setText("Last Pressed Button: " + status);
			}
		});

		buttonü.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "ü";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in buttonü");
				}
				
				status = "ü";
				
				statusLabel.setText("Last Pressed Button: " + status);
			}
		});

		buttonß.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "ß";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in buttonü");
				}
				
				status = "ß";
				
				statusLabel.setText("Last Pressed Button: " + status);
				
			}
		});


		hbox.getChildren().addAll(buttonä, buttonö, buttonü, buttonß);

		return hbox;
	}
	
	public HBox addStatus() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(6));
		hbox.setAlignment(Pos.CENTER);
		
		statusLabel.setText("Last Pressed Button: " + status);
		
		hbox.getChildren().add(statusLabel);
		
		return hbox;
	}

	public static void main(String[] args) {
		launch(args);
	}
}