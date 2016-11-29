package com.impnet.bo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.impnet.apl.MinhaExcecao;
import com.impnet.model.Albun;
import com.impnet.model.MensagensConstantes;


public class TestAlbun {
	Albun albun;
	SimpleDateFormat sdf;

	@Before
	public void setUp() throws Exception {
		sdf = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 * id = 1 
		 * numero copias = 10 
		 * data entrega = 30/11/2016 
		 * data pedido =  01/11/2016 
		 * numero de fotos = 5
		 * 
		 */
		albun = new Albun(1, 10, sdf.parse("30/11/2016"), sdf.parse("01/11/2016"), 5);
	}

	@Test
	public void testValidaCalculoPrecoFotoCorreto() throws MinhaExcecao {
		Assert.assertEquals(500, albun.calculoPreco(10), 0);
	}

	@Test
	public void testValidaCalculoPrecoFotoInCorreto() throws MinhaExcecao {
		Assert.assertNotEquals(10, albun.calculoPreco(10), 0);
	}

	@Test
	public void testValidaPrecoFotoCorreto() throws MinhaExcecao {
		albun.calculoPreco(10);
		Assert.assertEquals(500, albun.getPrecoProduto(), 0);
	}

	@Test
	public void testCalcularPrecoValorZero() throws MinhaExcecao {
		try {
			albun.calculoPreco(0f);
			fail("Erro execução Teste Preço Valor ZERO");
		} catch (MinhaExcecao e) {
			assertThat(e.getMessage(), is(MensagensConstantes.MSG_EXCEPTION + MensagensConstantes.PRECO_MENOR_ZERO));
		}
	}

	@AfterClass
	public static void tearDown() throws Throwable {
		System.out.println("Testes Encerrados ");

	}

}
