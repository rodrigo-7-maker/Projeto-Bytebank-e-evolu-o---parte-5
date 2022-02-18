

public abstract class Conta {
	protected double saldo;
	private int conta;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int conta) {
		Conta.total++;
		//System.out.println("O total de contas até agora é " + Conta.total);
		this.agencia = agencia;
		this.conta = conta;
		//System.out.println("Estou criando uma conta " + this.conta);
	}
	
	public abstract void deposita(double valor);

	
	public boolean saca(double valor) {
		if (valor <= saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (valor <= saldo) {
			this.saca(valor);
			destino.deposita(valor);
			System.out.println("Transferencia realizada com sucesso!");
			return true;
		} else {
			System.out.println("Transferencia não realizada.");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getConta() {
		return this.conta;
	}
	
	public void setConta(int conta) {
		if (conta <= 0) {
			System.out.println("Numeros negativos não permitidos :(");
			return;
		}		
		this.conta = conta;	
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("Numeros negativos não permitidos :(");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitulat() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
}