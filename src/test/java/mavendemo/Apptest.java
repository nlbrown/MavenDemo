package mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Apptest {

	@Test
	public void test() {
		App app = new App(); 
		if(!app.sample().equals("sample")){
			fail("sample not returned");
		}
	}

}
