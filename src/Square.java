import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Square {
    // this is an array of all of the values for the Subirach Magic Square
    ArrayList<Integer> allNumbers = new ArrayList<Integer>(
            Arrays.asList(1,14,14,4,11,7,6,9,8,10,10,5));


    // magic sum is what each column, row, etc add up to (1 + 14 + 14 + 4)
    int magicSum = 33;

    // 3a Find all 4-element combinations that have the same sum as magicSum

    // gives you all of the subsets in the array
    public ArrayList<Integer> powerset(int n){
        // get all of the numbers
        ArrayList<Integer> allNumbers = this.allNumbers;

        // make a stack to place items
        Stack<Integer> numStack = new Stack<Integer>();

        for (int i = 0; i<allNumbers.size(); i++){
            // set your node
            int node = allNumbers.get(i);
            // remove node from list
            allNumbers.remove(i);




        }

    }

}
