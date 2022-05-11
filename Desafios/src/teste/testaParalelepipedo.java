package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import dominio.Paralelepipedo;
import junit.framework.Assert;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class testaParalelepipedo {

	public void test() {
		Paralelepipedo retcub = new Paralelepipedo(8, 14, 7);
		Assert.assertEquals(17.5783958435086, retcub.calculaDiagonal(), 0);
	}

}
