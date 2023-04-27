/**
 *
 * @author Yagor
 */
public class Solution {

    public int[] twoSum(int[] nums,int target){
        int[] resultado = {-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i != j && nums[i]+nums[j]==target){
                    resultado[0] = i;
                    resultado[1] = j;
                    return resultado;
                }
            }
        }
        return resultado;
    }
}
