package Exercicio;
import Exercicio.Entrada;
import Exercicio.FolhaPagamento;
public class Principal {

	public static void main(String[] args) {
		Entrada E = new Entrada();
		E.entrarComDados();
		FolhaPagamento F = new FolhaPagamento();
		F.calcularSalarioLiquid();
	}
}
