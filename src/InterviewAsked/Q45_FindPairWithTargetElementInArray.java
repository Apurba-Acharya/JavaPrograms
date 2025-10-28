package InterviewAsked;

public class Q45_FindPairWithTargetElementInArray {

    //BruteForce Method :
//    Find Pair With Target Element In an Array :
//    given array = [2, 7, 11, 15], target = 18,
//    num [1] + num [2] = 7+11 = 18,
//    return [1,2].
    public static void main(String[] args) {
        int nums1 [] = {2, 7, 11, 15};
        int target = 18;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i+1; j < nums1.length; j++) {
                if (nums1[j] == target - nums1[i]){
                    System.out.println("Indices1: " + i + ", " + j);
                    return; // Exit after finding the first valid pair
                }
            }
        }
        System.out.println("No valid indices found");

//        int nums2 [] = {2, 7, 11, 15};
//        int target2 = 13;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums2.length; i++) {
//            int complement = target2 - nums2[i];
//
//            if (map.containsKey(complement)) {
//                System.out.println("Indices2: " + map.get(complement) + ", " + i);
//                return; // Exit after finding the first valid pair
//            }
//
//            map.put(nums2[i], i); // Store the number with its index
//        }
//
//        System.out.println("No valid indices found.");
    }
}
