package com.impnet.bo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.impnet.apl.MinhaExcecao;
import com.impnet.model.Quadro;
import com.impnet.model.MensagensConstantes;

public class TestQuadro {
	Quadro quadro;
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
		quadro = new Quadro(1, 10, sdf.parse("30/11/2016"), sdf.parse("01/11/2016"), 5);
	}

	@Test
	public void testValidaCalculoPrecoFotoCorreto() throws MinhaExcecao {
		Assert.assertEquals(100, quadro.calculoPreco(10), 0);
	}

	@Test
	public void testValidaCalculoPrecoFotoInCorreto() throws MinhaExcecao {
		Assert.assertNotEquals(10, quadro.calculoPreco(10), 0);
	}

	@Test
	public void testValidaPrecoFotoCorreto() throws MinhaExcecao {
		quadro.calculoPreco(10);
		Assert.assertEquals(100, quadro.getPrecoProduto(), 0);
	}

	@Test
	public void testCalcularPrecoValorZero() throws MinhaExcecao {
		try {
			quadro.calculoPreco(0f);
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
