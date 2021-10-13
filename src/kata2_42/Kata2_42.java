package kata2_42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2_42 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        HashMap<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            String key = entry.getKey();
            System.out.println("Key: " + key + "==>" + histogr.get(key));
        } 
    }

}
