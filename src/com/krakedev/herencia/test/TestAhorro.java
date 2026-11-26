package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre dad = new Padre("Carlos",4,8);
		dad.ahorrar(40.5);
		System.out.println(dad);
		
		Hija hija = new Hija("Cecilia",4,8);
		hija.ahorrar(40.5);
		System.out.println(hija);
		
		Hijo hijo = new Hijo("Felipe",4,8,10);
		hijo.ahorrar(40.5);
		System.out.println(hijo);
	}

}
