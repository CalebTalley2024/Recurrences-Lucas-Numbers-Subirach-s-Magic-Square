import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // Part 2a
//        int n = 0;
//        while( n<30){
//            //Sequence.LucinacciRatioCalc(n);
//            Sequence.myAnacciRatioTime(30);
//            n++;
//        }
//        Sequence.LucinacciRatioCalc(40);
//        Sequence.LucinacciRatioTime(40);
//        System.out.println(myAnacci(30));
//        myAnacciRatioCalc(20);
//        Sequence.myAnacciRatioTime(30);
//          myAnacciTime(20);
        // Part 3a
        // test for power set function

//        System.out.println(Square.getPowerSet(Square.magicNums));
//        System.out.println(Square.MagicSubSetFour(Square.magicNums));
//
//        System.out.println(Square.allMagicSubSets(Square.magicNums));
//        System.out.println(IntStream.of(Square.magicNums).sum());
        System.out.println(Square.getSumsHashMap(Square.magicNums).get(33));



    }

}

/*
* 3
* a
* all 4 element combginations with sum of 33
* b: all combinations with sum 33
* c: ways every sum can be formed (include 0)
* d: most popular sum
* Bonus:L explain Subirachs Magic Square
* Bonus: what else is Lucas known for
*
*
* Plan
* make algorithm that gets all of the combinations, then filter with for loops and hashmaps
* */

