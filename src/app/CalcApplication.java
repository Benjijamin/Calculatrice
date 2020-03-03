package app;
import controlleurs.CalcController;
import javafx.application.Application;
import javafx.stage.Stage;
import vues.CalcView;

public class CalcApplication extends Application{
	
	private CalcController controller;
	
	@Override
	public void start(Stage stage) {
		controller = new CalcController();
		stage.setTitle("Calculatrice");
		stage.setScene(controller.getScene());
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
