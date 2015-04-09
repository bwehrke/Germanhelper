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
		

		Button button� = new Button();
		button�.setText("�");

		Button button� = new Button();
		button�.setText("�");

		Button button� = new Button();
		button�.setText("�");

		Button button� = new Button();
		button�.setText("�");

		button�.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "�";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in buttona");
				}
				
				status = "�";
				
				statusLabel.setText("Last Pressed Button: " + status);

			}
		});

		button�.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			
				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "�";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in button�");
				}

				status = "�";
				
				statusLabel.setText("Last Pressed Button: " + status);
			}
		});

		button�.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "�";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in button�");
				}
				
				status = "�";
				
				statusLabel.setText("Last Pressed Button: " + status);
			}
		});

		button�.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

				try {
					String text = (String)t.getTransferData(DataFlavor.stringFlavor);
					text = "�";
					StringSelection ss = new StringSelection(text);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				}

				catch (Exception e) {
					System.out.println("Catch happened in button�");
				}
				
				status = "�";
				
				statusLabel.setText("Last Pressed Button: " + status);
				
			}
		});


		hbox.getChildren().addAll(button�, button�, button�, button�);

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