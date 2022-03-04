package Exercicio;

public class Funcionario {
	private static double Salario;
	public String Nome;

	public static void setSalario(double salario) {
		Salario = salario;

	}
	public static double getSalario() {
		return Salario;
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

}
