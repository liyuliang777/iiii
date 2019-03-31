package com.consumer;

import java.util.GregorianCalendar;

import com.factory.FacInterface;
import com.factory.FactoryInter2;
import com.factory.FactoryInter3;
import com.factory.impl.FacInterImpl;
import com.product.ProInter;
import com.product.impl.APro1;
import com.product.impl.APro2;
import com.product.impl.Pro1;
import com.product.impl.Pro2;

public class Consumer {
	
	public  void go() {
		
	}
	public static void main(String[] args) {
//		FacInterface facInterface = new FacInterImpl();
//		facInterface.createPro1().get();
//		facInterface.createPro2().get();
//		FactoryInter2 nn = new FactoryInter2();
//		((Pro2)nn.createObj("com.product.impl.Pro2")).get();
//		((APro2)nn.createObj(APro2.class.getName())).createPP();
//		((Pro2)nn.createObj(Pro2.class.getName())).get();
//		((Pro1)nn.createObj(Pro1.class.getName())).get();
//		APro1 aPro1 = new APro1();
//		aPro1.createPP();
		FactoryInter3<DDDD> aFactoryInter3= new FactoryInter3<>();
		aFactoryInter3.createDDD("com.consumer.DDDD").gettt();
		
		
	}
}
