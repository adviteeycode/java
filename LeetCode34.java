public class LeetCode34{
    static int calcMid(int start, int end){
        return (int)((start+end)/2);
    }
    static int[] searchRange(int nums[], int target){
        int res[] = new int[2];
        res[0] = res[1] = -1;       // initializing the array
        
        if(nums.length == 0){           // handling empty array case
           return res;
        }

        int s = 0, e = nums.length -1;
        int mid = calcMid(s,e);
        while (s<e && nums[mid] != target) {
            if(target < nums[mid]){
                e = mid;
            }else{
                s = mid+1;
            }
            mid = calcMid(s, e);
        }
        int i = mid; 
        while(i>=0 && nums[i]==target){
            res[0] = i--;
        }
        int j = mid;
        while (j<nums.length && nums[j] == target) {
            res[1] = j++;
        }
        return res;
    }
    public static void main(String args[]){
        int nums[] = {};
        int target = 6;

        int result[] = searchRange(nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
}