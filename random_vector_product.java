/* openjdk 11.0.1
 * Pseudo-random-dot-vector-product
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class random_vector_product {

    static HashMap<String, List<Integer>> GenerateVectors(int max) {
        HashMap<String, List<Integer>> vectors = new HashMap<>();
        if (max%2 == 0) {
            for (int i = 0; i < max; i++) {
                List<Integer> this_vector = new ArrayList<>();
                for (int n = 0; n < 4;) {
                    int this_number = (int)(Math.random() * 100);
                    if (this_vector.contains(this_number)) {
                        continue;
                    } else {
                        this_vector.add(this_number);
                        n++;
                    }
                }
                vectors.put(String.valueOf(i), this_vector);
            }
            System.out.println(vectors.toString());
        } else {
            throw new java.lang.RuntimeException("The Number " + max + " is not even!");
        }
        return vectors;
    }

    static HashMap<String, Integer> CalculateDotProduct(HashMap<String, List<Integer>> vectors) {
        HashMap<String, Integer> dot_products = new HashMap<>();
        for (String key : vectors.keySet()) {
            dot_products.put(key,(vectors.get(key).get(0)*vectors.get(key).get(2)+vectors.get(key).get(1)*vectors.get(key).get(3)));
        }
        return dot_products;
    }

    public static void main(String[] args) {
        System.out.println(CalculateDotProduct(GenerateVectors(10)).toString());
        /*for (String i : vectors) {
            System.out.println(i);
        }*/
    }
}