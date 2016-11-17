package com.impnet.model;

import java.util.Date;

public class Foto {
	private int codigo;
	private static final float PRECO_UNITARIO_FOTO =  10.00f;
	private int numeroCopias;
	private Date dataEntrega;
	private Date dataPedido;

	public Foto() {	}
	
	public Foto(int codigo, int numeroCopias, Date dataEntrega, Date dataPedido) {
		this.codigo = codigo;
		this.numeroCopias = numeroCopias;
		this.dataEntrega = dataEntrega;
		this.dataPedido = dataPedido;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static float getPrecoUnitarioFoto() {
		return PRECO_UNITARIO_FOTO;
	}
	
	public int getNumeroCopias() {
		return numeroCopias;
	}

	public void setNumeroCopias(int numeroCopias) {
		this.numeroCopias = numeroCopias;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	@Override
	public String toString() {
		return "Foto [codigo=" + codigo + ", numeroCopias=" + numeroCopias + ", dataEntrega=" + dataEntrega
				+ ", dataPedido=" + dataPedido +" Preço Unitario Foto= "+ PRECO_UNITARIO_FOTO  +"]";
	}	


}
