package br.senai.sc.ti20141n1.pw4.jb.bi.model.dominio;


public class Rn {
	
	public void salvar(Dominio dominio) throws Exception {
		if (dominio.getTitulo().trim().isEmpty()) {
			throw new Exception("A ideia é obrigatório!");
		}

	}

	

}
