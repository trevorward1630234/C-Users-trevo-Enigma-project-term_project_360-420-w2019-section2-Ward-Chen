import java.util.*;

public class Rotors
{
	public int rotor1(char value)
	{
		HashMap<Character, Integer> rotor1 = new HashMap<Character, Integer>();
	    rotor1.put('A', 5);
	    rotor1.put('B', 11);
	    rotor1.put('C', 13);
		rotor1.put('D', 6);
		rotor1.put('E', 12);
		rotor1.put('F', 7);
		rotor1.put('G', 4);
		rotor1.put('H', 17);
		rotor1.put('I', 22);
		rotor1.put('J', 26);
		rotor1.put('K', 14);
		rotor1.put('L', 20);
		rotor1.put('M', 15);
		rotor1.put('N', 23);
		rotor1.put('O', 25);
		rotor1.put('P', 8);
		rotor1.put('Q', 24);
		rotor1.put('R', 21);
		rotor1.put('S', 19);
		rotor1.put('T', 16);
		rotor1.put('U', 1);
		rotor1.put('V', 9);
		rotor1.put('W', 2);
		rotor1.put('X', 18);
		rotor1.put('Y', 3);
		rotor1.put('Z', 10);

		return rotor1.get(value);
	}

	public int rotor1Inverse(char value)
	{
		HashMap<Character, Integer> rotor1Inverse = new HashMap<Character, Integer>();
	    rotor1Inverse.put('A', 21);
	    rotor1Inverse.put('B', 23);
	    rotor1Inverse.put('C', 25);
		rotor1Inverse.put('D', 7);
		rotor1Inverse.put('E', 1);
		rotor1Inverse.put('F', 4);
		rotor1Inverse.put('G', 6);
		rotor1Inverse.put('H', 16);
		rotor1Inverse.put('I', 22);
		rotor1Inverse.put('J', 26);
		rotor1Inverse.put('K', 2);
		rotor1Inverse.put('L', 5);
		rotor1Inverse.put('M', 3);
		rotor1Inverse.put('N', 11);
		rotor1Inverse.put('O', 13);
		rotor1Inverse.put('P', 20);
		rotor1Inverse.put('Q', 8);
		rotor1Inverse.put('R', 24);
		rotor1Inverse.put('S', 19);
		rotor1Inverse.put('T', 12);
		rotor1Inverse.put('U', 18);
		rotor1Inverse.put('V', 9);
		rotor1Inverse.put('W', 14);
		rotor1Inverse.put('X', 17);
		rotor1Inverse.put('Y', 15);
		rotor1Inverse.put('Z', 10);

		return rotor1Inverse.get(value);
	}

	public int rotor2(char value)
	{
		HashMap<Character, Integer> rotor2 = new HashMap<Character, Integer>();
		rotor2.put('A', 1);
	    rotor2.put('B', 10);
	    rotor2.put('C', 4);
		rotor2.put('D', 11);
		rotor2.put('E', 19);
		rotor2.put('F', 9);
		rotor2.put('G', 18);
		rotor2.put('H', 21);
		rotor2.put('I', 24);
		rotor2.put('J', 2);
		rotor2.put('K', 12);
		rotor2.put('L', 8);
		rotor2.put('M', 23);
		rotor2.put('N', 20);
		rotor2.put('O', 13);
		rotor2.put('P', 3);
		rotor2.put('Q', 17);
		rotor2.put('R', 7);
		rotor2.put('S', 26);
		rotor2.put('T', 14);
		rotor2.put('U', 16);
		rotor2.put('V', 25);
		rotor2.put('W', 6);
		rotor2.put('X', 22);
		rotor2.put('Y', 15);
		rotor2.put('Z', 5);

		return rotor2.get(value);
	}

