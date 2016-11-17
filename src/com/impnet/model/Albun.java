package com.impnet.model;

import java.util.Date;

public class Albun extends Foto {
	private static final float PRECO_UNITARIO_ALBUN =  4.00f;
	private int numeroFotosAlbun;
	
	public Albun() {}
	
	public Albun(int codigo, int numeroCopias, Date dataEntrega, Date dataPedido, int numeroFotosAlbun) {
		super(codigo, numeroCopias, dataEntrega, dataPedido);
		this.numeroFotosAlbun = numeroFotosAlbun;
	}

	public int getNumeroFotosAlbun() {
		return numeroFotosAlbun;
	}

	public void setNumeroFotosAlbun(int numeroFotosAlbun) {
		this.numeroFotosAlbun = numeroFotosAlbun;
	}

	public static float getPrecoUnitarioAlbun() {
		return PRECO_UNITARIO_ALBUN;
	}

	@Override
	public String toString() {
		return "Albun [numeroFotosAlbun=" + numeroFotosAlbun + "," + super.toString() + "]";
	}
	
	
	
}
