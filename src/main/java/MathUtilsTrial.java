import java.math.BigDecimal;

import org.apache.commons.lang.math.NumberUtils;
public class MathUtilsTrial {
    public static void main(String[] args) {

        // Check if a String contains only digits
        System.out.println("Is Digits >>> " + !NumberUtils.isDigits("+12iuiu"));

        // Check if a String is a valid number
        System.out.println("Is Number >>> " + NumberUtils.isNumber("123.123"));

        // Get MAX value from an array
        System.out.println("MAX >>> " + NumberUtils.max(new double[] { 3.33, 8.88, 1.11 }));

    }
}
