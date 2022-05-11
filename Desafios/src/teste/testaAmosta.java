package teste;

import org.junit.jupiter.api.Test;

import dominio.Amostra;
import junit.framework.Assert;

public class testaAmosta {
	
	@Test
	
	public void testeConfiguracao(){
		Amostra amostra = new Amostra (6, 9,74 ,10000);
		Assert.assertEquals(7, amostra.informaGrau (), 0);
	}
}