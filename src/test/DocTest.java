package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.DocClass;

class DocTest {

	@Test
	void testingMyPreciousCalulator() {
		DocClass test= new DocClass();
		// assert statements
        assertEquals(18, test.add(10, 8),"");
        assertEquals(2, test.sub(10, 8),"");
        assertEquals(80, test.mul(10, 8),"");
        assertEquals(18, test.add(10, 8),"");
	}

}
