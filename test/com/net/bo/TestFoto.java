package com.net.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.impnet.apl.MinhaExcecao;
import com.impnet.model.Foto;
import com.impnet.model.MensagensConstantes;

public class TestFoto {
	Foto foto, fotoErrada;
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
		fotoErrada = new Foto(1, -10, sdf.parse("31/12/2016"), sdf.parse("30/11/2016"));
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

	@Test
	public void testDataPedidoValido()  {
		boolean dataCorreta = foto.getDataPedido().before(foto.getDataEntrega()); 
		Assert.assertTrue(dataCorreta );
	}
	
	
	@Ignore
	public void testDataPedidoInValido()  {
		boolean dataIncorreta = fotoErrada.getDataPedido().before(fotoErrada.getDataEntrega()); 
		Assert.assertFalse(dataIncorreta);
	}

	@Test
	public void testMensagemDataPedidoInvalido() throws ParseException {
		try {
			fotoErrada.setDataPedido(sdf.parse("31/12/2017"));
			fotoErrada.setDataEntrega(sdf.parse("31/12/2016"));
			Assert.fail("A mensagem deveira ser : " + MensagensConstantes.DATA_PEDIDO_MAIOR_DATA_ENTREGA);
		} catch (MinhaExcecao e) {
			// Teste se a mensagem corresponde também
			Assert.assertTrue("Mensagem do erro:", e.getMessage().equals(MensagensConstantes.DATA_PEDIDO_MAIOR_DATA_ENTREGA));
		}

	}
	
	
	@After
	public void tearDown() throws Throwable {
	//	System.out.println("Liberado Objeto");
	//	finalize();
	}

}
