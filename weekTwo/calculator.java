package weekTwo;

public class calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        String operation = "Multiplication";

        if (operation.equals("Addition")){
            add(num1, num2);
        } 
        else if (operation.equals("Subtraction")){
            sub(num1, num2);
        }
        else if (operation.equals("Multiplication")){
            multiply(num1, num2);
        }
        else if (operation.equals("Division")){
            divide(num1, num2);
        }


    }
    
    
    public static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Your answer is " + sum);
    }


    public static void sub(int num1, int num2){
        int difference = num1 - num2;
        System.out.println("Your answer is " + difference);
    }


    public static void multiply(int num1, int num2){
        int product = num1 * num2;
        System.out.println("Your answer is " + product);
    }


    public static void divide(int num1, int num2){
        int quotient = num1 / num2;
        System.out.println("Your answer is " + quotient);
    }
}
