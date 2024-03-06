package aviones;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Avion nave= new Avion();
     ArrayList<Avion> listaBarcos= new ArrayList<>();
     nave.setModelo("1954");
     listaBarcos.add(nave);
     System.out.println(listaBarcos);
	}

}
