package com.impnet.model;

import java.util.Date;

import com.impnet.apl.MinhaExcecao;

public class Albun extends Foto {
	public static final float PRECO_UNITARIO = 4.00f;
	private int numeroFotosAlbun;

	public Albun() {
	}

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

	@Override
	public String toString() {
		return "Albun - numeroFotosAlbun=" + numeroFotosAlbun + "\n" + super.toString();
	}

	public float calculoPreco(float preco) throws MinhaExcecao {
		if (preco > 0) {
			super.precoProduto = preco * getNumeroCopias() * getNumeroFotosAlbun();
		} else {
			throw new MinhaExcecao(MensagensConstantes.PRECO_MENOR_ZERO);
		}
		return super.getPrecoProduto();
	}

}
