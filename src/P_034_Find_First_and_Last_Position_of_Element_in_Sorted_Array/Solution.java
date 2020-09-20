package P_034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        double start= System.currentTimeMillis();
        int [] numbers2 = new int[400000000];
        Arrays.fill(numbers2,6);
        int res []= searchRange(numbers2,6);

        System.out.println(System.currentTimeMillis()-start);

        //    int [] numbers = {-3,-2,0,1,2,3,4,5,6,7,9,10,13,13,13,13};
        //   int [] res= searchRange(numbers,13);

//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+ " ");
//        }

    }
    public static int[] searchRange(int[] nums, int target) {

        if(nums.length==0)
            return new int[]{-1,-1};

        int currentPosition=nums.length/2;
        int from = 0;
        int to = nums.length;

        while (true){

            if(nums[currentPosition]==target)
                break;

            if(from+1 == to && currentPosition==from)
                return new int []{-1,-1};

            if(nums[currentPosition] > target)
                to=currentPosition;
            else
                from = currentPosition;

            currentPosition = (to + from) / 2;

        }

        int toRight=currentPosition;

        while(true){
            if(toRight==nums.length-1)
                break;

            if(nums[++toRight] != target) {
                toRight--;
                break;
            }
        }

        int toLeft = currentPosition;

        while(true){
            if(toLeft == 0)
                break;

            if(nums[--toLeft] != target) {
                toLeft++;
                break;
            }
        }

        return new int[]{toLeft,toRight};
    }
}
