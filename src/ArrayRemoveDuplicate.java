import java.util.Arrays;
import java.util.HashSet;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        ArrayRemoveDuplicate obj = new ArrayRemoveDuplicate();
        System.out.println(obj.removeDuplicatesImproved(nums));
    }
    public int removeDuplicates(int[] nums){
        HashSet<Integer> vals = new HashSet<>();
        int duplicates=0;
        for (int i=0;i<nums.length;i++){
            if (vals.contains(nums[i])){
                duplicates++;
            } else {
                vals.add(nums[i]);
                nums[i-duplicates] = nums[i];
            }
        }
        return nums.length-duplicates;
    }

    public int removeDuplicatesImproved(int[] nums) {
        int a = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[a] != nums[i]){
                a++;
                nums[a] = nums[i];

            }
        }
        return a+1;
    }
}
