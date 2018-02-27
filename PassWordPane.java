import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.Random;

public class PassWordPane extends GridPane
{
	private Label result, title, yourName, inputDate;
	private TextField name, date;

	public PassWordPane()
	{
		Font font = new Font(18);

		Label title = new Label("James' Password Creator");
		title.setFont(font);
		GridPane.setHalignment(title, HPos.LEFT);

		Label yourName = new Label("Your Name:");
		yourName.setFont(font);
		GridPane.setHalignment(yourName, HPos.RIGHT);

		Label inputDate = new Label("Date number:");
		inputDate.setFont(font);
		GridPane.setHalignment(inputDate, HPos.RIGHT);

		result = new Label("---");
		result.setFont(font);
		GridPane.setHalignment(result, HPos.CENTER);

		name = new TextField();
		name.setFont(font);
		name.setPrefWidth(100);
		name.setAlignment(Pos.CENTER);
		name.setOnAction(this::processReturn);
		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: yellow");

		date = new TextField();
		date.setFont(font);
		date.setPrefWidth(100);
		date.setAlignment(Pos.CENTER);
		date.setOnAction(this::processReturn);
		setAlignment(Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: yellow");


		add(title, 0, 0);
		add(yourName, 0, 1);
		add(name, 1, 1);
		add(inputDate, 0, 2);
		add(date, 1, 2);
		add(result, 0, 3);
	}

	public void processReturn(ActionEvent event)
	{

		String mutation = name.getText();
		mutation = mutation.substring(0, 2);

		Random generator = new Random();
		int randomNumber;
		randomNumber = generator.nextInt(100);

		String mutation2 = date.getText();
		mutation2 = mutation2.substring(mutation2.length()-4);

		result.setText(mutation + "." + randomNumber + mutation2);
	}
}