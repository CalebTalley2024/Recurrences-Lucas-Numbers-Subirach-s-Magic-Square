public class Sequence {

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
    public static float LucinacciTime(int n){
        long startTime = System.nanoTime();
        Sequence.Lucinacci(n);
        long endTime = System.nanoTime();
        // convert time from nanoseconds to milliseconds
        float nanoToMilli = 1000000;
        float timeDuration = (endTime - startTime)/nanoToMilli;
        System.out.println("The Runtime for the Lucas numbers  " + timeDuration + "  milliseconds");
        return timeDuration;
    }
    // 2bi
    public static void LucinacciRatioCalc(int n){
        float numer = Lucinacci(n+1);
        float denom = Lucinacci(n);
        float ratio = numer/denom;
        System.out.println("The ratio of successive calculations for n = " + n + " : "+ ratio);
        // seems like the ratio is log(n)
    }
    //2bii
    public static void LucinacciRatioTime(int n){
        float numer = LucinacciTime(n+1);
        float denom = LucinacciTime(n);
        float ratio = numer/denom;
        System.out.println("The ratio of successive calculation times  is  for n = " + n + " : "+ ratio);

        // seems like the ratio is log(n)
    }

    // 2c
    public static float myAnacci(int n){
        switch(n){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return (n-1) * myAnacci(n-1) + (n-2) * myAnacci(n-2);
        }
    }
    public static float myAnacciTime(int n){
        long startTime = System.nanoTime();
        System.out.println(myAnacci(n));
        long endTime = System.nanoTime();
        // convert time from nanoseconds to milliseconds
        float nanoToMilli = 1000000;
        float timeDuration = (endTime - startTime)/nanoToMilli;
        System.out.println("The Runtime for the Lucas numbers  " + timeDuration + "  milliseconds");
        return timeDuration;
    }
    public static void myAnacciRatioCalc(int n){
        float numer = myAnacci(n+1);
        float denom = myAnacci(n);
        float ratio = numer/denom;
        System.out.println("The ratio of successive calculations for myAnacci is  "+ ratio);
        // seems like the ratio is log(n)
    }

    public static void myAnacciRatioTime(int n){
        float numer = myAnacciTime(n+1);
        float denom = myAnacciTime(n);
        float ratio = numer/denom;
        System.out.println("The ratio of successive calculation times  is  "+ ratio);
        // seems like the ratio is log(n)
    }
}
