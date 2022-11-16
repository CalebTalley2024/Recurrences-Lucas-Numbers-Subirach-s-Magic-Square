import java.util.*;
import java.util.stream.IntStream;

public class Square {
    // this is an array of all of the values for the Subirach Magic Square
    ArrayList<Integer> allNumbers = new ArrayList<Integer>(
            Arrays.asList(1, 14, 14, 4, 11, 7, 6, 9, 8, 10, 10, 5,13,2,3,15));
    // magic sum is what each column, row, etc add up to (1 + 14 + 14 + 4)
    int magicSum = 33;

    public static int[] testNums = {1, 2,3,4};
    public static int[] magicNums = {1, 14, 14, 4, 11, 7, 6, 9, 8, 10, 10, 5,13,2,3,15};

    /*
     * Takes in int array set
     * outputs the power set of our inputed set
     *
     * */
    public static ArrayList<ArrayList<Integer>> getPowerSet(int[] nums) {
        ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
        // sort the number array for readability and to account for duplicates
        Arrays.sort(nums);
        // this function will recursively make all of our subsets
        backtrack(powerSet, new ArrayList<>(), nums, 0);
        return powerSet;
    }

    /*
     * recursive function that gets the powerset of a set
     * takes in list of subsets, a slot for making subsets, a set to make subsets from, and a starting index
     * */
    public static void backtrack(ArrayList<ArrayList<Integer>> powerSet, ArrayList<Integer> tempSlot, int[] nums, int start) {
        // adding subsets to our powerset list
        powerSet.add(new ArrayList<>(tempSlot));
//        System.out.println(tempSlot);
        // iterate through all possible numbers
        // for head index of a loop, you will get all of the subsets that contain the value at index i
        // the algorithm will not repeat the same subsets (unless there are two of the same value)
        for (int i = start; i < nums.length; i++) {
            /** make sure that we only have the same elements in a subset when the start is i is at the start position
             (whether in the first for loop or a recursive for loop)*/
            if (i > start && nums[i] == nums[i - 1]) {
                // if we have a duplicate that is not at the start of a function call, skip this subset
                continue;
            } else {
                // adding numbers to our subset creater: tempSlot
                tempSlot.add(nums[i]);
//            System.out.println(tempSlot);
                //recursive call to make all of the subsets that contain the value at index i
                backtrack(powerSet, tempSlot, nums, i + 1);
//            System.out.println("number to be removed: " + tempSlot.get(tempSlot.size()-1));
                // When at the end of the recursive call, remove the last value in our temporary subset slot
                tempSlot.remove(tempSlot.size() - 1);
            }
        }
    }



    // helper function for summing up all of the elements in a list
    public static int getSum(ArrayList<Integer> subset){
        int sum = 0;
        for(int aNum:subset){
            sum += aNum;
        }
        return sum;
    }
    /////////// Part 3
    // 3a
// outputs all of the elements that are 4 elements long that sum up to 33
    public static ArrayList<ArrayList<Integer>> MagicSubSetFour(int[] nums) {
        // get the power set of elements
        ArrayList<ArrayList<Integer>> powerSet = Square.getPowerSet(nums);
        // get rid of alls  possible sub sets that are NOT 4 elements long
        powerSet.removeIf(set -> (set.size() != 4));
        // get rid of all sub sets that do NOT sum up to 33
        powerSet.removeIf(set -> (Square.getSum(set) !=33));
        return powerSet;
    }
    // 3b: There are 35 subsets that sum up to 33
    //
    public static int allMagicSubSets(int[] nums) {
        // get the power set of elements
        ArrayList<ArrayList<Integer>> powerSet = Square.getPowerSet(nums);

        // get rid of all sub sets that do NOT sum up to 33
        powerSet.removeIf(set -> (Square.getSum(set) !=33));
        return powerSet.size();
    }



    //
    // 3c: find all the possible sums for each sub set in the power set

    public static HashMap<Integer,ArrayList<ArrayList<Integer>>> getSumsHashMap(int[]nums){
        // get the powerset from our nums
        ArrayList<ArrayList<Integer>> powerSet = Square.getPowerSet(nums);
        // Use a hashmap
        //Key: the sum value
        // Value: the subsets that sum up to our key/sum value
        HashMap<Integer,ArrayList<ArrayList<Integer>>> sumHashMap = new HashMap<Integer,ArrayList<ArrayList<Integer>>>();

        // our lowest sum will be 0
        // our largest sum will be the sum of everything in our set
        int maxSum = IntStream.of(nums).sum();
        //associate all values with correct keys
        ArrayList<ArrayList<Integer>> powerSetSumValue = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<maxSum;i++){
            int key = i;
            // make a copy of your power set and filter subsets that sum up to your key index

//            powerSetSumValue = powerSet;
//            powerSetSumValue.removeIf(set -> (Square.getSum(set) != key));
            sumHashMap.put(i,sumValidSubSets(i,powerSet));
        }
        /// RETURN HASHMAP THat actually have values
        return sumHashMap;
    }
    /*
    * helper function that collects all of the subsets that sum up to a certain value
    * */
    public static ArrayList<ArrayList<Integer>> sumValidSubSets(int sum,ArrayList<ArrayList<Integer>> powerSetSumValue){

        ArrayList<ArrayList<Integer>> validSubSets = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<powerSetSumValue.size();i++){
            ArrayList<Integer> subset = powerSetSumValue.get(i);
            if(getSum(subset) == sum){
                validSubSets.add(subset);
            }

        }
        return validSubSets;

    }

    // 3d Find the sum with the greatest number of combinations

    // function that will tell us which index has the  most combinations and how many combinations there are
    public static void mostCombinations(int[]nums){
        // get your hash map of power set combinations
        HashMap<Integer,ArrayList<ArrayList<Integer>>> hashMapSums= getSumsHashMap(nums);
        int maxIndex = hashMapSums.size();
        int maxComboKey = 0;
        //maxComboValue will show all the subsets that have the same sum
        ArrayList<ArrayList<Integer>> maxComboValue = new ArrayList<ArrayList<Integer>>();
        int maxComboSize = 0;
        for (int i = 0; i<maxIndex;i++){
            // we use the key "i" to get the power sets that sum up to "i"
            ArrayList<ArrayList<Integer>> subSets = hashMapSums.get(i);
            if(subSets.size() > maxComboSize){
                maxComboValue = subSets;
                maxComboKey = i;
                maxComboSize = subSets.size();
            }
        }
        System.out.println("The sum that created the greatest number of combinations: " + maxComboKey);
        System.out.println("There are "+maxComboSize +" different subsets that sum up to "+ maxComboKey);

    }


}



