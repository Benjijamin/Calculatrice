package controlleurs;

import javafx.event.*;
import javafx.scene.Scene;
import vues.CalcView;

public class CalcController implements EventHandler<ActionEvent>{
	private CalcView view;
	
	public CalcController() {
		this.view = new CalcView(this);
	}
	
	@Override
	public void handle(ActionEvent event) {
		
	}
	
	public Scene getScene() {
		return this.view.getScene();
	}
	
}
