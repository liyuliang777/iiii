package com.factory;

public class FactoryInter2 {
	public <T>T createObj(String classname) {
		T t=null;
		Class class1;
		try {
			class1 = Class.forName(classname);
			t= (T)class1.newInstance();

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
