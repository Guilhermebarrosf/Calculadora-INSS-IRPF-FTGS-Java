package Exercicio;
import Exercicio.Imposto;

public class FolhaPagamento {
	public double calcularSalarioLiquid() {
		switch (Imposto.getOp()) {
		case 1:Imposto.calcularINSS();break;
		case 2:Imposto.calcularFGTS();break;
		case 3:Imposto.calcularIRPF();break;
//		case 4:Imposto.calcularImpostos;break;
		}
		return 0;
	}
}
