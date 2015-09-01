package br.senai.sc.ti20141n1.pw4.jb.bi;

import br.senai.sc.ti20141n1.pw4.jb.bi.Dao.Dao;

public class Main {

	public static void main(String[] args) {
	conetar();
	
	}

	private static void conetar() {
		Dao dao = new Dao(){};
		dao.getConnection();
	}

	
}
