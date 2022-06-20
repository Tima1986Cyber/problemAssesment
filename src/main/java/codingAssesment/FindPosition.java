package codingAssesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPosition {
    // pseudo code
        /*
        to find first index of target:
        1. sorted array will be ran thrue the fori loop to find first index of target number;
        2. if target number is exist in array we will save it in int array;
        3. if target number isnot exist in array we willl save in int array value -1;
        to find last index of target:
        4. sorted array will be ran thrue reverse loop to find last index of target number;
        5. if target number is exist in array we will save it in int array;
        6. if target number isnot exist in array we willl save in int array value -1;
         */


    public static void main(String[] args) {
        System.out.println("Scenario 1: ");
        int[] nums=new int[]{5,7,7,8,8,10};
        int target = 8;


        System.out.println(Arrays.toString(firstAndLastPosition(nums,target)));

        System.out.println("Scenario 2: ");

        int[] nums1=new int[]{5,7,7,8,8,10};
        int target1 = 6;

        System.out.println(Arrays.toString(firstAndLastPosition(nums1,target1)));

    }

    static public int[] firstAndLastPosition(int[] sortedArr, int target) {
        int[] positions = new int[2];
        for (int i = 0; i <sortedArr.length ; i++) {
            if(sortedArr[i]==target){
                positions[0]=i;
                break;
            }else{
                positions[0]=-1;
            }
        }
        for (int k = sortedArr.length-1; k >=0 ; k--) {
            if(sortedArr[k]==target){
                positions[1]=k;
                break;
            }
            else{
                positions[1]=-1;
            }
        }
        return positions;
    }

}

