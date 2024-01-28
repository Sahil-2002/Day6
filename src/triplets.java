import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class triplets {


        public static void main(String[] args) {
            int[] nums = {1, -2, 3, 0, -1, 2};
            findTripletsWithSumZero(nums);
        }

        public static void findTripletsWithSumZero(int[] nums) {
            int count = 0;
            List<List<Integer>> triplets = new ArrayList<>();

            // Sort the array to handle duplicates efficiently
            Arrays.sort(nums);

            int n = nums.length;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                            if (!triplets.contains(triplet)) {
                                triplets.add(triplet);
                                count++;
                            }
                        }
                    }
                }
            }

            System.out.println("Number of distinct triplets: " + count);
            System.out.println("Distinct triplets:");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        }
}

