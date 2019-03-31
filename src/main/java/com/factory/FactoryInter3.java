package com.factory;

import com.product.AProInter;
import com.product.ProInter;

public class FactoryInter3 <T >{
	public <T extends ProInter> T createT(String name) {
		T t = null;
		try {
			Class clzzClass = Class.forName(name);
			t= (T)clzzClass.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
	public  T createDDD(String name) {
		T t = null;
		try {
			Class clzzClass = Class.forName(name);
			t= (T)clzzClass.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}


}
