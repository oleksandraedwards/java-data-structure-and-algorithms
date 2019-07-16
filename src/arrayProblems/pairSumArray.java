package arrayProblems;


public class pairSumArray {

    private int A[] = {7, 8, 2, 5, 3, 1};
    private int sum = 10;

    private void findPair () {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == sum) {
                    System.out.println("index 1: " + i + "index 2: " + j);
                }
            }
        }
        System.out.println("not found");
    }
}
