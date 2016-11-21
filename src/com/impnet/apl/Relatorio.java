package com.impnet.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.impnet.model.Foto;

public class Relatorio {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		relatorioFotos();

	}

	private static void relatorioFotos() throws ParseException {
		Foto foto = new Foto(1, 1, sdf.parse("02/11/2016"),new Date());
		Foto foto2 = new Foto(2, 1, sdf.parse("20/11/2016"),new Date());
		Foto foto3 = new Foto(3, 10, sdf.parse("30/11/2016"),new Date());
		
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

}
