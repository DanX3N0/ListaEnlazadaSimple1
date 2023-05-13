package all;

import main.ListaEnlazadaSimple;

public class Main {

	public static void main(String[] args) {
		
		ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
		
		lista.insertar(1);
		lista.insertar(2);
		lista.insertar(3);
		lista.insertar(4);
		lista.insertar(5);
		lista.insertar(6);
		
		lista.mostrarLista();
		lista.invertirLista();
		lista.mostrarLista();
		//System.out.println(lista.existeElElemento(41));
	}

}
