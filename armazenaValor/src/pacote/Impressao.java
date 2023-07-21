package pacote;

public class Impressao {
	public static void imprimir(String str) {
	System.out.println(str);
}

public static void imprimir(int vlr) {
	System.out.println(vlr);
}

public static void imprimir(double vlr) {
	System.out.printf("%.2f",vlr);
}


public static void imprimir(String[] vet) {
	System.out.println();
	for (int i = 0; i < vet.length; i++) {
		System.out.print(vet[i] + " ");
	}
}

public static void imprimir(int[] vet) {
	System.out.println();
	for (int i = 0; i < vet.length; i++) {
		System.out.print(vet[i] + " ");
	}
}

public static void imprimir(String[] vet1, String[] vet2) {
	System.out.println();
	for (int i = 0; i < vet1.length; i++) {
		System.out.println(vet1[i] + " <-> " + vet2[i]);
	}
}

public static void imprimir(String[] vet1, String[] vet2, int[] vet3) {
	System.out.println();
	for (int i = 0; i < vet1.length; i++) {
		System.out.println(vet1[i] + " (" 
				+ vet3[i] + ") <-> " + vet2[i]);



	}
}


//public static void imprimir(int[][] normalmente) {
//for (int iL = 0; iL < normalmente.length; iL++) {
//	for (int iC = 0; iC < normalmente[iL].length; iC++) {
//		System.out.print(normalmente[iL][iC] + " ");
//	}
//	System.out.println();
//}
//}

public static void imprimircomzeros(int[][]alvo) {  
	int ultimoindicedelinha = alvo.length-1,ultimoindicedecoluna=alvo[0].length-1;
    int tam = (alvo[ultimoindicedelinha][ultimoindicedecoluna]+"").length();
for (int i = 0; i < alvo.length; i++) {
		for (int j = 0; j < alvo[i].length; j++) {
	System.out.print(colocaZero(alvo[i][j], tam, "z") + " "); //aqui que voc� vai editar como imprimir seu impressao com zeros.
		}
		System.out.println();  //
	}
}

public static void imprimir(String[][] normalmente) {
	for (int iL = 0; iL < normalmente.length; iL++) {
		for (int iC = 0; iC < normalmente[iL].length; iC++) {
			System.out.print(normalmente[iL][iC] + " ");
		}
		System.out.println();
	}
}

public static void imprimir(char[][] normalmente) {
	for (int iL = 0; iL < normalmente.length; iL++) {
		for (int iC = 0; iC < normalmente[iL].length; iC++) {
			System.out.print(normalmente[iL][iC] + " ");
		}
		System.out.println();
	}
}
public static String colocaZero(int valor, int quantidade, String elemento) {  
int tam = quantidade - (valor+"").length();//
//tranformando|valor inteiro em String .lenght(); para pegar tamanho do valor MISTURADO com a String.
String res = "";
for (int i = 0; i < tam; i++) { // para adicionar zeros a esquerda.
	res +=elemento;
}

return res + valor;}



}
