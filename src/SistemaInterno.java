
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autenticou(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Bem vindo!");
		}else 
			System.out.println("Não pode entrar!");
		}

}
