package com.factory;

import com.product.AProInter;
import com.product.ProInter;

public interface FacInterface {

	public ProInter createPro1();
	public ProInter createPro2();
	public String createOO(AProInter p);
}
