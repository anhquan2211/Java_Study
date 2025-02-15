package exercise02_permutation_checker_hashmap;

import java.util.Arrays;

public class StringPermutationChecker implements PermutationChecker {
    private final String originalString;

    public StringPermutationChecker(String originalString) {
        this.originalString = originalString;
    }

    @Override
    public boolean isPermutation(String input) {
        if (input.length() != originalString.length()) {
            return false; // Nếu độ dài không bằng thì chắc chắn không phải hoán vị
        }
        return Arrays.equals(getCharFrequency(input), getCharFrequency(originalString));
    }

    //tạo một bảng tần suất ký tự để đếm số lần xuất hiện của từng ký tự trong một chuỗi
    private int[] getCharFrequency(String str) {
        int[] frequency = new int[256]; // Bảng ASCII đầy đủ
        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        return frequency;
    }
}
