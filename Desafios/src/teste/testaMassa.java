package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Massa;
import junit.framework.Assert;

import org.junit.jupiter.api.Test;

class testaMassa {
	public void testMassaInic() {
		Massa massa = new Massa(6000);
		Assert.assertEquals(6000, massa.getMassaInicial(), 0);	
	}
	
	public void testeMassaFinal() {
		Massa massa = new Massa(6000);
		Assert.assertEquals(0.0, massa.getMassaFinal(), 0);
		
	}
	
	public void testeMassaTempo() {
		Massa massa = new Massa(6000);
		Assert.assertEquals(0.0, massa.getTempo(), 0);
	}
}
