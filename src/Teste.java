import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Teste {
	FachadaLojaMaterialConstrucao f = new FachadaLojaMaterialConstrucao();
	Cliente c1 = new Cliente();

	@Test
	public void verificaListaVazia(GerenciadorCliente c) {
		f.tamanhoListaCliente()
		Assert.assertEquals(0, 0);

	}

	// }
	// @Test
	// public void VerificaAddCliente() {
	// c1.setNomeCliente("Flávio");
	// f.addclienteLista(c1);
	// Assert.assertTrue("O nome foi add", f.addclienteLista(c1));

	// }

	// @Test
	// public void testeRemove() {
	// c1.setNomeCliente("Flávio");
	// f.verificaAdd(c1);
	// f.removeClientes(c1);
	// Assert.assertTrue(true);

	// }

}
