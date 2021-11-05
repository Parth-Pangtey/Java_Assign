import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomvaluesinMap {
    public static void main(String[] args) {
        HashMap<Integer , Double> randomMap= new HashMap<>();
        Random r = new Random();

        for(int i = 1 ; i <= 10 ; i++){
            int key = r.nextInt();
            double value = r.nextDouble();
            randomMap.put(key,value);
        }

        for(Map.Entry entry : randomMap.entrySet()){
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }
    }
}