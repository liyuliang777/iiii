package com.product.impl;

import com.product.AProInter;

public class APro1 extends AProInter{

	@Override
	public String createPP() {
		System.out.println("apro1");
		return "Apro1";
	}

	@Override
	public String get() {
		System.out.println("Apro111");
		return null;
	}
	
}
