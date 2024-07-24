package minhaclasse;

public class Operadores {
	public static void main(String[] args) {
		int a = 6, b = 8;
		boolean simNao;
		
		simNao = a == b ? true : false; //operador ternário
		
		System.out.println(simNao);
		
		if(simNao == true){
			System.out.println("A condição é verdadeira");
		}
		
		if(a > b) {
			System.out.println("a maior que b");
		}
		
		if(a < b){
			System.out.println("b maior que a");
		}
		
		if(a != b){
			System.out.println("a diferente b ");
		}
		
		
		String nome1 = "João";
		String nome2 = "João";
		String nome3 = new String("João"); // nome3(objeto) != nome1(variável)
		
		if(nome1 == nome2) {
			System.out.println("os nomes são iguais");
		}
		
		if(nome1 == nome3) {
			System.out.println("os nomes são iguais");
		}
		
		if(nome1.equals(nome3)) {	//função .equals compara o conteúdo das variáveis/ objetos
			System.out.println("os conteúdos dos nomes são iguais");
		}
		
		
	}
}
