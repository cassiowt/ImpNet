package com.impnet.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.impnet.model.Albun;
import com.impnet.model.Foto;

public class Relatorio {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		//relatorioFotos();
		relatorioAbuns();

	}

	private static void relatorioFotos() throws ParseException {
		Foto foto = new Foto(1, 1, sdf.parse("02/11/2016"), new Date());
		Foto foto2 = new Foto(2, 1, sdf.parse("20/11/2016"), new Date());
		Foto foto3 = new Foto(3, 10, sdf.parse("30/11/2016"), new Date());

		foto.calculoPreco(Foto.PRECO_UNITARIO);
		foto2.calculoPreco(13f);
		foto3.calculoPreco(21f);

		ArrayList<Foto> fotos = new ArrayList<>();
		fotos.add(foto);
		fotos.add(foto2);
		fotos.add(foto3);

		for (Foto f : fotos) {
			System.out.println(f + "Preço: " + f.getPrecoProduto());
		}
	}

	private static void relatorioAbuns() throws ParseException {
		Albun albun1 = new Albun(51, 2, sdf.parse("02/11/2016"),new Date(),10);
		Albun albun2 = new Albun(52, 2, sdf.parse("10/11/2016"),new Date(),20);
		Albun albun3 = new Albun(53, 2, sdf.parse("31/12/2016"),new Date(),5);
		
		albun1.calculoPreco(Albun.PRECO_UNITARIO);
		albun2.calculoPreco(12.5f);
		albun3.calculoPreco(12.3f);
		
		ArrayList<Albun> albuns = new ArrayList<>();
		albuns.add(albun1);
		albuns.add(albun2);
		albuns.add(albun3);
		
		for (Albun a : albuns) {
			System.out.println(a + "Preço: " + a.getPrecoProduto());
		}
		
	}

	private static void relatorioCalendarios() throws ParseException {
	}

	private static void relatorioQuadros() throws ParseException {
	}

}
