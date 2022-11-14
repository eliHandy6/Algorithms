
package algorithms;

import java.util.HashMap;

/*Given an array of integers 
     *Find 2 indices that results to a given target
     *For Example given {1,9,20,12,22} and target as 31,it should return index {1,4} //because 9+22 =31
     * 
    **/

 /*Solution: we are going to use HashMap to have O(n) through storing the complements of each element in the array and the current index
     *That is storing target-arr[i],i
     *for example   31-1,0  ->30,0
                    31-9,1  ->22,1
                    31-20,2 ->11,2
                    31-12,2 ->19,3
                    31-22,3 ->9 ,4
       constructing the logic
          1.loop through the array     
                for(int i=0;i<arr.length;i++){
               
          2.if arr[i] exits in the HashMap ,then you have the answer.
              ..How?
                for example ,arr[0]==1 ,1 does not exist in the above hashmap(a),Skip
                             arr[1]==9 ,9 does  exists in the above hashmap(a)     
                                   first position=> arr[1] 
                                        to obtain the 2nd position,check the hashmap and get the index with the value 9,from the above table its 4
                 answer ={1,4}
          
    */

public class TwoSumBestCase {
    
    public static void main(String args[]){
        int arr[]={1,9,20,12,22};
        int target=31;
        int[] solution=twoSum(arr,target);
        for (int i = 0; i < solution.length; i++) {
            System.out.printf(solution[i]+", ");
        }
    }
    
    
   
    public static int[]twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                   return new int[]{map.get(arr[i]),i};          
            }else{
                   map.put(target-arr[i], i);   
            }
        }
        return new int[]{0,0};
    }
     
    
}
