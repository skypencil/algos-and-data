package org.fivesort;
import java.util.List;
public class FiveSort {
    public static List<Integer> fiveSort(List<Integer> a){
        int end = a.size() -1;
        int front = 0;
        int temp = 0;
        while (front < end){
            if(a.get(end) == 5){
               end--;
               continue;
            }
            if(a.get(front) == 5){
               temp = a.get(end);
               a.set(end, 5);
               a.set(front, temp);
               end--;
               front++;
               continue;
            }
            front++;
        }
       return a;
    }
}