import java.util.ArrayList;
import java.util.List;

public class AlternateCombine {
    public static List<Object> alternateCombine(List<Object> list1, List<Object> list2) {
		 
        List<Object> result = new ArrayList<>();
		  
        for (int count = 0; count < Math.max(list1.size(), list2.size()); count++) {
            if (count < list1.size()) result.add(list1.get(count));
            if (count < list2.size()) result.add(list2.get(count));
			  
			  
        }
        return result;
    }

    public static void main(String[] args) {
		 
        List<Object> list1 = List.of('a', 'b', 'c', 'd');
        List<Object> list2 = List.of("welcome", 4, 22);
		  
        System.out.println("Alternating List: " + alternateCombine(list1, list2));
    }
}
