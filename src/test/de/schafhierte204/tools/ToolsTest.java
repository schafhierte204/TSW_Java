package de.schafhierte204.tools;

import org.junit.jupiter.api.Test;

class ToolsTest {

	Tools testKlasse;

	@Test
	public void testuseup() {
		testKlasse = new Tools("Hammer", 500, 2020, 500, 100);
		testKlasse.use(100, 0);
		assert testKlasse.getWertAktuell() == 0;
	}

	@Test
	public void testuse() {
		testKlasse = new Tools("Hammer", 500, 2020, 500, 100);
		testKlasse.use(50, 0);
		assert testKlasse.getWertAktuell()==250;
		
		testKlasse.use(50, 0);
		assert testKlasse.getWertAktuell()==0;
	}

	@Test
	public void testupdate() {
		testKlasse = new Tools("Hammer", 500, 2020, 20, 100);
		testKlasse.update(2031, 200);
		assert testKlasse.getWertAktuell()==20;
		
		testKlasse.update(2030, 400);
		assert testKlasse.getWertAktuell()==420;
		
		testKlasse.update(2019, 100);
		assert testKlasse.getWertAktuell()==500;
	}
}
