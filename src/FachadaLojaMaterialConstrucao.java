public class FachadaLojaMaterialConstrucao {

	//private Cliente a;
	private GerenciadorCliente g;
	
	

	public FachadaLojaMaterialConstrucao() {
	//	this.a = new Cliente();
	}

	public void addclienteLista(Cliente c) {
		g.addLista(c);

	}

	public void tamanhoListaCliente() {
		g.tamanhoLista();
	}

	public void removeClientes(Cliente n) {
		g.removeDaLista(n);
	}
}
