package controlleurs;

import javafx.event.*;
import javafx.scene.Scene;
import model.CalcModel;
import vues.CalcView;

public class CalcController {

	private CalcView view;
	private CalcModel model;

	public CalcController() {
		this.view = new CalcView(this);
		this.model = new CalcModel();

		view.setActionDivise(new CalculDivise());
		view.setActionMulti(new CalculMulti());
		view.setActionPlus(new CalculPlus());
		view.setActionMoins(new CalculMoins());
	}

	public Scene getScene() {
		return this.view.getScene();
	}

	private class CalculDivise implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			double res;
			try {
				model.setModel(view.getModel());
				res = model.division();
				view.setReponse(model.getNum1() + " / " + model.getNum2() + " = " + res);
			} catch (NumberFormatException e) {
			}
		}
	}
	
	private class CalculMulti implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			double res;
			try {
				model.setModel(view.getModel());
				res = model.multi();
				view.setReponse(model.getNum1() + " * " + model.getNum2() + " = " + res);
			} catch (NumberFormatException e) {
			}
		}
	}
	
	private class CalculPlus implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			double res;
			try {
				model.setModel(view.getModel());
				res = model.plus();
				view.setReponse(model.getNum1() + " + " + model.getNum2() + " = " + res);
			} catch (NumberFormatException e) {
			}
		}
	}
	
	private class CalculMoins implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			double res;
			try {
				model.setModel(view.getModel());
				res = model.moins();
				view.setReponse(model.getNum1() + " - " + model.getNum2() + " = " + res);
			} catch (NumberFormatException e) {
			}
		}
	}
}