	public int rotor2Inverse(char value)
	{
		HashMap<Character, Integer> rotor2Inverse = new HashMap<Character, Integer>();
	    rotor2Inverse.put('A', 1);
	    rotor2Inverse.put('B', 10);
	    rotor2Inverse.put('C', 16);
		rotor2Inverse.put('D', 3);
		rotor2Inverse.put('E', 26);
		rotor2Inverse.put('F', 23);
		rotor2Inverse.put('G', 18);
		rotor2Inverse.put('H', 12);
		rotor2Inverse.put('I', 6);
		rotor2Inverse.put('J', 2);
		rotor2Inverse.put('K', 4);
		rotor2Inverse.put('L', 11);
		rotor2Inverse.put('M', 15);
		rotor2Inverse.put('N', 20);
		rotor2Inverse.put('O', 25);
		rotor2Inverse.put('P', 21);
		rotor2Inverse.put('Q', 17);
		rotor2Inverse.put('R', 7);
		rotor2Inverse.put('S', 5);
		rotor2Inverse.put('T', 14);
		rotor2Inverse.put('U', 8);
		rotor2Inverse.put('V', 24);
		rotor2Inverse.put('W', 13);
		rotor2Inverse.put('X', 9);
		rotor2Inverse.put('Y', 22);
		rotor2Inverse.put('Z', 19);

		return rotor2Inverse.get(value);
	}

	public int rotor3(char value)
	{
		HashMap<Character, Integer> rotor3 = new HashMap<Character, Integer>();
	    rotor3.put('A', 2);
	    rotor3.put('B', 4);
	    rotor3.put('C', 6);
		rotor3.put('D', 8);
		rotor3.put('E', 10);
		rotor3.put('F', 12);
		rotor3.put('G', 3);
		rotor3.put('H', 16);
		rotor3.put('I', 18);
		rotor3.put('J', 20);
		rotor3.put('K', 24);
		rotor3.put('L', 22);
		rotor3.put('M', 26);
		rotor3.put('N', 14);
		rotor3.put('O', 25);
		rotor3.put('P', 5);
		rotor3.put('Q', 9);
		rotor3.put('R', 23);
		rotor3.put('S', 7);
		rotor3.put('T', 1);
		rotor3.put('U', 11);
		rotor3.put('V', 13);
		rotor3.put('W', 21);
		rotor3.put('X', 19);
		rotor3.put('Y', 17);
		rotor3.put('Z', 15);

		return rotor3.get(value);
	}

	public int rotor3Inverse(char value)
	{
		HashMap<Character, Integer> rotor3Inverse = new HashMap<Character, Integer>();
	    rotor3Inverse.put('A', 20);
	    rotor3Inverse.put('B', 1);
	    rotor3Inverse.put('C', 7);
		rotor3Inverse.put('D', 2);
		rotor3Inverse.put('E', 16);
		rotor3Inverse.put('F', 3);
		rotor3Inverse.put('G', 19);
		rotor3Inverse.put('H', 4);
		rotor3Inverse.put('I', 17);
		rotor3Inverse.put('J', 5);
		rotor3Inverse.put('K', 21);
		rotor3Inverse.put('L', 6);
		rotor3Inverse.put('M', 22);
		rotor3Inverse.put('N', 14);
		rotor3Inverse.put('O', 26);
		rotor3Inverse.put('P', 8);
		rotor3Inverse.put('Q', 25);
		rotor3Inverse.put('R', 9);
		rotor3Inverse.put('S', 24);
		rotor3Inverse.put('T', 10);
		rotor3Inverse.put('U', 23);
		rotor3Inverse.put('V', 12);
		rotor3Inverse.put('W', 18);
		rotor3Inverse.put('X', 11);
		rotor3Inverse.put('Y', 15);
		rotor3Inverse.put('Z', 13);

		return rotor3Inverse.get(value);
	}

