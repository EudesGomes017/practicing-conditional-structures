package ConditionalStructure;

import java.awt.geom.Arc2D.Double;
import java.util.Locale;
import java.util.Scanner;

public class PracticingConditionalStructure {

	// Estrutura condicioanal simples, para pratica

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// int x = 5;

		/*
		 * System.out.println("Bomd dia");
		 * 
		 * if (x > 0) {// aqui dentro vamos colocar a condição
		 * 
		 * System.out.println("Bomd dia"); } System.out.println("Bomd dia");
		 */

		// -------------------------------------------//

		// Estrutura condicioanal composta, para pratica

		/*
		 * Scanner sc = new Scanner(System.in); int hora;
		 * 
		 * System.out.println("Quantas horas ? "); hora = sc.nextInt(); // vamos fazer a
		 * leitura
		 * 
		 * if (hora < 12) { System.out.println("Bom dia"); }
		 * 
		 * else { System.out.println("Boa tarde"); }
		 */

		// --------------------------------------------------//

		// Encadeamento de estruturas condicionais, para fazer mais de duas
		// possibilidades

		/*
		 * int hora;
		 * 
		 * System.out.println("Quantas horas ? "); hora = sc.nextInt(); // vamos fazer a
		 * leitura
		 * 
		 * if (hora < 12) { System.out.println("Bom dia"); }
		 * 
		 * else { if (hora < 18) { System.out.println("Boa tarde"); } else {
		 * System.out.println("Boa noite"); } }
		 */
//----------------------------------------------------------------------------

		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não
		 */
		/*
		 * int inteiro;
		 * 
		 * System.out.println("Qual número ? ");
		 * 
		 * inteiro = sc.nextInt(); // vamos fazer a leitura
		 * 
		 * if (inteiro < 0 ) { System.out.println("NEGATIVE"); }
		 * 
		 * else { System.out.println("NO NEGATIVE"); }
		 */
		// ---------------------------------------------------

		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar
		 */

		/*
		 * System.out.println("Digite um número ");
		 * 
		 * int N = sc.nextInt();
		 * 
		 * 
		 * if (N % 2 == 0) { System.out.println("PAR"); } else {
		 * System.out.println("IMPAR"); }
		 */

		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente
		 * 
		 * 
		 * int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * if (a % b == 0 || b % a == 0) { System.out.println("Sao Multiplos"); } else {
		 * System.out.println("Nao sao Multiplos"); }
		 */

		// --------------------------------------------------------------------

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas
		 * 
		 * System.out.println("Digite um número : ");
		 * 
		 * 
		 * int horaInicial = sc.nextInt(); int horaFinal = sc.nextInt();
		 * 
		 * 
		 * int duracao; if (horaInicial < horaFinal) { duracao = horaFinal -
		 * horaInicial; } else { duracao = 24 - horaInicial + horaFinal; }
		 * 
		 * System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		 */

		// ---------------------------------------------------------------------------------

		/*
		 * Faça um programa para ler as duas notas que um aluno obteve no primeiro e
		 * segundo semestre de uma disciplina anual. Em seguida, mostre a nota final que
		 * o aluno obteve no ano juntamente com um texto explicativo. Caso a nota final
		 * do aluno seja inferior a 60.00, mostre a mensagem "REPROVADO" conforme
		 * exemplo entradas 45.5, 31.3 saidas NOTA FINAL = 76.8
		 * 
		 * double nota1 = sc.nextDouble(); double nota2 = sc.nextDouble();
		 * 
		 * double notaFinal = nota1 + nota2; System.out.printf("NOTA FINAL = %.1f%n", +
		 * notaFinal);
		 * 
		 * if (notaFinal < 60.0) { System.out.println("REPROVADO"); }
		 */

		// -----------------------------------------------------------------------

		/*
		 * Leia 3 valores de pontos flutuantes e efetue cálculo das raízes da equação de
		 * bhaskara. Se não for possível calcular as raízes, mostre a mensagem
		 * correspodente "impossível calcular", caso haja uma divisão por 0 ou raiz de
		 * um numero negativo.
		 * 
		 * ENTRADA Leia três valores de ponto flutuante (double) A, B e C. SAÍDA Se não
		 * houver possibilidade de calcular as raízes, apresente a mensagem
		 * "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
		 * dígitos após o ponto, com uma mensagem correspondente conforme exemplo
		 * abaixo. Imprima sempre o final de linha após cada mensagem.
		 * 
		 * Exemplos de entrada 10.0 20.1 5.1, 0.0 20.0 5.0 / EXEMPLOS DESAIDA R1 =
		 * -0.29788, IMPOSSIVEL CALCULAR
		 */

		/*
		 * Scanner leitor = new Scanner(System.in);
		 * 
		 * System.out.println("Digite os números");
		 * 
		 * double A = leitor.nextDouble(); double B = leitor.nextDouble(); double C =
		 * leitor.nextDouble();
		 * 
		 * double delta = B * B - 4.0 * A * C;
		 * 
		 * if (A == 0 || delta < 0.0) { System.out.println("Impossivel calcular"); }
		 * else { double r1 = (-B + Math.sqrt(delta)) / (2.0 * A); double r2 = (-B -
		 * Math.sqrt(delta)) / (2.0 * A); System.out.printf("R1 = %.5f%n", r1);
		 * System.out.printf("R1 = %.5f%n", r2); }
		 */

