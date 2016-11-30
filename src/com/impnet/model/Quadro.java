package com.impnet.model;

import java.util.Date;

import com.impnet.apl.MinhaExcecao;

public class Quadro extends Foto {
	public static final float PRECO_UNITARIO = 30.00f;
	private float tamanho;
	
	public Quadro() {}

	public Quadro(int codigo, int numeroCopias, Date dataEntrega, Date dataPedido, float tamanho) throws MinhaExcecao {
		super(codigo, numeroCopias, dataEntrega, dataPedido);
		this.tamanho = tamanho;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}


	@Override
	public String toString() {
		return "Quadro tamanho=" + tamanho + "\n" + super.toString();
	}
	
	public float calculoPreco(float preco) throws MinhaExcecao{
		if (preco > 0) {
			super.precoProduto = preco*getNumeroCopias();
		} else {
			throw new MinhaExcecao(MensagensConstantes.PRECO_MENOR_ZERO);
		}
		return super.getPrecoProduto();
	}
	
}
