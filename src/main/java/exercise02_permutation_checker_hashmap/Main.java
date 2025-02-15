package exercise02_permutation_checker_hashmap;

public class Main {
    public static void main(String[] args) {
        StringPermutationChecker checker = new StringPermutationChecker("coder");

        // Kiểm tra các trường hợp
        System.out.println(checker.isPermutation("codre")); // true
        System.out.println(checker.isPermutation("oderc")); // true
        System.out.println(checker.isPermutation("arowd")); // false
        System.out.println(checker.isPermutation("coderr")); // false
    }
}
