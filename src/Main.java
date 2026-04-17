/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends
 * in the binary representation of N.
 */
public class Main {
    public static void main(String[] args) {
        /*
            9 has binary rep of 1001
            529 has binary rep of 1000010001
            20 has binary rep of 10100
            15 has binary rep of 1111
            32 has binary rep of 100000
         */
        int[] numbers = {9, 529, 20, 15, 32};

        for(int num : numbers) {
            System.out.println("Number is " + num + " with max sequence of zeroes equals to " + binaryGap(num));
        }
    }

    private static int binaryGap (int number) {
        String binaryString = Integer.toBinaryString(number);
        int gap = 0;
        int maxGap = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                maxGap = Math.max(maxGap, gap);
                gap =0;
            } else {
                gap += 1;
            }
        }

        return maxGap;
    }
}