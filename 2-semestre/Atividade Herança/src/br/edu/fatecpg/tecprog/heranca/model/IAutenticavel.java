package br.edu.fatecpg.tecprog.heranca.model;

public interface IAutenticavel {
	public void login(String usuario, String senha);
	public void logout();
}
