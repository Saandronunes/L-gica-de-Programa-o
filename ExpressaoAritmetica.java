public class ExpressaoAritmetica{
	//inicio do método main, que trará o escopo do projeto(Exercício).
	public static void main(String[] args) {
		
		// variáveis contendo resultado exigidos pelo usuário.int a = 2; 
		double a = 2;
		double b = 7;
		double c = 3;
		double d = 1;
		
		
		//expressão aritmética, contendo a variável que levara o resultado.
		double resultado = (a + b)*c/(d-3);  
		
		
		//impressão na tela do resultado.
		System.out.printf("O resultado da Expressão Aritmética é igual a %d%n", resultado);
				
		
		
	}
}