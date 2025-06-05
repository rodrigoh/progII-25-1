package aula12.exercicio04;

import java.util.Scanner;

public class CadastraPessoa {
	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextLine();
	}

	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int contPessoa=0;
		char opc;
		do{
			System.out.println("Selecione uma opção do menu:");
			System.out.println("c - cadastrar uma pessoa");
			System.out.println("l - listar as pessoas");
			System.out.println("p - pesquisar uma pessoa");
			System.out.println("s - sair");
			opc = leString(" ").toLowerCase().charAt(0);
			switch (opc){
				case 'c'->{
					if(contPessoa<10){
						lista[contPessoa] = new Pessoa();
						lista[contPessoa].nome = leString("Nome");
						lista[contPessoa].eMail = leString("E-mail");
						lista[contPessoa].endereco = leString("Endereço");
						contPessoa++;
					}
				}
				case 'l'->{
					for(int i=0;i<contPessoa;i++){
						System.out.println(lista[i].oberInformacoes());
					}
				}
				case 'p'->{
					String termo = leString("Informe um termo de busca");
					for(int i=0;i<contPessoa;i++) {
						if(lista[i].nome.equalsIgnoreCase(termo) || lista[i].eMail.equalsIgnoreCase(termo)){
							System.out.println(lista[i].oberInformacoes());
						}
					}
				}
			}
		}
		while(opc!='s');
	}
}
