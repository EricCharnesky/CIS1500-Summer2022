package week3;

public class Main {
    public static void main(String[] args) {
        byte smallNumberMin = -128;
        byte smallNumberMax = 127;

        short twoByteNumberMin = -32_768;
        short twoByteNumberMax = 32_767;

        // 4 bytes
        int normalNumberMin = -2_147_483_648;
        int normalNumberMax = 2_147_483_647;

        // 8 bytes
        long bigWholeNumberMin = -9_223_372_036_854_775_808L;
        long bigWholeNumberMax = 9_223_372_036_854_775_807L;

        float fourByteNumberWithDecimalMin = Float.MIN_VALUE;
        float fourByteNumberWithDecimalMax = Float.MAX_VALUE;

        System.out.println(fourByteNumberWithDecimalMin);
        System.out.println(fourByteNumberWithDecimalMax);

        // to tell java a number with a decimal is a float, use 'f'
        float someNumberWithDecimal = .123f;

        // 8 bytes to store each double value
        double bigNumberWithDecimals = .123;

        // apostrophe or single quote
        char singleCharacterA = 'A';
        char singleCharacterAWithNumber = 65;

        System.out.println(singleCharacterAWithNumber);
        System.out.println(singleCharacterA);

        char capitalE = 69;
        char capitalR = 82;
        char capitalI = 73;
        char capitalC = 67;

        System.out.println(capitalE + "" + capitalR + "" +capitalI + "" +capitalC);

        boolean trueOrFalseValue = true;
        boolean thisIsFalse = false;

    }
}