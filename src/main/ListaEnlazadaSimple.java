package main;

public class ListaEnlazadaSimple {
	
	public NodoSimple cab;
	public Integer tamaño = 0;
	
	public ListaEnlazadaSimple() {
		this.cab = null;
	}
	
	public void insertar(Integer dato) {
		if(empty()) {
			cab = new NodoSimple(dato);
			tamaño++;
		}else {
			NodoSimple temp = new NodoSimple(dato);
			temp.siguiente = cab;
			cab = temp;
			tamaño++;
		}
	}
	
	public void mostrarLista() {
		NodoSimple temp = cab;
		while(temp != null) {
			System.out.print(temp.info + " ");
			temp = temp.siguiente;
		}
		System.out.println();
	}
	
	public boolean empty() {
		if(tamaño == 0)
			return true;
		return false;
	}
	//PREGUNTA 1
	public Integer numeroDeElementos() {
		return this.tamaño;
	}
	//PREGUNTA 7
	//OPCION 1 no tan correcta
	/*public ListaEnlazadaSimple invertir(ListaEnlazadaSimple lista) {
		ListaEnlazadaSimple lista2 = new ListaEnlazadaSimple();
		NodoSimple temp = cab;
		while(temp != null) {
			lista2.insertar(temp.info);
			temp = temp.siguiente;
		}
		return lista2;
	}*/
	//OPCION 2 correcta
	public void invertirLista() {
		ListaEnlazadaSimple lista2 = new ListaEnlazadaSimple();
		NodoSimple temp = cab;
		while(temp != null) {
			lista2.insertar(temp.info);
			temp = temp.siguiente;
		}
		cab = lista2.cab;
	}
	//Pregunta 3
	public boolean existeElElemento(Integer elemento) {
		NodoSimple temp = cab;
		while(temp != null) {
			if(temp.info == elemento) 
				return true;
			temp = temp.siguiente;
		}
		return false;
	}
	
}
