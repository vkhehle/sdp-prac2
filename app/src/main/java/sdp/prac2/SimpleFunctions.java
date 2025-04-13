package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static boolean Task5(List<Integer> list){
        if (list == null || list.isEmpty()){
            return true; // null or empty list are considered as sorted
        }
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i) > list.get(i + 1)){
                return false; // find an element that is out of order
            }
        }
        return true; //otherwise all elements are in order
    }
}
