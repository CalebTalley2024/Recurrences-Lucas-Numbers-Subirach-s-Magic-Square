import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        // Part 1
//        System.out.println("Part 1:");
//        Sequence.LucinacciSequence(40);

////
////         Part 2a
//        System.out.println("Part 2: ");
//        // showing the sequence when 40<n<45
//        for (int n = 40;n<=43;n++){
//            Sequence.LucinacciTime(n);
//            System.out.println("The Runtime for Lucas' Fibonacci numbers where n = "+ n + " :  " + Sequence.LucinacciTime(n) + "  milliseconds");
//        }
//        System.out.println();
//
////        Part 2bi
//        // showing the sequence when 40<n<43
//        System.out.println("Ratios for Lucas' fibonacci");
//        for (int n = 40;n<=43;n++){
//            Sequence.LucinacciRatioCalc(n);
//        }
//        System.out.println();
//        // Part 2bii
//
//        for (int n = 40;n<=43;n++){
//            Sequence.LucinacciRatioTime(n);
//        }
//        System.out.println();

        // Part 2biii
//        Sequence.myAnacciSequence(30);
//        System.out.println();
//        System.out.println("Ratios for my custom' fibonacci ");
//        for (int n = 30;n<=33;n++){
//            Sequence.LucinacciRatioCalc(n);
//        }
//        System.out.println();
//        for (int n = 40;n<=43;n++){
//            Sequence.LucinacciRatioTime(n);
//        }
//        System.out.println();

        // Part 3
        System.out.println("Part 3: ");
        //3a
        System.out.println("The number of 4-element combinations that sum up to 33: " + Square.MagicSubSetFour(Square.magicNums).size());
        System.out.println();
        //3b
        System.out.println("The number of combinations that sum up to 33: " + Square.allMagicSubSets(Square.magicNums).size());
        System.out.println();
        //3c

////        System.out.println(IntStream.of(Square.magicNums).sum());
        System.out.println("The \"getSumsHashMap\" method will give you all of the possible sums with their corresponding subsets ");
        System.out.println("The key is the sum, the value is the ArrayList of subsets");
        System.out.println("Example: Here are the subsets for the sum..... 7: "+Square.getSumsHashMap(Square.magicNums).get(7));
        System.out.println();
        Square.mostCombinations(Square.magicNums);
//
//        System.out.println(Square.getPowerSet(Square.testNums));




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

