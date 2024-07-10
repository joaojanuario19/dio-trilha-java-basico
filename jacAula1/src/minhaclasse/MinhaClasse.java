package minhaclasse;

public class MinhaClasse {
	public static void main (String[] args) {
		System.out.print("olá mundo ");	//sem quebra de linha
		System.out.println("Hello world !"); //com quebra de linha
		System.out.println("Haja coração !!!");
		final String BR = "Brasil";	//variavel final não pode ter o seu valor alterado
		//BR = "USA";
		
		//--------------------AULA anatomia das classes - 3---------------------
		
		int $num = 000;	//nomeclatura válida
		//int 99kk = 900 //nomeclatura inválida
		String pepe = "portugal"; //nomeclatura válida
		String _pepe; //nomeclatura válida
		
		String primeiroNome = "Gleyson";
		String segundoNome = "Sampaio";
		String nome = "João";
	
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //parametros válidos
		System.out.println(nomeCompleto);
	
		String nomeP = nomeCompleto(nome, " ");	//parametros válidos
		System.out.println(nomeP);
		
		int aresta1 = 52;
		int aresta2 = 107;
		
		int tot = somar(aresta1,aresta2);
		System.out.println(aresta1 + " + " + aresta2 + "= "+ tot);
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "retorno do método nomeCompleto :" + primeiroNome.concat(" ").concat(segundoNome);
		//pode usar o método concat ou sinal de soma (+) para realizar concatenação de conteúdo
	}
	
	public static int somar(int num1, int num2) {
		int a,b;
		a = num1;		//forma básica
		b = num2;
		
		return (a+b);
	}
	
}
