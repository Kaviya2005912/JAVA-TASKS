import java.util.*;
public class Hello11{
    public static void main(String[]args){
        char arr[]={'m','a','l','a','y','a','l','a','m'};
        int temp;
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    }
