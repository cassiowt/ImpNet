package com.impnet.model;

import java.util.Date;

public class Quadro extends Foto {
	private static final float PRECO_UNITARIO_QUADRO = 30.00f;
	private float tamanho;
	
	public Quadro() {}

	public Quadro(int codigo, int numeroCopias, Date dataEntrega, Date dataPedido, float tamanho) {
		super(codigo, numeroCopias, dataEntrega, dataPedido);
		this.tamanho = tamanho;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public static float getPrecoUnitarioQuadro() {
		return PRECO_UNITARIO_QUADRO;
	}

	@Override
	public String toString() {
		return "Quadro [tamanho=" + tamanho + "," + super.toString() + "]";
	}
	
	
}
