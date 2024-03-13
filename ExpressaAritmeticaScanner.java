import java.util.Scanner; // importa Scanner(Objeto) para dentro do escopo do objeto.

public class ExpressaAritmeticaScanner{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double a = sc.nextDouble();
		System.out.println("Digite um valor: ");
		double b = sc.nextDouble();
		System.out.println("Digite um valor: ");
		double c = sc.nextDouble();	
		System.out.println("Digite um valor: ");
		double d = sc.nextDouble();
		
		
		double result = (a + b) * c / (d - 3);
		
		System.out.printf("O resultado é: %.2f%n", result);
		
		sc.close();
		
		
		
		
	}

}
