package br.com.fiap.negocio;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBO {
	public boolean autentica(String login, String password) {
		if(login.equals("fiap") && password.equals("tds")) {
			return true;
		}else {
			return false;
		}
	}
	public List<String> recuperaAcoes(String login){
		List<String> acoes = new ArrayList<>();
		acoes.add("Consulta Pessoa");
		acoes.add("Cadastra Pessoa");
		acoes.add("Altera Pessoa");
		return acoes;
	}
}
