package com.impnet.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.impnet.model.Albun;
import com.impnet.model.Calendario;
import com.impnet.model.Foto;
import com.impnet.model.Quadro;

public class Aplicacao {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		try {
			calculoFoto();
			calculoCalendario();
			calculoAlbun();
			calculoQuadro();
		} catch (MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
	}

	private static void calculoFoto() throws ParseException, MinhaExcecao {
		Foto foto = new Foto(1, 2, sdf.parse("20/11/2016"), new Date());
		System.out.println(foto);
		System.err.println("Pre�o Total = R$ " + foto.calculoPreco(-1f));
	}

	private static void calculoCalendario() throws ParseException, MinhaExcecao {
		Calendario calendario = new Calendario(21, 5, sdf.parse("20/11/2016"), new Date(), 10, sdf.parse("01/01/2016"),
				sdf.parse("31/12/2016"));
		System.out.println(calendario);
		System.err.println("Pre�o Total = R$ " + calendario.calculoPreco(Calendario.PRECO_UNITARIO));
	}

	private static void calculoAlbun() throws ParseException, MinhaExcecao {
		Albun albun = new Albun(51, 2, sdf.parse("20/11/2016"), new Date(), 8);
		System.out.println(albun);
		System.err.println("Pre�o Total = R$ " + albun.calculoPreco(Albun.PRECO_UNITARIO));
	}

	private static void calculoQuadro() throws ParseException, MinhaExcecao {
		Quadro quadro = new Quadro(51, 2, sdf.parse("20/11/2016"), new Date(), 8);
		System.out.println(quadro);
		System.err.println("Pre�o Total = R$ " + quadro.calculoPreco(Quadro.PRECO_UNITARIO));
	}

}
