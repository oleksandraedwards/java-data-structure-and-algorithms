import arrayProblems.BirthayParadox;
import arrayProblems.MoveAllZeroesToEnd;
import arrays.DynamicArray;

public class Main {

    //ADT - abstraction of data structure; provides interface to which ds must adhere to.
    //no details how implemented or in what programming language.
    //ADT = map; implementation = hash map.

    // Big-O notation gives an upper bound of the complexity in the worst case,
    // helps to quantify performance as the input size becomes arbitrarily large.

    //If you are iterating over a single collection of elements using one loop, then run-time will be O(n).
    //If you are iterating over half of the collection, it will be O(n/2) -> O(n).
    //If you are iterating over two separate collections using two different loops, so it will become O(n+m) -> O(n).
    //If you are iterating over a single collection using two nested loops, so it will be O(n²).
    //If you are iterating over two different collections using two nested loops, so it will become O(n*m) -> O(n²).
    //If you are sorting a collection, this becomes O(n*log(n)).

    public static void main(String[] args) {



        System.out.println("ARRAYS:");
//        BirthayParadox birthayParadoxClass = new BirthayParadox();
//        // birthayParadoxClass.birthdayParadox();
//        birthayParadoxClass.birthdayParadox2();


        MoveAllZeroesToEnd moveAllZeroesToEnd = new MoveAllZeroesToEnd();
        moveAllZeroesToEnd.reorder();


    }
}
