package recursion;
/*
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 */
public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int n){
        return solution(n, 0);
    }

    static int solution(int n, int steps){
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            return solution(n / 2, ++steps);
        }
        return solution(n - 1, ++steps);
    }
}
