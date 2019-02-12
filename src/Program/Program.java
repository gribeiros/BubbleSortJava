package Program;

import java.util.Random;
import java.util.Scanner;

import entities.Obubble;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Obubble bubble = new Obubble();
		
		Integer[] numero = new Integer[100000];
		int a,tDados = 100000;
		for (a = 0; a < tDados; a++) {
			numero[a] = rand.nextInt(101);
		}

		System.out.print(bubble.burble_sort(numero, tDados));
		
		sc.close();
	}
}