		/*
		 * outroa forma de fazer o calcular com if
		 */
		/*
		 * if ((A == 0) | (B * B - 4 * A * C < 0)) {
		 * System.out.println("Impossivel calcular"); return; }
		 * 
		 * double bascara = Math.sqrt((B * B) - 4 * A * C); double R1 = (-B + bascara) /
		 * (2 * A); double R2 = (-B - bascara) / (2 * A);
		 * System.out.println(String.format("R1 = %.5f", R1));
		 * System.out.println(String.format("R2 = %.5f", R2));
		 */
		// ------------------------------------------------------------------------------

		/*
		 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
		 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma
		 * vez. exemplos de entrada, 7 3 8 entrada 5 12 5 saida MENOR = 3 saida MENOS =
		 * 5
		 */

		/*
		 * System.out.println("Digite os números"); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int c = sc.nextInt(); // fizemos um encadeamento de estruturas
		 * condicionais if (a < b && a < c) { System.out.println("MENOR = " + a); } else
		 * { if (b < c) { System.out.println("MENOR = " + b); } else {
		 * System.out.println("MENOR = " + c); } }
		 */

		// ----------------------------------------------------------------------
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		/*
		 * int codigo = sc.nextInt(); int quantidade = sc.nextInt();
		 * 
		 * double total; if (codigo == 1) { total = quantidade * 4.0; } else if (codigo
		 * == 2) { total = quantidade * 4.5; } else if (codigo == 3) { total =
		 * quantidade * 5.0; } else if (codigo == 4) { total = quantidade * 2.0; } else
		 * { total = quantidade * 1.5; }
		 * 
		 * System.out.printf("Total: R$ %.2f%n", total);
		 */

		// -----------------------------------------------------------------------------

		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
		 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		 */

		/*
		 * double numero = sc.nextDouble();
		 * 
		 * if (numero < 0.0 || numero > 100.0) {
		 * System.out.println("Fora de intervalo"); } else if (numero <= 25.0) {
		 * System.out.println("Intervalo [0,25]"); } else if (numero <= 50.0) {
		 * System.out.println("Intervalo (25,50]"); } else if (numero <= 75.0) {
		 * System.out.println("Intervalo (50,75]"); } else {
		 * System.out.println("Intervalo (75,100]"); }
		 */

//--------------------------------------------------------------------------------------

		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
		 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		 */

		/*
		 * double x = sc.nextDouble(); double y = sc.nextDouble();
		 * 
		 * if (x == 0.0 && y == 0.0) { System.out.println("Origem"); } else if (x ==
		 * 0.0) { System.out.println("Eixo Y"); } else if (y == 0.0) {
		 * System.out.println("Eixo X"); } else if (x > 0.0 && y > 0.0) {
		 * System.out.println("Q1"); } else if (x < 0.0 && y > 0.0) {
		 * System.out.println("Q2"); } else if (x < 0.0 && y < 0.0) {
		 * System.out.println("Q3"); } else { System.out.println("Q4"); }
		 */
		// --------------------------------------------------------------

		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
		 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
		 * Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
		 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
		 * valor deve ser impresso com duas casas decimais
		 */

		/*
		 * double salario = sc.nextDouble();
		 * 
		 * double imposto; if (salario <= 2000.0) { imposto = 0.0; } else if (salario <=
		 * 3000.0) { imposto = (salario - 2000.0) * 0.08; } else if (salario <= 4500.0)
		 * { imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; } else { imposto =
		 * (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; }
		 * 
		 * if (imposto == 0.0) { System.out.println("Isento"); } else {
		 * System.out.printf("R$ %.2f%n", imposto); }
		 */

		/*
		 * Problema exemplo Uma operadora de telefonia cobra R$ 50.00 por um plano
		 * básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a
		 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser
		 * pago.
		 */
		/*
		 * System.out.print("Digite a quantidade de minutos utilizados: "); int
		 * minutosUtilizados = sc.nextInt();
		 * 
		 * double valorOperadora = 50.00; int franquiaMinutos = 100; int
		 * minutosExcedentes = minutosUtilizados - franquiaMinutos; double
		 * custoExcedentePorMinuto = 2.00 * minutosExcedentes;
		 * 
		 * if (minutosUtilizados <= franquiaMinutos) {
		 * System.out.println("Valor a pagar:" + valorOperadora); } else if
		 * (minutosUtilizados > franquiaMinutos) {
		 * 
		 * valorOperadora += custoExcedentePorMinuto;
		 * System.out.printf("Valor a pagar %.2f%n ", +valorOperadora);
		 * 
		 * }
		 */

		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos.
		 */
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);

		
		// scopo de variáveis:
		double price = 100.00;
		double discount = 0;
		if (price < 50.00) {
			discount = price * 0.1;
		}
		System.out.println(discount);
		sc.close();
	}
}
