package com.net.bo;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.impnet.apl.MinhaExcecao;
import com.impnet.model.Foto;

public class TestFoto {
	Foto foto;
	SimpleDateFormat sdf;
	
	@Before
	public void setUp() throws Exception {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		/*
		 * id 				= 1
		 * numero de fotos 	= 10
		 * data entrega 	= 30/11/2016
		 * data pedido  	= 01/11/2016
		 * 
		 */
		foto = new Foto(1, 10, sdf.parse("30/11/2016"), sdf.parse("01/11/2016"));
	}


	@Test
	public void testValidaCalculoPrecoFotoCorreto() throws MinhaExcecao {
		Assert.assertEquals(100,foto.calculoPreco(10),0);
	}

	@Test
	public void testValidaCalculoPrecoFotoInCorreto() throws MinhaExcecao {
		Assert.assertNotEquals(10,foto.calculoPreco(10),0);
	}
	
	@Test
	public void testValidaPrecoFotoCorreto() throws MinhaExcecao {
		foto.calculoPreco(10);
		Assert.assertEquals(100,foto.getPrecoProduto(),0);
	}

	@After
	public void tearDown() throws Throwable {
		System.out.println("Liberado Objeto");
		finalize();
	}

}
