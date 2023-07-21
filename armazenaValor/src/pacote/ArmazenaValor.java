package pacote;
import java.util.Scanner;
public class ArmazenaValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fa�a um algoritmo para ler 15 n�meros e armazenar em um vertor
		
int[] x = obternum();
Impressao.imprimir(x);	
	
	}
	public static int[] obternum() {
		int[]vet = new int[15];
		int aux;
		Scanner sc = new Scanner(System.in); 
		for (int i = 0, z =1; i < vet.length; i++,z++) {
			System.out.println("Usu�rio informe o valor " + z); 
	   		aux = sc.nextInt();	
         verificarVetor(vet, aux);
          vet[i] = aux;	
		
		}
		
		return vet;}	
		
	public static int[] verificarVetor(int[] vetor, int aux) {
			int[]zet = new int[15];
		 	for (int i = 0; i < 15; i++) {
				if (vetor[i] == aux) {
				zet[i] = aux; 	
				}
				else { 
				break;	
				}
			}
		return zet;	
		}


}
