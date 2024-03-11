// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    // 1. add
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d){
        int sum1 = add(a,b);
        int sum2 = add(sum1,c);
        return add(sum2,d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好，" + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){return "下午好，" + name + "!";}

    // 5. triple
    public static String triple(String word){
        return word+word+word;
    }

    // 6. half
    public static double half(int a){
        return (double) a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value){
        return (int) (value + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value) {
        return(int) (value - 0.5);
    }

    public static void main(String[] args) {
        int result = add(5,7);
        System.out.println(result);
        int resultTwo = add(5,7,6,6);
        System.out.println(resultTwo);
        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);
        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);
        String tripleWord = triple("oohbaby");
        System.out.println(tripleWord);
        double halfNumber = half(19);
        System.out.println(halfNumber);
        int roundUp = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundUp);
        int roundUpNegative = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundUpNegative);

    }

}
