
public class SearchingValueInArray {
	public static void main(String[] args) {
		int[] numbers = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int key = 26;

		int i = 0;
		boolean number = false; 

		for (i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				number = true;
				break;
			}
		}

		if (number) 
		{
			System.out.println("number " + key + " at index " + i + ".");
		} else {
			System.out.println(key + "is not in this array.");
		}
	}
}
