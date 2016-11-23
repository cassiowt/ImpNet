package com.impnet.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.impnet.impl.FilaImpressao;

public class Impressora implements FilaImpressao {
	private String nomeImpressora;
	private boolean ligaIpressora;
	private String doc;

	public Impressora() {
	}

	public Impressora(String nomeImpressora, boolean ligaIpressora) {
		super();
		this.nomeImpressora = nomeImpressora;
		this.ligaIpressora = ligaIpressora;
	}

	/**
	 * @return the nomeImpressora
	 */
	public String getNomeImpressora() {
		return nomeImpressora;
	}

	/**
	 * @param nomeImpressora
	 *            the nomeImpressora to set
	 */
	public void setNomeImpressora(String nomeImpressora) {
		this.nomeImpressora = nomeImpressora;
	}

	/**
	 * @return the ligaIpressora
	 */
	public boolean isLigaIpressora() {
		return ligaIpressora;
	}

	/**
	 * @param ligaIpressora
	 *            the ligaIpressora to set
	 */
	public void setLigaIpressora(boolean ligaIpressora) {
		this.ligaIpressora = ligaIpressora;
	}

	@Override
	public boolean imprimir() {
		if (!isLigaIpressora()) {
			System.out.println("A Impressora " + this.nomeImpressora + " esta desligada.....");
			return false;
		}
		if (this.doc == null) {
			System.out.println("Não existe documento para imprimir.....");
			return false;
		}
		System.out.println("iniciando a impressão na " + this.nomeImpressora + " .....\n");
		impressao();
		return true;
	}
	public void impressao() {
		try {
			FileReader arq = new FileReader(this.doc);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while (linha != null) {
				System.out.printf("%s\n", linha);

				linha = lerArq.readLine(); // lê da segunda até a última linha
			}
			arq.close();
		} catch (IOException e) {
			System.err.printf("Error\n", e.getMessage());
		}
	}

	@Override
	public void enviarImpressao(String doc) {
		this.doc = doc;
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean remover(String doc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pausa() {
		// TODO Auto-generated method stub

	}

}
