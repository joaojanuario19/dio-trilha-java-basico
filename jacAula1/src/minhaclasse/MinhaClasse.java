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
	
		//--------------------FIM AULA anatomia das classes - 3---------------------
		
		//--------------------AULA tipos de variaveis - 3---------------------
		
	/* o java possui oito tipos de dados primitivos (básico)
	 * que precisam ser manipulados para a construção de programas.
	 * são : int, byte, short, long, float, double, bolean e char.
	 * 
	 * esses tipos não são considerados objetos, e portanto representam valors brutos*/
		
		//peculiaridades nas variáveis
		
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333;		//se começar com zero, talvez tenha que ser outro tipo
		int cep1 = 00143221;	//se começar com zero, talvez tenha que ser outro tipo
		String cep01 = "00143221";
		long cpf = 98765432109L;	//se começar com zero, talvez tenha que ser outro tipo
		//long cpf1 = 085432109L;	//se começar com zero, talvez tenha que ser outro tipo	*Deu erro : numero fora da faixa (range)
		float pi = 3.14f;
		double salario = 1275.33;
		
		System.out.println(idade);
		System.out.println(ano);
		System.out.println(cep);
		System.out.println(cep1);
		
		/*cast int -> String com erro
		cep01 = Integer.toString(cep1);*/
		System.out.println(cep01);
		
		System.out.println(pi);
		System.out.println(salario);
		
		//--------------------FIM AULA tipos de variaveis - 3---------------------
		
		//--------------------AULA operadores - 5 ---------------------
		/*	OPERADOR TERNARIO 
		  funciona como uma estrutura condicional, porém o resultado retornado é para a condição (true/false)
		*/
		
		int a,b;
		boolean resultado;
		
		a = 6;
		b = 6;
		
		//EXEMPLO UTILIZANDO UMA ESTRUTURA DE OPERADOR TERNARIO
		
		resultado = a==b ? true : false;
		
		System.out.println(" UTILIZANDO UMA ESTRUTURA DE OPERADOR TERNARIO " + resultado);
		
		//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b){
			resultado = true;
		}else {
			resultado = false;
		}
		
		resultado = !resultado;
		System.out.println(" UTILIZANDO UMA ESTRUTURA IF/ELSE " + resultado);
		
		
		String nome1 = "marcelo";
		int idade1 = 32;
		
		String nome2 = "vargas";
		int idade2 = 25;
		
		String maisVelho = idade1 > idade2 ? nome1 : nome2;
	
		System.out.println(maisVelho);
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
