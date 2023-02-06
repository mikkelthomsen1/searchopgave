package searchopg;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] table = { 5, 1, 6, 3, 7, 11, 8, 2, 6, 10, 100, 12 }; // array of int search
		Arrays.sort(table); // sort array

		for (int i = 0; i < table.length; i++) { // print array
			System.out.print(table[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(table));

		int index = Arrays.binarySearch(table, 112);

		if (index < 0) { // check if element exists in array
			System.out.println("element does not exist in array");
		} else
			System.out.println("element is located at: [" + index + "]");

		String[] teachers = { "Xiaolei", "Jan", "Flemming" }; // array of strings search
		Arrays.sort(teachers);

		for (int i = 0; i < teachers.length; i++) // Print array
			System.out.print(teachers[i] + ",");

		System.out.println("");

		int index1 = Arrays.binarySearch(teachers, ""); // sort array alphabetical

		if (index1 < 0) { // check if element exists in array
			System.out.println("element does not exist in array");
		} else
			System.out.println("element is located at: [" + index1 + "]");

	}

}
