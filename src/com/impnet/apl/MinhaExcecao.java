package com.impnet.apl;

import java.util.Date;

public class MinhaExcecao extends Exception {
	public MinhaExcecao(String msg) {
		super("Erro do meu programa " + new Date() + " " + msg);
	}
}
