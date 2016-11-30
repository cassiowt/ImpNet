package com.impnet.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.impnet.apl.MinhaExcecao;

public class Foto {
	private int codigo;
	public static final float PRECO_UNITARIO = 10.00f;
	protected float precoProduto;
	private int numeroCopias;
	private Date dataEntrega;
	private Date dataPedido;

	public Foto() {
	}

	public Foto(int codigo, int numeroCopias, Date dataEntrega, Date dataPedido) throws MinhaExcecao {
		this.codigo = codigo;
		this.numeroCopias = numeroCopias;
		this.setDataPedido(dataPedido);
		this.setDataEntrega(dataEntrega);
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

	public void setDataEntrega(Date dataEntrega) throws MinhaExcecao {
		if (dataEntrega.after(this.dataPedido)) {
			
			this.dataEntrega = dataEntrega;
		} else {
			
			throw new MinhaExcecao(MensagensConstantes.DATA_PEDIDO_MAIOR_DATA_ENTREGA);
		}
		

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
		return "Foto codigo = " + codigo + "\n Número de Copias = " + numeroCopias + "\n Data Entrega = "
				+ sdf.format(dataEntrega) + "\n Data Pedido = " + sdf.format(dataPedido) + "\n";
	}

	public float calculoPreco(float preco) throws MinhaExcecao {
		if (preco < 0) {
			throw new MinhaExcecao(MensagensConstantes.PRECO_MENOR_ZERO);
		} else {
			this.precoProduto = preco * getNumeroCopias();
		}
		return this.precoProduto;
	}

	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}

}
