package kata2_42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2_42 {

    public static void main(String[] args) {
        
        int[] data = {2,2,1,3,5,6,7,2,4,6,2,6,9,2,4};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        HashMap<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            Integer key = entry.getKey();
            System.out.println("Key: " + key + "==>" + histogr.get(key));
        } 
    }
    
}
