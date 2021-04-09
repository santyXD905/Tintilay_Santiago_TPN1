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

	@Override
	public String toString() {
		return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(num1);
		result = prime * result + Float.floatToIntBits(num2);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (Float.floatToIntBits(num1) != Float.floatToIntBits(other.num1))
			return false;
		if (Float.floatToIntBits(num2) != Float.floatToIntBits(other.num2))
			return false;
		return true;
	}
	
	
}
