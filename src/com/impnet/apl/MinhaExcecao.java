package com.impnet.apl;

import com.impnet.model.MensagensConstantes;

public class MinhaExcecao extends Exception {

	private static final long serialVersionUID = -8831323060932900491L;

	public MinhaExcecao(String msg) {
		super(MensagensConstantes.MSG_EXCEPTION + msg);
	}
}
