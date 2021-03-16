package leetcode;


public class twoSum{
	public static void main(String[] args) {
	
		int[] numbers = new int[] { 2, 3, 7, 4 ,8};;
		int target = 7;
		int[] result = getTwoSum(numbers, target);
		System.out.print(result[0] +" " + result[1]);
	}

	    public static int[] getTwoSum(int[] nums, int target) {
	    	
	    	for (int i=0; i<nums.length;i++)	{
	    		for(int j=i+1; j<nums.length; j++) {
	    			int complement = target - nums[i];
	    					
	    			if(nums[j] == complement) {
	    				return new int[] {i, j };
	    			}
	    		}
	    	}
	        
	    	throw new IllegalArgumentException("no match found");
	    }
}