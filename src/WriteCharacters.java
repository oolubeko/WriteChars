/*Write a recursive method called writeChars that accepts an integer parameter n and that
*prints out a total of n characters. The middle character of the output should always be
*an asterisk("*"). If you are asked to write out an even number of characters, there
*will be two asterisks in the middle. Before the asterisk(s) you should write out less
*than characters("<"). After the asterisk you should write out greater-than characters
*(">"). Your method should throw an IllegalArgumentException if it is passed a value 
*less than one. For example, the following calls produce the following output:
*
*
*
*	Method Call						Output Produced
*	-----------------------------------------------
*	writeChars(1);					*
*	writeChars(2);					**
*	writeChars(3);					<*>
*	writeChars(4);					<**>
*	writeChars(5);					<<*>>
*	writeChars(6);					<<**>>
*	writeChars(7);					<<<*>>>;
*	writeChars(8);					<<<**>>>;
*	writeChars(9);					<<<<*>>>>;
*	writeChars(10);					<<<<**>>>>;
*
*
*
*
*/

public class WriteCharacters {
	
	public static String writeChars(int n) {
		if(n < 1) {
			throw new IllegalArgumentException("Value " + n + " less than 1");
		}
		
		String s = "";
		if(n == 1) {
			System.out.println("*");
			s += "*";
			return s;
		}
		
		if(n == 2) {
			System.out.println("**");
			s += "**";
			return s;
		}
		
		else if(n % 2 == 0) {
			s = writeCharsLessThanEven(n / 2);
			s += writeCharsGreaterThanEven(n / 2);
		}
		
		else {
			s = writeCharsLessThanOdd((n+1) / 2);
			s += writeCharsGreaterThanOdd((n+1) / 2);
		}
		
		System.out.println();
		return s;
	}
	
	private static String writeCharsLessThanEven(int n) {
		String s = "";
		
		while(n > 1) {
			System.out.print("<");
			s += "<";
			n -= 1;
		}
		
		System.out.print("*");
		s += "*";
		
		return s;
	}
	
	private static String writeCharsGreaterThanEven(int n) {
		String s = "";
		
		System.out.print("*");
		n -= 1;
		s += "*";
		
		while(n > 0) {
			System.out.print(">");
			n -= 1;
			s += ">";
		}
		
		return s;
	}
	
	private static String writeCharsLessThanOdd(int n) {
		
		String s = "";
		while(n > 1) {
			System.out.print("<");
			n -= 1;
			s += "<";
		}
		System.out.print("*");
		s += "*";
		
		return s;
	}
	
	private static String writeCharsGreaterThanOdd(int n) {
		String s = "";
		
		while(n > 1) {
			System.out.print(">");
			n -= 1;
			s += ">";
		}
		
		return s;
	}
	

/*
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			writeChars(i);
		}
	}
*/
}
