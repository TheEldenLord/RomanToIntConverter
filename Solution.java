public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] testCases = {"III", "IV", "IX", "LVIII", "MCMXCIV"};

        for (String testCase : testCases) {
            System.out.println("Roman numeral: " + testCase + ", Integer value: " + solution.romanToInt(testCase));
        }
    }

    public int romanToInt(String s) {

        // declaration of numbers. 
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50; 
        int C = 100;
        int D = 500;
        int M = 1000;

        int total = 0;

        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            char nextChar;
            if (i + 1 < s.length()) {
                nextChar = s.charAt(i + 1);
            } else {
                nextChar = '\0'; // Assign null character if there is no next character
            }



            if (currentChar == 'I' && (nextChar == 'V' || nextChar == 'X')) {
                total -= I; // If current character is 'I' and the next character is 'V' or 'X', subtract 1.
            } else if (currentChar == 'I') {
                total += I;
            } else if (currentChar == 'V') {
                total += V;
            } else if (currentChar == 'X' && (nextChar == 'L' || nextChar == 'C')) {
                total -= X; // If current character is 'X' and the next character is 'L' or 'C', subtract 10.
            } else if (currentChar == 'X') {
                total += X;
            } else if (currentChar == 'L') {
                total += L;
            } else if (currentChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
                total -= C; // If current character is 'C' and the next character is 'D' or 'M', subtract 100.
            } else if (currentChar == 'C') {
                total += C;
            } else if (currentChar == 'D') {
                total += D;
            } else if (currentChar == 'M') {
                total += M;
            }
        }
        return total;
    }
}
