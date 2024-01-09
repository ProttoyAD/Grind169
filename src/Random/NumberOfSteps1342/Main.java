package Random.NumberOfSteps1342;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }

    static int numberOfSteps(int number){
        if (number==0){
            return 0;
        }
        if (number%2==0){
            return 1+numberOfSteps(number/2);
        } else {
            return 1+numberOfSteps(number-1);
        }
    }

}
