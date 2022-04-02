package ColetaDados;

import java.util.ArrayList;

public class CuidaDoArray {

	private ArrayList<Dados> lista = new ArrayList<>();

	  
	public void setArray(Dados dados) {
	    this.lista.add(dados);
	}
	  
	public ArrayList<Dados> retornaLista() {
	    return this.lista;
    }
	
	
}
