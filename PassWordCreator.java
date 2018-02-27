import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PassWordCreator extends Application
{
	public void start(Stage primaryStage)
	{
		Scene scene = new Scene(new PassWordPane(), 300, 150);

		primaryStage.setTitle("James' PassWord Creator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}