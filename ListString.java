import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListString {

	public static void main(String[] args) {
		
		String normal[] = { "A", "B", "C", "D", "E", "F" };
		
		System.out.println("Initial Array:\n" + Arrays.toString(normal));
		String ne = "G"; // Define new element to add
		List<String> l = new ArrayList<String>(Arrays.asList(normal)); // Convert Array to ArrayList
		l.add(ne); // Add new element in ArrayList l
		normal = l.toArray(normal); // Revert Conversion from ArrayList to Array
		// printing the new Array
		System.out.println("Array with added Value: \n" + Arrays.toString(normal));
	}
}
