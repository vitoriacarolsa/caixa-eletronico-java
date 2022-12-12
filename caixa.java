import java.util.Scanner;

public class CaixaEletronico {
	 
public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		if (nome == ""){
			System.out.println("Digite um nome válido");
			nome = teclado.nextLine();
		}
		else{
			System.out.println("Olá "+ nome +", é um prazer ter você por aqui!");
		
			System.out.println("Selecione uma opção 1.) Saldo 2.) Extrato 3.) Saque 4.) Depósito 5.) Tranferência 6.) Sair");
		    int escolha = teclado.nextInt();
		switch (escolha){
		case 1: 
			validar_senha();
			ver_saldo();
			break;
		case 2:
			validar_senha();
			ver_extrato();
			break;
		case 3:
			validar_senha();
			fazer_saque();
			break;
		case 4:
			fazer_deposito();
			break;
		case 5:
			validar_senha();
			fazer_transferencia();
			break;
		case 6:
			sair();
			break;
		default:
			erro();
		}
}
		teclado.close();
}
	    private static void fazer_transferencia() {
	    	Scanner teclado = new Scanner(System.in);
	    	Double conta;
	    	Double transferencia;
	    	System.out.println("Nos informe o número da conta: ");
	    	conta = teclado.nextDouble();
	    	if(conta <=0 ) {
				System.out.println("Informe um número válido: ");
				fazer_transferencia();
			}
	    	else  {
	    		System.out.println("Qual o valor da transferência: ");
		    	transferencia = teclado.nextDouble();
		    	 if ( transferencia <= 0 || transferencia > saldo) {
		    	      System.out.println("Você não possui saldo o suficiente, tente novamente:");
		    	      fazer_transferencia();
		    	      inicio();
		    	    }
		    	 else {  	 
		    	saldo -= transferencia;
				System.out.println("Tranferência realizada!");
				ver_saldo();
				inicio();
		    	 }
		    	    }
	    	teclado.close();
	    	} 
		private static void ver_extrato() {
	System.out.println("Super Mercado Irmãos ---R$ 100,50 " + "Caedu ---R$ 150,20 " + "Tenis Bar---R$ 350,50" );
			  inicio();
		}
		private static void validar_senha() {
	    	Scanner teclado = new Scanner(System.in);
	    	int senha = 3589;
	    System.out.println("Por favor, Digite sua senha");
	    senha = teclado.nextInt();
	    
	    if (senha != 3589) {
	    	System.out.println("Por favor, informe uma senha válida.");
	    	validar_senha();
	    }
	    else {
	    	System.out.println("Senha validada.");
	    }
	    teclado.close();
}
		static double saldo = 100;

	   
	    public static void ver_saldo() {
	      System.out.println("Seu saldo atual é: " + saldo);
	      inicio();
	      }
	      public static void fazer_deposito() {

	    	    System.out.println("Qual o valor a ser depositado?");
	    	    Scanner teclado = new Scanner(System.in);
	    	    Double deposito = teclado.nextDouble();


	    	    if ( deposito <= 0) {
	    	      System.out.println("Por favor, informe um número válido:");
	    	      fazer_deposito();
	    	    } else {
	    	      saldo += deposito;
	    	      ver_saldo();
	    	      inicio();
	    	    }

	    	    teclado.close();
	      }
	    	    public static void fazer_saque() {
	    	        System.out.println("Qual o valor para saque?");
	    	        Scanner teclado = new Scanner(System.in);
	    	        Double saque = teclado.nextDouble();  

	    	        if (saque <=0 || saque > saldo) {
	    	          System.out.println("Saldo indisponível, tente novamente:");
	    	          fazer_saque();
	    	        } else {
	    	          saldo -= saque;
	    	          ver_saldo();
	    	          inicio();

	    	        }
	    	        teclado.close();
	    	      }
	    	        public static void sair() {
	    	            System.out.println("Você deseja sair? S/N");

	    	            Scanner teclado = new Scanner(System.in);
	    	            String escolha = teclado.nextLine();

	    	            if (escolha.equals("S")) {
	    	              System.out.println(nome +", foi um prazer ter você por aqui!");
	    	              System.exit(0);
	    	            } else if (escolha.equals("N")) {
	    	              inicio();
	    	              
	    	            } else {
	    	              System.out.println("Inválido!");
	    	              sair();
	    	            }
	    	            teclado.close();
	    	        }
	    	        
	    	            public static void erro() {
	    	                System.out.println("Por favor, informe um número entre 1 e 6");
	    	                main(null);
	    	              }
	    	            
		
	}