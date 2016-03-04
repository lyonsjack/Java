package javafxchapter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 
import javafx.scene.control.RadioButton; 
import javafx.scene.control.ToggleGroup;
import java.util.Random;


public class HOTController {
	@FXML
	private Button btn_flip;
	
	@FXML
	private RadioButton heads;
	
	@FXML
	private RadioButton tails;
	
	@FXML
	private Label compCount;
	
	@FXML
	private Label userCount;
	
	@FXML
	private Label outputLabel;
	
	@FXML
	private ImageView result;
	
	private Image heads_img;
	private Image tails_img;
	
	public void initialize() {
		heads_img = new Image("heads.jpg"); 
		tails_img = new Image("tails.jpg");
	}
	
	public void flipButtonListener() {
		Random rand = new Random(); 
		int value = rand.nextInt(1);
		
		if(value == 0) {
			result.setImage(heads_img);
			outputLabel.setText("The result is heads"); 
		}
		else if (value == 1) {
			result.setImage(tails_img);
			outputLabel.setText("The result is tails");
		}
		
		
	}
}
