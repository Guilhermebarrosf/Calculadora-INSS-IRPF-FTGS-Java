package Exercicio;

import Exercicio.Funcionario;
import Exercicio.Imposto;

import java.util.Scanner;

public class Entrada {
	public int Calc;
	public void entrarComDados() {
		Funcionario F = new Funcionario();
		Scanner ler = new Scanner(System.in);
		 System.out.println("1 - Calcular INSS \n2 - Calcular FGTS \n3 - Calcular IRPF \n4 - Calcular os 3 Impostos");
		 int op = ler.nextInt();
		 Imposto.setOp(op);
		 System.out.println("Insira o Nome do Funcionário: ");
		 String nome = ler.next();
		 F.setNome(nome);
		System.out.println("Insira o Salario do Funcionário: ");
		F.setSalario(ler.nextDouble());
	}
}
