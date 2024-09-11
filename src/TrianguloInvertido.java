import java.util.Scanner;

public class TrianguloInvertido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la altura del triangulo");
		int altura = sc.nextInt();
		
		for (int i = 0; i <= altura ; i++ ) {
			for(int j = altura ; j != 0; j--) {
				if ( i == j) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
