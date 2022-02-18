
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSalario(6000.0);
		
		Designer d1 = new Designer();
		d1.setSalario(3000);
		
		EditorVideo ed1 = new EditorVideo();
		ed1.setSalario(3000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(d1);
		controle.registra(ed1);
		
		System.out.println(controle.getSoma());
	}

}
