import java.util.ArrayList;
import java.util.Vector;

public class alpahbet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alphabetList = new ArrayList<String>(10);
		alphabetList.add("A");
		alphabetList.add("B");
		alphabetList.add("C");
		alphabetList.add("D");
		alphabetList.add("E");
		alphabetList.add("F");
		alphabetList.add("G");
		alphabetList.add("H");
		alphabetList.add("I");
		alphabetList.add("J");
		//alphabetList.add("K");

		if (alphabetList.size() > 10) {
			throw new ArrayIndexOutOfBoundsException("alpahbetList larger than expected");
		} else if (alphabetList.size() == 0) {
			throw new RuntimeException("Queue underflow");
		} else if (alphabetList.size() == 10)
			System.out.println("Array List contains: " + alphabetList);
	}

}
