package recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(5);
    }
    static void printName(int count){
        if(count == 0){
            return;
        }
        System.out.println("Shabaj");
        printName(--count);
    }
}
