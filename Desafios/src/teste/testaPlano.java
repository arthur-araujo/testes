package teste;

import static org.junit.jupiter.api.Assertions.*;
import dominio.Plano;
import junit.framework.Assert;


import org.junit.jupiter.api.Test;

class testaPlano {
	public void test() {
		Plano plano = new Plano(6, 54, 4, 5);
		Assert.assertEquals(49.040779818725586, plano.calculaDistancia(), 0);
	}

}
