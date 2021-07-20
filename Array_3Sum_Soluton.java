class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        ArrayList<List<Integer>> resultArray=new  ArrayList<>();       
        for(int i=0;i<nums.length;i++)
        {                      
            for(int j=i+1;j<nums.length;j++)
            {           
                for(int k=j+1;k<nums.length;k++)
                { 
                     if((nums[i]+nums[j]+nums[k])==0)
                        {   
                            ArrayList<Integer> res=new ArrayList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            if(!resultArray.contains(res))
                            {
                                resultArray.add(res);
                            }
                        }                    
                }
            }
        }
    return resultArray;
    }
}
