package com.impnet.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.impnet.model.Foto;

public class aplicacao {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws ParseException {
		Foto foto = new Foto(1, 2, sdf.parse("20/11/2016"),new Date());
		
		System.out.println(foto);
		System.err.println("Preço Total =" + foto.calculoPreco(Foto.PRECO_UNITARIO));

		
	}

}
