package com.impnet.apl;

import java.util.Date;

public class MinhaExcecao extends Exception {

	private static final long serialVersionUID = -8831323060932900491L;

	public MinhaExcecao(String msg) {
		super("Erro do meu programa " + new Date() + " " + msg);
	}
}
