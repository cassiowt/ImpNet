package com.impnet.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Foto {
	private int codigo;
	public static final float PRECO_UNITARIO =  10.00f;
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
		return PRECO_UNITARIO;
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Foto codigo = " + codigo + "\n Número de Copias = " + numeroCopias + "\n Data Entrega = " + sdf.format(dataEntrega)
				+ "\n Data Pedido = " + sdf.format(dataPedido) +"\n Preço Unitario Foto = R$ "+ PRECO_UNITARIO  +"\n";
	}	

	public float calculoPreco(float preco){
		
		return preco*getNumeroCopias();
		
	}
	

}
