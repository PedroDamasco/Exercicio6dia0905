package Exercicios;
import java.util.Scanner;

public class CensoDemocratico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int gen,i,fax=0;
		int hom=0,homida=0,homidat=0;
		int mul=0,mulida=0,mulidat=0;
		int out=0,outida=0,outidat=0;
		
		double alt,ida;
		double homalt,homaltt=0,homaltm=0,homidam=0;
		double mulalt,mulaltt=0,mulaltm=0,mulidam=0;
		double outalt,outaltt=0,outaltm=0,outidam=0;
		
		
		for (i=1;i<=1000;i++) {
			System.out.print("\nBoa noite, para um censo na sua cidade iremos fazer 3 perguntas.");
			System.out.printf("\nSeu genero: \n0 -> Feminino \n1 -> Masculino \n2 -> Outro");
			gen=sc.nextInt();
			switch (gen) {
			case 1:
				hom++;
					System.out.printf("informe sua idade:");
					homida=sc.nextInt();
					homidat=homida+homidat;
					System.out.printf("informe sua altura");
					homalt=sc.nextDouble();
					homaltt=homalt+homaltt;
					if (homida >= 18 && homida <= 35) {
						fax++;}
				break;
			case 2:
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
				
			ida=(mulidat+homidat+outidat)/(i-1);
				homidam=homidat/hom;
				mulidam=mulidat/mul;
				outidam=outidat/out;
				homaltm=homaltt/hom;
				mulaltm=mulaltt/mul;
				outaltm=outaltt/out;
				
				System.out.printf("\nA media de idade do grupo e: " +ida+ ".");
				System.out.printf("\nAltura media das mulheres: "+mulaltm+".");
				System.out.printf("\nA media de idade dos homens e: "+homidam+".");
				System.out.printf("\nA quantidade de pessoas como Outro e "+out+".");
				System.out.printf("\n,A faixa de pessoas entre 18 a 35 anos e:"+fax+".");
				
	}
}