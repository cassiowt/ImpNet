package com.impnet.model;

public class Bhaskara {
	private float x1, x2;
	private int a, b, c;
	private float delta;

	public Bhaskara() {
		
	}

	public float getX1() {
		return x1;
	}

	public float getX2() {
		return x2;
	}

	public float calculoDelta() {
		this.delta = (float) (this.b ^ this.b - 4 * this.a * this.c);
		return delta;

	}

	public float calculoRaizUm() {
		this.x1 = (float) ((-this.b + Math.sqrt(this.delta)) / 2 * this.a);

		return this.x1;
	}

	public float calculoRaizDois() {
		this.x2 = (float) ((-this.b - Math.sqrt(this.delta)) / 2 * this.a);
		return this.x2;
	}

	public float resultado(int a, int b, int c, char raiz) {
		float x = 0;
		try {
			this.a = a;
			this.b = b;
			this.c = c;

			if (this.calculoDelta() < 0) {
				throw new IllegalArgumentException("entao a equacao nao tem raizes reais");
			}
			


		} catch (Exception e) {
			e.printStackTrace();
		}
		switch (raiz) {
		case '1':
			x = this.calculoRaizUm();;
			break;
		case '2':	
		default:
			x = this.calculoRaizDois();
			break;
		}
		//System.out.println(" Araizes s�o x1 = " + x + " e x2 = " + x);
		return x;
	}

	public static void main(String[] args) {
		Bhaskara bhak = new Bhaskara();
		bhak.resultado(1, -4, 1,'1');

	}
}
