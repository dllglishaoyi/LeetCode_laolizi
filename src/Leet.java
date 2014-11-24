import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Leet {
	public static void main(String[] args) {
		int a[] = {2,3,56,6,9};
		Two_Sum two_Sum = new Two_Sum();
		int[] resault = two_Sum.twoSum(a,11);
		for (int i = 0; i < resault.length; i++) {
			System.out.println(resault[i]);
		}
		
    }
}
