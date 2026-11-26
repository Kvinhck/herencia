package com.krakedev.herencia;

public class Hijo extends Padre {
	private int juguetes;
	
	public Hijo (String nombre, int virtudes, int defectos,int juguetes) {
		super(nombre, virtudes,defectos);
		this.juguetes = juguetes;
	}
	
	@Override
	
	public String toString() {
		return super.toString() + ", juguetes: " + juguetes;
	}
	
	public void ahorrar(double monto){
		super.ahorrar(monto/2);
	}
	
}
