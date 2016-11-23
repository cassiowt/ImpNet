package com.impnet.apl;

import com.impnet.model.Impressora;

public class Aplicacao4 {
	public static void main(String[] args) {
		 Impressora impressoraHP = new Impressora("HP DesckJet 4200 Color", true);
		 impressoraHP.enviarImpressao("./texto.txt");
		 impressoraHP.imprimir();
	}
}
