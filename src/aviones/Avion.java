package aviones;

import java.util.concurrent.ForkJoinPool;

import javax.swing.JOptionPane;

public class Avion {
	private String turbina;
	private String nombre;
	private String tipo;
	private String tamano;
	private String modelo;
	public int codigo;

	public int getCodigo() {
		return codigo;
	}

	public Avion(String turbina, String nombre, String tipo, String tamano, String modelo) {
		super();
		this.turbina = turbina;
		this.nombre = nombre;
		this.tipo = tipo;
		this.tamano = tamano;
		this.modelo = modelo;
	}

	public Avion() {
		codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del avion"));
		turbina = JOptionPane.showInputDialog("ingrese el tipo de turbina del avion");
		nombre = JOptionPane.showInputDialog("ingrese el nombre del Avion");
		tipo = JOptionPane.showInputDialog("ingrese el tipo de Avion");
		tamano = JOptionPane.showInputDialog("ingrese el tamaño del Avion");
		modelo = JOptionPane.showInputDialog("ingrese el modelo del Avion");
	}

	public String imprimir() {
		String resul="**RESUTADO**\n\n";
		resul+="Nombre : "+nombre+"\n";
		resul+="tipo : "+tipo+"\n";
		resul+="Tamano : "+tamano+"\n";
		resul+="Modelo : "+modelo+"\n";
		resul+="Turbina : "+turbina+"\n\n";
		System.out.println(resul);
		return resul;
	}

	public String getMotor() {
		return turbina;
	}

	public void setMotor(String motor) {
		this.turbina = motor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
	    return imprimir();
	}

}
