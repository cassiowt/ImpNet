package com.impnet.model;

import java.util.Date;

public class Calendario extends Foto {
	public static final float PRECO_UNITARIO_ =  5.00f;
	private int numeroPaginas;
	private Date periodoInicial;
	private Date periodoFinal;
	
	public Calendario() {
	}

	public Calendario(int codigo, int numeroCopias, Date dataEntrega, Date dataPedido, int numeroPaginas,
			Date periodoInicial, Date periodoFinal) {
		super(codigo, numeroCopias, dataEntrega, dataPedido);
		this.numeroPaginas = numeroPaginas;
		this.periodoInicial = periodoInicial;
		this.periodoFinal = periodoFinal;
	}

	public static float getPrecoUnitarioCalendario() {
		return PRECO_UNITARIO;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Date getPeriodoInicial() {
		return periodoInicial;
	}

	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}

	public Date getPeriodoFinal() {
		return periodoFinal;
	}

	public void setPeriodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
	}

	@Override
	public String toString() {
		return "Calendario - Numero Paginas = " + numeroPaginas + "\n Periodo Inicial = " + periodoInicial + "\n Periodo Final = "
				+ periodoFinal + "\n" + super.toString();
	}

public float calculoPreco(float preco){
		
		return preco*getNumeroCopias()*getNumeroPaginas();
		
	}
	
}
