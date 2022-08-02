
public class Conta {

	private String agencia;
	private double numero;
	private double saldo;
	private double limite;
	private double depositar;
	
	private Cliente cliente;
	
	Conta() {
		this.limite = 5000;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
		this.cliente = cliente;
	}

	public String getAgencia() {
		return agencia; 
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getNumero() {
		return numero; 
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo; 
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite; 
	}
	
	public void setlimite(double limite) {
		this.limite = limite;
	}
	
	public double getDepositar() {
		return depositar; 
	}
	
	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	public void Depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void Sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public double ExibirSaldo() {
		return this.saldo;
	}
	
}

// String agencia, double numero, double saldo, double limite, Cliente cliente //
