package br.senai.sc.TI20141n1daniel.bi;

import br.senai.sc.TI20141n1daniel.bi.dao.Dao;

public class Main {

	public static void main(String[] args) {
		conectar();

	}

	private static void conectar() {
		Dao dao = new Dao() {};
		dao.getConnection();
		
		
	}

}
