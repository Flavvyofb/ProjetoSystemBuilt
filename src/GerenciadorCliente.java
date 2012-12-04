import java.util.ArrayList;

public class GerenciadorCliente {

	Cliente c = new Cliente();
	ArrayList<Cliente> lista = new ArrayList<Cliente>();

	public void addLista(Cliente c) {
		lista.add(c);

	}
	public void removeDaLista(Cliente c){
		lista.remove(c.getNomeCliente());
	}
	public void tamanhoLista(){
		 lista.size();
	}

}
