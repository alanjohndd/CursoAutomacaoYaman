package br.com.StepTeste;


import org.junit.Test;

import br.com.BasePage.BasePageTurma3;


public class StepTeste1 extends BasePageTurma3 {

	BasePageTurma3 orquestrador;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Test
	public void realizarLogin() throws Throwable{
		acessarLogin();
	}
	@Test
	public void realizarAcessoCadastro() throws Throwable{
		acessarLogin();
		acessarCriarConta();
	}
	@Test
	public void realizarCadastroUser() throws Throwable{
		acessarLogin();
		acessarCriarConta();
		realizarCadastro();
	}
}
