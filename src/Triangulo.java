import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la altura del triangulo");
		int altura = sc.nextInt();
		
		for (int i = 0; i < altura; i++ ) {
			for(int j = 0; j < altura; j++) {
				System.out.print("*");
				if (i == j) {
					break;
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
