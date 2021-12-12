package Projeto_Escola;

import java.util.Scanner;

public class Projeto_Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		/*Sistema criado para entrar com notas de um aluno, cont�m uma m�dia ponderada onde os trabalhos tem peso 1 e as provas peso 4. 
		Depois informar se foi reprovado, aprovado ou se est� em recupera��o. Se estiver, indica os caminhos.
		Tem quatro op��es de utiliza��o:
			1-Calcular a m�dia de um alune e saber se foi aprovade.
			2-Calcular a m�dia da sala (20 alunes).
			3-Calcular as m�dias das salas (4 salas)
			4-Calcular a maior m�dia da sala para premia��o (20 alunes).*/
		
		float trabalho1,trabalho2,prova1,prova2,media,trab1,trab2,pro1,pro2,med,soma=0,med2,sala,med3,med4,tra1,tra2,pv1,pv2,some=0;
		int op,x,y,sala1,sala2,sala3,sala4;
		String nomea,nome;

		
		System.out.println("\nObserve as op��es abaixo:");
		System.out.println("\n1-Calcular a m�dia de um alune e saber se foi aprovade.");
		System.out.println("2-Calcular a m�dia da sala (20 alunes).");
		System.out.println("3-Calcular as m�dias das salas (4 salas)");
		System.out.println("4-Calcular a maior m�dia da sala para premia��o (20 alunes).");
		System.out.println("\n\nAgora escolha uma op��o de 1 at� 4:");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1: 
			System.out.println("\nQual o valor do trabalho1: ");
			trabalho1 = leia.nextFloat();
			System.out.println("\nQual o valor da trabalho2: ");
			trabalho2 = leia.nextFloat();
			System.out.println("\nQual o valor da prova1: ");
			prova1 = leia.nextFloat();
			System.out.println("\nQual o valor da prova2: ");
			prova2 = leia.nextFloat();
			
			media = ((trabalho1*1) + (trabalho2*1) + (prova1*4) + (prova2*4)) / 10;
			
			System.out.printf("\nA m�dia final foi de: %2.2f",media);
			
			if(media >= 7 && media <= 10)
			{
				System.out.println("\nAlune foi aprovade!");
			}
			else if(media >= 5 && media < 7)
			{
				System.out.println("\n\nAlune de recupera��o!");
				System.out.println("\n\nAs op��es s�o:");
				System.out.println("\n1-Fazer um trabalho para compensar.");
				System.out.println("\n2-Fazer aulas de recupera��o.");
				System.out.println("\nEscolha uma op��o:");
				op = leia.nextInt();
				switch(op)
				{
				case 1: 
					System.out.println("\nFa�a um trabalho sobre antropologia e entregue at� o dia 10/11 para o professor Luis.");
				case 2:
					System.out.println("\nPor favor procurar a professora Tati.");
				}

			}
			else
			{
				System.out.println("\nAluno reprovado! Por favor procure o coordenador Antonio para mais informa��es.");	
			}break;
			
		case 2: 
			System.out.println("\nQual a sala que deseja calcular? \nR:");
			sala = leia.nextFloat();
			for(x=0;x<=20;x++)
			{

				System.out.println("\nQual o valor do trabalho1: ");
				trab1 = leia.nextFloat();
				System.out.println("\nQual o valor da trabalho2: ");
				trab2 = leia.nextFloat();
				System.out.println("\nQual o valor da prova1: ");
				pro1 = leia.nextFloat();
				System.out.println("\nQual o valor da prova2: ");
				pro2 = leia.nextFloat();
				
				med = ((trab1*1) + (trab2*1) + (pro1*4) + (pro2*4)) / 10;
				
				soma += med;
				
			}
			med2 = soma / 20;
			System.out.println("\nA media da sala "+sala+"� "+med2+".");
			break;
		case 3: 
			System.out.println("\nQual a nota da sala 1? \nR:");
			sala1 = leia.nextInt();
			System.out.println("\nQual a nota da sala 2? \nR:");
			sala2 = leia.nextInt();
			System.out.println("\nQual a nota da sala 3? \nR:");
			sala3 = leia.nextInt();
			System.out.println("\nQual a nota da sala 4? \nR:");
			sala4 = leia.nextInt();
			
			med3 = (sala1 + sala2 + sala3 + sala4);
			
			System.out.println("A m�dia das 4 salas � de: "+med3+".");
			break;
		case 4:
			for(y=0;y<=20;y++)
			{
			System.out.println("\nQual nome do alune? \nR:");
			nomea = leia.toString();
			System.out.println("\nQual o valor do trabalho1: ");
			tra1 = leia.nextFloat();
			System.out.println("\nQual o valor da trabalho2: ");
			tra2 = leia.nextFloat();
			System.out.println("\nQual o valor da prova1: ");
			pv1 = leia.nextFloat();
			System.out.println("\nQual o valor da prova2: ");
			pv2 = leia.nextFloat();
			
			med4 = ((tra1*1) + (tra2*1) + (pv1*4) + (pv2*4)) / 10;
			if(some < med4)
			{
			some += med4;
			nomea = nome;
			}
			
			System.out.printf("\nA maior m�dia foi do alune %f %2.2f",nome,some);
			
		}

			

		
		
		

	}

}