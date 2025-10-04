package weekThree;
//Make a program where it will count from 5 to 1 and print liftoff at the end.
public class whileLoopsPracticeProblem {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 1) {
            System.out.println("Count is: " + count);
            count--;
        }
        System.out.println("Liftoff!");
    }
}