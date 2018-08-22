import java.util.Scanner;
public class BuscaSequencial {
public static void main(String args[]){
        Search = new Search();
	Scanner s = new Scanner(System.in);
	int valor = 0;
	do{
	System.out.println("\n\nInforme o valor de busca");
	valor = s.nextInt();
	System.out.println("--------------------------- Sequencial ---------------------------");
	System.out.println("O valor da busca é " + valor + " ==> " + Search.buscaSequencial(valor) + "\n\n");
	System.out.println("--------------------------- Binario ---------------------------");
	System.out.println("O valor da busca é " + valor + " ==> " + Search.buscaBinaria(valor) + "\n\n");			
	}while(valor != -1);
	}
}

