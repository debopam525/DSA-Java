public class Linear_search {
    public static void main (String[] args) {
        int[] nums = {18,23,47,53,100};
        int target = 47;
        int ans = linearsearch(nums, target);
        System.out.println(ans);

    }
    static int linearsearch(int[] nums, int target) {
        if(nums.length==0) {
            return -1;
        }
        for(int i=0; i<nums.length; i++) {
            int element = nums[i];
            if(element==target) {
                return i;
            }
        }
        return -1;
    }
    
}
