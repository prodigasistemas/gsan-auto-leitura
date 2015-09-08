package br.gov.softwarepublico.teste.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.softwarepublico.modelo.Imovel;

public class ImovelTeste {
	
	Imovel imovel1;
	Imovel imovel2;
	
	@Before
	public void setup() {
		imovel1 = new Imovel();
		imovel2 = new Imovel();
	}
	
    @Test
    public void imoveisIguais() {
    	imovel1.setMatricula("12345");
    	imovel2.setMatricula("12345");
    	
    	Assert.assertTrue(imovel1.equals(imovel2));
    }
    
    @Test
    public void imoveisDiferentes() {
    	imovel1.setMatricula("12345");
    	imovel2.setMatricula("12344");
    	
    	Assert.assertFalse(imovel1.equals(imovel2));
    }
}
