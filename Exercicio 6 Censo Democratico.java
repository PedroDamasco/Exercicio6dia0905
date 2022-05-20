package Exercicios;
import java.util.Scanner;

public class CensoDemocratico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
	
		\\ Inicio do programa criando variaveis de 2 tipos sendo elas, sendo elas e int e em double
		int gen,i,fax=0;
		int hom=0,homida=0,homidat=0;
		int mul=0,mulida=0,mulidat=0;
		int out=0,outida=0,outidat=0;
		
		double alt,ida;
		double homalt,homaltt=0,homaltm=0,homidam=0;
		double mulalt,mulaltt=0,mulaltm=0,mulidam=0;
		double outalt,outaltt=0,outaltm=0,outidam=0;
		
		\\ Iniciando uma loop de repetição para mil pessosa que irao preencher o censo, apos isso expor um texto com as opcoes primarias que irao direcionar para uma linha de execucao.
		for (i=1;i<=1000;i++) {
			System.out.print("\nBoa noite, para um censo na sua cidade iremos fazer 3 perguntas.");
			System.out.printf("\nSeu genero: \n0 -> Feminino \n1 -> Masculino \n2 -> Outro");
			gen=sc.nextInt();
			
			\\ Criando um switch de escolha de generos.
			switch (gen) {
			case 1:
				hom++; \\ soma +1 no genero definido nesse caso homem
					System.out.printf("informe sua idade:");
					homida=sc.nextInt(); \\ coleta a idade do homem.
					homidat=homida+homidat; \\ soma essa idade a uma outra variavel que sera trabalhada mais tarde
					System.out.printf("informe sua altura");
					homalt=sc.nextDouble(); \\ coelta a altura do homem 
					homaltt=homalt+homaltt; \\ tambem soma a altura,a uma outra vairavel que sera trabalhada mais tarde para obtencao da media 
					if (homida >= 18 && homida <= 35) { \\ caso o homem tenha idade dentro da faixa de pesquisa e somado a uma varivel para saber quantas pessoas estao dentro dessa faixa.
						fax++;} \\ soma caso o seja possitiva a resposta da variavel de cima, if.
				break;
			case 2: \\ nas proximas casos do sitwch todos funcionaram semelhante ao exemplo dos homem.
				out++;
					System.out.printf("informe sua idade:");
					outida=sc.nextInt();
					outidat=outida+outidat;
					System.out.printf("informe sua altura");
					outalt=sc.nextDouble();
					outaltt=outalt+outaltt;
					if (outida >= 18 && outida <= 35) {
						fax++;}
				break;
			case 0:
				mul++;
					System.out.printf("informe sua idade:");
					mulida=sc.nextInt();
					mulidat=mulidat+mulida;
					System.out.printf("informe sua altura");
					mulalt=sc.nextDouble();
					mulaltt=mulalt+mulaltt;
					if (mulida >= 18 && mulida <= 35) {
						fax++;}
				break;}}
				\\ apos a coleta de todos esses dados e rodar todas as vezes desejadas( no caso mil )
			ida=(mulidat+homidat+outidat)/(i-1); \\ calculo da idade media de todo o grupo utilizando o i para saber por quanto sera divido,-1 aqui serve para remover uma contagem de i e ficar com a media correta dividindo pelo numero correto de vezes que o software correu, caso nao tivesse esse -1 ele irir dividir por 1001 dando erro na media.
				homidam=homidat/hom; \\ calculo medio de idade dos homens, pegando o total da idade e divindo pelo numero de homens no censo.
				mulidam=mulidat/mul; \\ mesmo conta do descrito em cima porem com mulheres
				outidam=outidat/out; \\ mesma conta do descrito em cima porem com outros
				homaltm=homaltt/hom; \\ calculo medio de altura dos homens, mesmo pensamento de idade porem as variaveis de altura são dooble para trabalhar com virgula, tambem foi usado dooble em todos os resultados.
				mulaltm=mulaltt/mul; \\ mesmo conta do descrito em cima porem com mulheres
				outaltm=outaltt/out; \\ mesma conta do descrito em cima porem com outros
				
					\\ para a conclusão do exercicio foi exposto dodas as informaçoes solicitadas. 
				System.out.printf("\nA media de idade do grupo e: " +ida+ "."); \\ idade media do grupo exposto
				System.out.printf("\nAltura media das mulheres: "+mulaltm+"."); \\ altura media das mulheres exposto
				System.out.printf("\nA media de idade dos homens e: "+homidam+"."); \\ media de idade dos homens exposto
				System.out.printf("\nA quantidade de pessoas como Outro e "+out+"."); \\ quantidade de pessoas com o genero exposto
				System.out.printf("\n,A faixa de pessoas entre 18 a 35 anos e:"+fax+"."); \\ faixa de pessoas no grupo de 18 a 35 anos de idade
				
	}
}
