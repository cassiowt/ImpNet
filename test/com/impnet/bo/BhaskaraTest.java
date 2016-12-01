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

import com.impnet.model.Bhaskara;



@RunWith(Parameterized.class)
public class BhaskaraTest {
	

		Bhaskara bhaskara;

	@Before
	public void setUp() throws Exception {
		bhaskara = new Bhaskara();
	}

	@Parameters(name = "Teste nro {index}: Calculando a= {0} b= {1} c= {2} as raizes sao x1 = {3} e x2 = {4}")
	public static Collection<?> getCasosTeste() {
		return Arrays.asList(new Object[][] 
				{ { 1, 4, 1, "-1,0", "-3,0"},
				{ 1, -4, 1, "3,0", "1,0"},			
			});
	}

	public int valorA;

	public int valorB;

	public int valorC;

	public String raizUm;

	public String raizDois;

	public BhaskaraTest(int valorA, int valorB, int valorC, String raizUm, String raizDois) {
		super();
		this.valorA = valorA;
		this.valorB = valorB;
		this.valorC = valorC;
		this.raizUm = raizUm;
		this.raizDois = raizDois;
	}


	@Test
	public void testCalculoRaizUm() {
		double xUm = bhaskara.resultado(this.valorA,this.valorB,this.valorC,'1');
		String xUmFormatada = new DecimalFormat("0.0").format(xUm);
		assertThat(xUmFormatada, equalTo(this.raizUm));
		
		
	}
	@Test
	public void testCalculoRaizDois() {
		double xUm = bhaskara.resultado(this.valorA,this.valorB,this.valorC,'2');
		String xUmFormatada = new DecimalFormat("0.0").format(xUm);
		assertThat(xUmFormatada, equalTo(this.raizDois));
	}

}
