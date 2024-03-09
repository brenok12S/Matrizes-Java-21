package application;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a ordem da matriz : ");
		int ordem = sc.nextInt();
		
		int mat[][] = new int [ordem][ordem];
		
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.print("Main diagonal : ");
		
		for (int i = 0; i < ordem; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		
		System.out.println();
		
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative number : " + count);
		
		sc.close();

	}

}
