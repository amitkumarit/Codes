import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(array));
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(new Integer[0]);
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
}
