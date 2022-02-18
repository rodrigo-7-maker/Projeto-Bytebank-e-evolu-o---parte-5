
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(2222);
		
		Administrador adm1 = new Administrador();
		adm1.setSenha(3333);
		
		SistemaInterno si = new SistemaInterno();
		si.autenticou(g1);
		si.autenticou(adm1);

	}

}
