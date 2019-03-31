package com.product.impl;

import com.product.AProInter;

public class APro2 extends AProInter{

	@Override
	public String createPP() {
		// TODO Auto-generated method stub
		System.out.println("apro2");
		return "Apro2";
	}

	@Override
	public String get() {
		System.out.println("Apro22");
		return null;
	}

}
