package br.org.softwarepublico.modelo;

import java.io.Serializable;

public class Imovel implements Serializable {

	private static final long serialVersionUID = 5168449993099540127L;
	
	private String matricula;
	
	public Imovel() {}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Imovel)obj).getMatricula().equals(this.getMatricula());
	}

}
