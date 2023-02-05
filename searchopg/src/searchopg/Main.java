package searchopg;
import java.util.Arrays;

public class Main {
	
 public static void main(String[] args) {
	 int[] tabel = {5,1,4,3,7,9,8,2,6};
	 Arrays.sort(tabel);
	 
	 for (int i = 0; i < tabel.length; i++)
		 System.out.print(tabel[i]+",");
	 
	 System.out.println("");
	 System.out.println("det søgte element er er placeret på [" + Arrays.binarySearch(tabel,5)+"]");
	 
 }
 
}
