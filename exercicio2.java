package repeticao;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	int numero, par = 0, x;
	Scanner leia= new Scanner (System.in); 
	for (numero=1; numero<=10; numero ++) {
		System.out.println("informe 10 numeros");
		x= leia.nextInt();
		if (x%2==0)
			par++;
		
	
	}
	System.out.println("os numeros pares são "+par+" os numeros impares são "+(10-par));
	}
}
