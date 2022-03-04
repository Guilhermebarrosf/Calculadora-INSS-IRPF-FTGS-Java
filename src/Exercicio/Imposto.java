package Exercicio;

import Exercicio.Funcionario;

public class Imposto {
	private static int op;

	public static int getOp() {
		return op;
	}

	public static void setOp(int opc) {
		op = opc;
	}

	public static void calcularINSS() {
		double aux;
		aux = Funcionario.getSalario();
		if (aux <= 1317.07) {
			System.out.printf("Foi descontado R$%.2f", (aux * 0.08));
			System.out.printf(" de INSS do salário do funcionário%n");
			aux -= aux * 0.08;
			System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);
		} else if (aux <= 2195.12) {
			System.out.printf("Foi descontado R$%.2f", (aux * 0.09));
			System.out.printf(" de INSS do salário do funcionário%n");
			aux -= aux * 0.09;
			System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);

		} else if (aux <= 4390.24) {
			System.out.printf("Foi descontado R$%.2f", (aux * 0.11));
			System.out.printf(" de INSS do salário do funcionário%n");
			aux -= aux * 0.11;
			System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);

		} else {
			System.out.printf("Foi descontado R$482.93");
			System.out.printf(" de INSS do salário do funcionário%n");
			aux -= 482.93;
			System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);
		}
	}

	public static void calcularIRPF() {
		double aux;
		aux = Funcionario.getSalario();
		if (aux >= 1787.78) {
			if (aux <= 2679.29) {
				System.out.printf("Foi descontado R$%.2f", (aux * 0.075));
				System.out.printf(" de IRPF do salário do funcionário%n");
				aux -= aux * 0.075;
				System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);
			} else if (aux <= 3572.43) {
				System.out.printf("Foi descontado R$%.2f", (aux * 0.15));
				System.out.printf(" de IRPF do salário do funcionário%n");
				aux -= aux * 0.15;
				System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);

			} else if (aux <= 4463.81) {
				System.out.printf("Foi descontado R$%.2f", (aux * 0.225));
				System.out.printf(" de IRPF do salário do funcionário%n");
				aux -= aux * 0.225;
				System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);

			} else if (aux >= 4463.81) {
				System.out.printf("Foi descontado R$ %.2f", (aux * 0.275));
				System.out.printf(" de INSS do salário do funcionário%n");
				aux -= aux * 0.275;
				System.out.printf("O salario liquido do funcionário atualizado é de: R$%.2f", aux);
			}} 
			else {
				System.out.println("Funcionario isento de desconto!");
				System.out.printf("O salario liquido do funcionário é de: R$%.2f", aux);
			}
	}

	public static double calcularFGTS() {
		double aux;
		aux = Funcionario.getSalario();
		System.out.printf("Foi descontado %.2f", (aux * 0.08));
		System.out.printf(" de FGTS do salário do funcionário%n");
		aux -= aux * 0.08;
		System.out.printf("O salario liquido do funcionário atualizado é : R$%.2f", aux);
		return aux;
	}
}
