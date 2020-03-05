package vues;

import controlleurs.CalcController;
import javafx.beans.value.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.*;
import model.CalcModel;

public class CalcView {
	private Scene scene;
	private CalcController controller;

	// Controls
	private Button bDivise;
	private Button bMulti;
	private Button bPlus;
	private Button bMoins;
	private TextField num1;
	private TextField num2;
	private Label reponse;
	private Button bEffacer;

	public CalcView(CalcController controller) {
		this.controller = controller;
		construireInterface();
	}

	public Scene getScene() {
		return this.scene;
	}

	private void construireInterface() {
		scene = new Scene(center());

		scene.getStylesheets().setAll(this.getClass().getResource("/css/calc.css").toString());
	}

	private GridPane center() {
		GridPane gp = new GridPane();
		gp.setId("grid");

		bDivise = new Button("/");
		bMulti = new Button("*");
		bPlus = new Button("+");
		bMoins = new Button("-");

		// Effacer
		bEffacer = new Button("Effacer");

		// nums
		num1 = new TextField();
		num2 = new TextField();

		reponse = new Label("");

		// events
		bEffacer.setOnAction(e -> {
			num1.setText("");
			num2.setText("");
			reponse.setText("");
		});

		GridPane.setConstraints(bDivise, 0, 0, 1, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(bMulti, 1, 0, 1, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(bPlus, 0, 1, 1, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(bMoins, 1, 1, 1, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(num1, 0, 2, 1, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(num2, 1, 2, 1, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(reponse, 0, 3, 2, 1, HPos.CENTER, VPos.CENTER);
		GridPane.setConstraints(bEffacer, 0, 4, 2, 1, HPos.CENTER, VPos.CENTER);
		gp.getChildren().addAll(bDivise, bMulti, bPlus, bMoins, num1, num2, reponse, bEffacer);

		return gp;
	}

	public void setActionDivise(EventHandler<ActionEvent> event) {
		bDivise.addEventHandler(ActionEvent.ACTION, event);
	}

	public void setActionMulti(EventHandler<ActionEvent> event) {
		bMulti.setOnAction(event);
	}

	public void setActionPlus(EventHandler<ActionEvent> event) {
		bPlus.addEventHandler(ActionEvent.ACTION, event);
	}

	public void setActionMoins(EventHandler<ActionEvent> event) {
		bMoins.addEventHandler(ActionEvent.ACTION, event);
	}

	public double getNum1() throws NumberFormatException {
		try {
			return Double.parseDouble(this.num1.getText());
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public double getNum2() throws NumberFormatException {
		try {
			return Double.parseDouble(this.num2.getText());
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public CalcModel getModel() {
		CalcModel model = new CalcModel();
		model.setNum1(getNum1());
		model.setNum2(getNum2());
		return model;
	}

	public void setReponse(String s) {
		this.reponse.setText(s);
	}

}
