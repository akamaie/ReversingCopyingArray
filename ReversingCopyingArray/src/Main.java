import java.util.Arrays;

public class Main {
	//Method to copy the original array to a new array
	public static int[] copy(int[] array) {
		int[] newArray = new int[array.length];
		int count = 0;
		for(int number : array) {
			newArray[count] = number;
			count++;
		}
		return newArray;
	}
	
	//Method to reverse the copied array
	public static int[] reverse(int[] array) {
		int[] newArray = new int[array.length];
		int count = 0;
		for(int i = array.length - 1; i >= 0; i--) {
			newArray[count] = array[i];
			count++;
		}
		return newArray;
	}
	
	public static void main(String args[]) {
		int[] original = {1, 2, 3, 4};
		int[] copied = copy(original);
		int[] reverse = reverse(original);
		
		//change the copied first element
		copied[0] = 99;
		
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("copied: " + Arrays.toString(copied));
		System.out.println("reversed: " + Arrays.toString(reverse));
	}
}
