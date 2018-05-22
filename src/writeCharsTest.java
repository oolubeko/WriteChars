import static org.junit.Assert.*;

import org.junit.Test;

public class writeCharsTest {

	@Test
	public void testWriteChars() {
		
		//I will test the base cases, even case, and odd case
		
		int i = 1;
		int j = 2;
		int k = 5;
		int l = 10;
		
		String base1 = "*";
		String base2 = "**";
		String odd = "<<*>>";
		String even = "<<<<**>>>>";
		
		assertEquals(WriteCharacters.writeChars(i), base1);
		assertEquals(WriteCharacters.writeChars(j), base2);
		assertEquals(WriteCharacters.writeChars(k), odd);
		assertEquals(WriteCharacters.writeChars(l), even);
	}

}
