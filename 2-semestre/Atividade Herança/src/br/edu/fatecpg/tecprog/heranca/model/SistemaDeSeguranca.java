package br.edu.fatecpg.tecprog.heranca.model;

public class SistemaDeSeguranca implements IAutenticavel{
	private String login = "admin";
	private String senha = "1234";
	private boolean teste = false;
	
	@Override
	public void login(String usuario, String senha) {
		if(usuario.equals(this.login) && senha.equals(this.senha)) {
			teste = true;
		}
		else {
			System.out.println("Incorreto, tente novamente.");
		}
		
	}

	@Override
	public void logout() {
		teste = false;
		
	}

	public void conta() {
		if(teste) {
			System.out.println("Seja bem-vindo!");
		}
		else {
			System.out.println("Não está conectado");
		}
	}
}
