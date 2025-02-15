package exercise02_permutation_checker_bitvector;

import java.util.BitSet;

public class BitVectorPermutationChecker {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Nếu độ dài khác nhau, chắc chắn không phải hoán vị
        }

        // Sử dụng BitSet
        BitSet bitVector = new BitSet(256);

        // Lặp qua chuỗi đầu tiên và đánh dấu ký tự đã xuất hiện
        for (char c : s1.toCharArray()) {
            bitVector.flip(c); // Đánh dấu bit của ký tự đó
        }

        // Lặp qua chuỗi thứ hai và xóa bit đi
        for (char c : s2.toCharArray()) {
            bitVector.flip(c); // Nếu ký tự tồn tại trong cả hai chuỗi, bit sẽ về false
        }

        // Nếu tất cả bit đều về false thì đây là hoán vị
        return bitVector.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("coder", "codre")); // true
        System.out.println(isPermutation("hello", "oellh")); // true
        System.out.println(isPermutation("test", "tost")); // false
        System.out.println(isPermutation("abcd", "abce")); // false
    }
}
