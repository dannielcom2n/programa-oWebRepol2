package br.senai.sc.TI20141n1daniel.bi.model.dominio;

public class UserRn {

	public void salvar(User user) throws Exception {
		if (user.getNome().length() < 10) {
			throw new Exception("O nome deve possuir no minimo 10 caracteres");

		}
		if (user.getNome().contains(" ")) {
			throw new Exception("Nome invalido");
		}
	}

}
