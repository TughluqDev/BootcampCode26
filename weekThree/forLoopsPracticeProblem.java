package weekThree;
    
public class forLoopsPracticeProblem {
    public static void main(String[] args) {
        for (int count = 200; count >= 100; count--){
            if (count % 2 == 0) {
                System.out.println(count + " is even.");
            } else {
                System.out.println(count + " is odd.");
            }
        }
    }
}
