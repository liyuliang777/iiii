package com.factory.impl;

import com.factory.FacInterface;
import com.product.AProInter;
import com.product.ProInter;
import com.product.impl.Pro1;
import com.product.impl.Pro2;

public class FacInterImpl implements FacInterface{

	@Override
	public  Pro1 createPro1() {
		System.out.println(getClass().getName());
		return new Pro1();
	}
	@Override
	public  Pro2 createPro2() {
		System.out.println(getClass().getName());
		return new Pro2();
	}
	@Override
	public String createOO(AProInter p) {
		// TODO Auto-generated method stub
		return null;
	}


}