	public int rotor4(char value)
	{
		HashMap<Character, Integer> rotor4 = new HashMap<Character, Integer>();
	    rotor4.put('A', 5);
	    rotor4.put('B', 19);
	    rotor4.put('C', 15);
		rotor4.put('D', 22);
		rotor4.put('E', 16);
		rotor4.put('F', 26);
		rotor4.put('G', 10);
		rotor4.put('H', 1);
		rotor4.put('I', 25);
		rotor4.put('J', 17);
		rotor4.put('K', 21);
		rotor4.put('L', 9);
		rotor4.put('M', 18);
		rotor4.put('N', 8);
		rotor4.put('O', 24);
		rotor4.put('P', 12);
		rotor4.put('Q', 14);
		rotor4.put('R', 6);
		rotor4.put('S', 20);
		rotor4.put('T', 7);
		rotor4.put('U', 11);
		rotor4.put('V', 4);
		rotor4.put('W', 3);
		rotor4.put('X', 13);
		rotor4.put('Y', 23);
		rotor4.put('Z', 2);

		return rotor4.get(value);
	}

	public int rotor4Inverse(char value)
	{
		HashMap<Character, Integer> rotor4Inverse = new HashMap<Character, Integer>();
	    rotor4Inverse.put('A', 8);
	    rotor4Inverse.put('B', 26);
	    rotor4Inverse.put('C', 23);
		rotor4Inverse.put('D', 22);
		rotor4Inverse.put('E', 1);
		rotor4Inverse.put('F', 18);
		rotor4Inverse.put('G', 20);
		rotor4Inverse.put('H', 14);
		rotor4Inverse.put('I', 12);
		rotor4Inverse.put('J', 7);
		rotor4Inverse.put('K', 21);
		rotor4Inverse.put('L', 16);
		rotor4Inverse.put('M', 24);
		rotor4Inverse.put('N', 15);
		rotor4Inverse.put('O', 3);
		rotor4Inverse.put('P', 5);
		rotor4Inverse.put('Q', 10);
		rotor4Inverse.put('R', 13);
		rotor4Inverse.put('S', 2);
		rotor4Inverse.put('T', 19);
		rotor4Inverse.put('U', 11);
		rotor4Inverse.put('V', 4);
		rotor4Inverse.put('W', 25);
		rotor4Inverse.put('X', 15);
		rotor4Inverse.put('Y', 9);
		rotor4Inverse.put('Z', 6);

		return rotor4Inverse.get(value);
	}

	public int rotor5(char value)
	{
		HashMap<Character, Integer> rotor5 = new HashMap<Character, Integer>();
	    rotor5.put('A', 22);
	    rotor5.put('B', 26);
	    rotor5.put('C', 2);
		rotor5.put('D', 18);
		rotor5.put('E', 7);
		rotor5.put('F', 9);
		rotor5.put('G', 20);
		rotor5.put('H', 25);
		rotor5.put('I', 21);
		rotor5.put('J', 16);
		rotor5.put('K', 19);
		rotor5.put('L', 4);
		rotor5.put('M', 14);
		rotor5.put('N', 8);
		rotor5.put('O', 12);
		rotor5.put('P', 24);
		rotor5.put('Q', 1);
		rotor5.put('R', 23);
		rotor5.put('S', 13);
		rotor5.put('T', 10);
		rotor5.put('U', 17);
		rotor5.put('V', 15);
		rotor5.put('W', 6);
		rotor5.put('X', 5);
		rotor5.put('Y', 3);
		rotor5.put('Z', 11);

		return rotor5.get(value);

	}

	public int rotor5Inverse(char value)
	{
		HashMap<Character, Integer> rotor5Inverse = new HashMap<Character, Integer>();
	    rotor5Inverse.put('A', 17);
	    rotor5Inverse.put('B', 3);
	    rotor5Inverse.put('C', 25);
		rotor5Inverse.put('D', 12);
		rotor5Inverse.put('E', 24);
		rotor5Inverse.put('F', 23);
		rotor5Inverse.put('G', 5);
		rotor5Inverse.put('H', 14);
		rotor5Inverse.put('I', 6);
		rotor5Inverse.put('J', 20);
		rotor5Inverse.put('K', 26);
		rotor5Inverse.put('L', 15);
		rotor5Inverse.put('M', 19);
		rotor5Inverse.put('N', 13);
		rotor5Inverse.put('O', 22);
		rotor5Inverse.put('P', 10);
		rotor5Inverse.put('Q', 21);
		rotor5Inverse.put('R', 4);
		rotor5Inverse.put('S', 11);
		rotor5Inverse.put('T', 7);
		rotor5Inverse.put('U', 9);
		rotor5Inverse.put('V', 1);
		rotor5Inverse.put('W', 18);
		rotor5Inverse.put('X', 16);
		rotor5Inverse.put('Y', 8);
		rotor5Inverse.put('Z', 2);

		return rotor5Inverse.get(value);
	}

