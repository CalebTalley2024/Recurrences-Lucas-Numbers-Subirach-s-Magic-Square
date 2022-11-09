public class Main {
    // Part 1
    // returns Lucas numbers
    public static int Lucinacci(int n){

        switch(n){
            case 0:
                return 2;
            case 1:
                return 1;
            default:
                return Lucinacci(n-1) + Lucinacci(n-2);
        }
    }
    // 2a
    public static void getLucinacciTime(int n){
        long startTime = System.nanoTime();
        System.out.println(Lucinacci(n));
        long endTime = System.nanoTime();
        // convert time from nanoseconds to milliseconds
        long timeDuration = (endTime - startTime)/1000000;
        System.out.println("The Runtime for the Lucas numbers  " + timeDuration + "  milliseconds");
    }
    public static void main(String[] args) {
        // Part 2a
        getLucinacciTime(40);

        //////LEFT OFF on part 2b

    }
}