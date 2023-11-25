import java.util.Arrays;

public class Practice {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length-1; i++){
            if (numbers[i] + numbers[i+1] == target){
                return new int[] {i, i+1};
            }
        }
        return new int[] {};
    }

    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
