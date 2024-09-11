package org.example.codewar.training;

/*
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.

Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

Examples (input --> output):
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"
 */
public class RgbToHex {

    public static void main(String[] args) {
        System.out.println(rgb(-20, 275, 125));
    }

    public static String rgb(int r, int g, int b) {
        int redInput = validateInput(r);
        int greenInput = validateInput(g);
        int blueInput = validateInput(b);
        String redHexValue = getHexValueFromDecimal(redInput);
        String greenHexValue = getHexValueFromDecimal(greenInput);
        String blueHexValue = getHexValueFromDecimal(blueInput);
        return redHexValue + greenHexValue + blueHexValue;
    }

    public static int validateInput(int input) {
        if (input > 255) {
            return 255;
        }
        return Math.max(input, 0);
    }

    public static String getHexValueFromDecimal(int decimal) {
        if (decimal == 0) {
            return "00";
        }
        String hexDigits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();
        int decimalNumber = decimal;
        while (decimalNumber > 0) {
            int rest = decimalNumber % 16;
            result.insert(0, hexDigits.charAt(rest));
            decimalNumber = decimalNumber / 16;
        }
        if (result.length() == 1) {
            result.insert(0, "0");
        }
        return result.toString();
    }
}
