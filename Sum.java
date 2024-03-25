import java.util.Arrays;
// import Arrays class to use inbuilt sum() method
import java.io.*;

class Mainsum {
	public static void main (String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int sum = Arrays.stream(nums).sum();
		System.out.println(sum);
	}
}
