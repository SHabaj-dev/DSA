package recursion;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(productOfTwoNumbers(2, 3));
    }

    static int productOfTwoNumbers(int num1, int num2){
        if(num2 == 1){
            return num1;
        }

        return num1 + productOfTwoNumbers(num1, --num2);
    }
}
