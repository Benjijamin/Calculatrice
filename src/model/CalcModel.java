package model;

public class CalcModel {
	private double num1;
	private double num2;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double division() {
		return num1 / num2;
	}
	
	public double multi() {
		return num1 * num2;
	}
	
	public double plus() {
		return num1 + num2;
	}
	
	public double moins() {
		return num1 - num2;
	}
	
	public void setModel(CalcModel model) {
		setNum1(model.getNum1());
		setNum2(model.getNum2());
	}

}
