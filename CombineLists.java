import java.util.ArrayList;
import java.util.List;

public class CombineLists {
    public static List<Object> combineTwoLists(List<Object> list1, List<Object> list2, List<Object> list3) {
        List<Object> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        combinedList.addAll(list3);
        return combinedList;
    }

    public static void main(String[] args) {
        List<Object> list1 = List.of("a", "b", "c");
        List<Object> list2 = List.of(4, 5, 6);
        List<Object> list3 = List.of(7, 8, 9);
        
        List<Object> result = combineTwoLists(list1, list2, list3);
        System.out.println("Combined List: " + result);
    }
}