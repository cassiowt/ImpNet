package com.impnet.bo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.impnet.model.Baskara;



@RunWith(Parameterized.class)
public class TestFormulaBaskara {

	private Baskara baskara;

	@Before
	public void setUp() {
		baskara = new Baskara();
	}

	@Parameters(name = "Teste nro {index}: Valores a = {0}, b = {1}, c = {2}: r1 = {3}, r2 = {4}")

	public static Collection<?> getCasosTeste() {

		return Arrays.asList(new Object[][] {
			{ 1, 1, 1, "0,62", "-1,62" }, 
			{ 1, 1, 0, "0,00", "-1,00" },
			{ -1, 1, 1, "�", "�"}, 
			{ 1, -1, 0, "1,00", "0,00" }, 
			{-1, -1, 0, "-1,00", "-0,00" } });
	}

	// @Parameter

	public int a;
	public int b;
	public int c;
	public String r1;
	public String r2;

	
	
	public TestFormulaBaskara(int a, int b, int c, String r1, String r2) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.r1 = r1;
		this.r2 = r2;
	}

	@Test
	public void testCalculaRaizUm() {
		Double raizUm = baskara.calculaRaizUm(a, b, c);
		String raizFormatada = new DecimalFormat("0.00").format(raizUm);

		assertThat(raizFormatada, equalTo(this.r1));
	}
	@Test
	public void testCalculaRaizDoiz() {
		Double raizDois = baskara.calculaRaizDois(a, b, c);
		String raizFormatada = new DecimalFormat("0.00").format(raizDois);
		
		assertThat(raizFormatada, equalTo(this.r2));
	}
}

