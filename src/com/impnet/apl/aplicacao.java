package com.impnet.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.impnet.model.Albun;
import com.impnet.model.Calendario;
import com.impnet.model.Foto;
import com.impnet.model.Quadro;

public class aplicacao {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws ParseException {
		//calculoFoto();
		//calculoCalendario();
		//calculoAlbun() ;
		calculoQuadro();
		
	}

	private static void calculoFoto() throws ParseException {
		Foto foto = new Foto(1, 2, sdf.parse("20/11/2016"),new Date());
		System.out.println(foto);
		System.err.println("Preço Total = R$ " + foto.calculoPreco(Foto.PRECO_UNITARIO));
	}
	
	private static void calculoCalendario() throws ParseException {
		Calendario calendario = new Calendario(21, 5, sdf.parse("20/11/2016"),new Date(), 10, sdf.parse("01/01/2016"),sdf.parse("31/12/2016"));
		System.out.println(calendario);
		System.err.println("Preço Total = R$ " + calendario.calculoPreco(Calendario.PRECO_UNITARIO));
	}

	private static void calculoAlbun() throws ParseException {
		Albun albun = new Albun(51, 2, sdf.parse("20/11/2016"),new Date(), 8);
		System.out.println(albun);
		System.err.println("Preço Total = R$ " + albun.calculoPreco(Albun.PRECO_UNITARIO));
	}

	private static void calculoQuadro() throws ParseException {
		Quadro quadro = new Quadro(51, 2, sdf.parse("20/11/2016"),new Date(), 8);
		System.out.println(quadro);
		System.err.println("Preço Total = R$ " + quadro.calculoPreco(Quadro.PRECO_UNITARIO));
	}
	
}
