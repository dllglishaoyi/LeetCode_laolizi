import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	 public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = hashMap.get(target - numbers[i]);
                return result;
            }
            hashMap.put(numbers[i], i + 1);
        }
        return result;
    }
}
