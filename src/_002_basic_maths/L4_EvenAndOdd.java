package _002_basic_maths;

public class L4_EvenAndOdd {
    public static void main(String[] args) {
        int n = 102;

//        if(n % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

        //One Liner using Ternay Operator

        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);

    }
}
