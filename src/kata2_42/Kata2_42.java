package kata2_42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2_42 {

    public static void main(String[] args) {
        
        int[] array = {2,2,1,3,5,6,7,2,4,6,2,6,9,2,4};
        
        HashMap<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < array.length; i++) {
            if(histogram.containsKey(array[i])){
                histogram.put(array[i],histogram.get(array[i])+1);
            }else{
                histogram.put(array[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            Integer key = entry.getKey();
            System.out.println("Key: " + key + "==>" + histogram.get(key));
        } 
    }
    
}
