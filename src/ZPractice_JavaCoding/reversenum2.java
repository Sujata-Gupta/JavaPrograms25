package ZPractice_JavaCoding;

public class reversenum2 {
    public static void main(String[] args) {
        String input = "01230045006";

        // Count occurrences of each digit (0 to 9)
        int[] count = new int[10];

        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            count[digit]++;
        }

        // Reconstruct the sorted string
        StringBuilder sorted = new StringBuilder();

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < count[i]; j++) {
                sorted.append(i);
            }
        }

        // Output the result
        System.out.println(sorted.toString());  // Output: 00000123456
    }
}
