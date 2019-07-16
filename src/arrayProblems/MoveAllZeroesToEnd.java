package arrayProblems;

import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeroesToEnd {

    private int[] a = {9, 0, 5, 4, 0, 6, 2, 7, 1, 2, 0, 2};

    public void sortArrayDesc() {
        Arrays.sort(a);
        int[] arrDesc = Arrays.stream(a).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arrDesc)); // outputs [6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(a));
    }

    public void reorder()
    {
        // k stores index of next available position
        int k = 0;
        // do for each element
        for (int i: a)
        {
            // if current element is non-zero, put the element at
            // next free position in the array
            if (i != 0) {
                a[k++] = i;
            }
        }
        // move all 0's to the end of the array (remaining indices)
        for (int i = k; i < a.length; i++) {
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