	public int reflectorUKWC(char value)
	{
		 HashMap<Character, Integer> reflectorUKWC = new HashMap<Character, Integer>();
	    reflectorUKWC.put('A', 6);
	    reflectorUKWC.put('B', 22);
	    reflectorUKWC.put('C', 16);
		reflectorUKWC.put('D', 10);
		reflectorUKWC.put('E', 9);
		reflectorUKWC.put('F', 1);
		reflectorUKWC.put('G', 15);
		reflectorUKWC.put('H', 25);
		reflectorUKWC.put('I', 5);
		reflectorUKWC.put('J', 4);
		reflectorUKWC.put('K', 18);
		reflectorUKWC.put('L', 26);
		reflectorUKWC.put('M', 24);
		reflectorUKWC.put('N', 23);
		reflectorUKWC.put('O', 7);
		reflectorUKWC.put('P', 3);
		reflectorUKWC.put('Q', 20);
		reflectorUKWC.put('R', 11);
		reflectorUKWC.put('S', 21);
		reflectorUKWC.put('T', 17);
		reflectorUKWC.put('U', 19);
		reflectorUKWC.put('V', 2);
		reflectorUKWC.put('W', 14);
		reflectorUKWC.put('X', 13);
		reflectorUKWC.put('Y', 8);
		reflectorUKWC.put('Z', 12);

		return reflectorUKWC.get(value);

	}

	public static int alphabet(char letter)
	{
		 HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();
	    alphabet.put('A', 1);
	    alphabet.put('B', 2);
	    alphabet.put('C', 3);
		alphabet.put('D', 4);
		alphabet.put('E', 4);
		alphabet.put('F', 5);
		alphabet.put('G', 6);
		alphabet.put('H', 8);
		alphabet.put('I', 9);
		alphabet.put('J', 10);
		alphabet.put('K', 11);
		alphabet.put('L', 12);
		alphabet.put('M', 13);
		alphabet.put('N', 14);
		alphabet.put('O', 15);
		alphabet.put('P', 16);
		alphabet.put('Q', 17);
		alphabet.put('R', 18);
		alphabet.put('S', 19);
		alphabet.put('T', 20);
		alphabet.put('U', 21);
		alphabet.put('V', 22);
		alphabet.put('W', 23);
		alphabet.put('X', 24);
		alphabet.put('Y', 25);
		alphabet.put('Z', 26);

		return alphabet.get(letter);
	}

	public static char alphabetInv(int value)
	{
		HashMap<Integer, Character> alphabetInv = new HashMap<Integer, Character>();
	    alphabetInv.put(1, 'A');
	    alphabetInv.put(2, 'B');
	    alphabetInv.put(3, 'C');
		alphabetInv.put(4, 'D');
		alphabetInv.put(5, 'E');
		alphabetInv.put(6, 'F');
		alphabetInv.put(7, 'G');
		alphabetInv.put(8, 'H');
		alphabetInv.put(9, 'I');
		alphabetInv.put(10, 'J');  
		alphabetInv.put(11, 'K');
		alphabetInv.put(12, 'L');
		alphabetInv.put(13, 'M');
		alphabetInv.put(14, 'N');
		alphabetInv.put(15, 'O');
		alphabetInv.put(16, 'P');
		alphabetInv.put(17, 'Q');
		alphabetInv.put(18, 'R');
		alphabetInv.put(19, 'S');
		alphabetInv.put(20, 'T');
		alphabetInv.put(21, 'U');
		alphabetInv.put(22, 'V');
		alphabetInv.put(23, 'W');
		alphabetInv.put(24, 'X');
		alphabetInv.put(25, 'Y');
		alphabetInv.put(26, 'Z');

		return alphabetInv.get(value);
	}
}