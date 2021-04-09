package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private float num1=1;
	private float num2=2;
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public Calculadora(float num1, float num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}





	public float sumar() {
		return num1+num2;
	}
	
	public float restar() {
		return num1-num2;
	}
	
	public float dividir() {
		if(num2 == 0) {
			System.out.print("no se puede dividir por ");
			return 0;
		}
		else {
			return num1/num2;
		}
	}

	public float multiplicar() {
		return num1*num2;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
}
