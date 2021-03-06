package modulo3;
/*
Crear una clase pila de enteros que contengan los siguientes métodos:
●
CrearPila
→
inicio con límite
●
Insertar (push)
→
Pone un dato en la pila
●
Quitar (pop)
→
Retira un dato de la pila
●
Pila vacía (empty)
→
Comprueba si la pila está vacía
●
limpiar pila
→
Quita elementos de una pila
●
CimaPila
→
Se obtiene el elemento de la cima de la pila
●
TamañoPila
→
Número máximo de elementos de una pila
Y luego crear un menú que permita utilizar los métodos de la nueva clase
*/

import java.util.Stack;

public class PilaEnteros {
	private Stack<Integer> pila;
	private int limite;
	
	public PilaEnteros(int limite) {
		this.setLimite(limite);
		this.pila=new Stack<Integer>();
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	
	public boolean pilaLlena() {
		boolean r=false;
		if(this.pila.size()==this.getLimite())
			r=true;
		return r;
	}
	public boolean pilaVacia() {
		boolean r=false;
		if(this.pila.empty()) {
			r=true;
		}
		return r;
	}
	public void insertar(Integer nuevo) {
		if(!pilaLlena()) {
			this.pila.push(nuevo);
		}
		else {
			System.err.println("Error al insertar: Pila llena");
		}
	}
	public Integer retirar() {
		if(!pilaVacia()) {
			return this.pila.pop();
		}
		else {
			System.err.println("Error al retirar: Pila vacia");
			return null;
		}
	
	}
	public void limpiarPila() {
		this.pila.removeAllElements();
	}
	public Integer cimaPila() {
		if(!pilaVacia()) {
			return this.pila.peek();
		}
		else return null;
	}
	public int tamanioPila(){
		if(this.pila!=null) {
			return this.pila.size();
		}
		else return 0;
	}
	




	
    
}
