import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int req = target - arr[i];
            if(map.containsKey(req)) {
                int[] ans = new int[2];
                ans[0] = map.get(req);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return new int[2];
    }
}
