package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	
	
//	public Padre () {
//		System.out.println("Soy el constructor vacio del padre");
//	}
	
	public Padre(int virtudes, int defectos) {
		this.defectos = defectos;
		this.virtudes = virtudes;
	}
	
	public String toString() {
		return "Defectos: " + defectos + ", Virtudes: " + virtudes + ", Total Ahorrado: " + totalAhorrado;
	}
	
	
	
	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	public void imprimir() {
		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);
	}
	
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	public void ahorrar(double monto){
		totalAhorrado += monto;
	}
	
}
