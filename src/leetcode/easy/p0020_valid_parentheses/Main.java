package leetcode.easy.p0020_valid_parentheses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.isValid(word));
    }
}
