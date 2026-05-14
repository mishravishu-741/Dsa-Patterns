class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxdiff=Integer.MAX_VALUE;
        int value=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int s=nums[i]+nums[left]+nums[right];
                if(s==target){
                    return s;
                }else if(s<target){
                    int diff=Math.abs(s-target);
                    if(diff<maxdiff){
                        maxdiff=diff;
                        value=nums[i]+nums[left]+nums[right];
                        
                    }
                    left++;
                    
                }else{
                     int diff=Math.abs(s-target);
                    if(diff<maxdiff){
                        maxdiff=diff;
                        value=nums[i]+nums[left]+nums[right];
                        
                    }
                    right--;

                }
            }

        }
        return value;
        
    }
}
