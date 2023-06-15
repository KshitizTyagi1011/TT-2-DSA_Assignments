// Q2 : Convert Octal to Hexadecimal number system using recursion only
// Example
// Input octal number: 175
// Hexadecimal number: 7D

// Octal number system
// Octal number system is a base 8 number system. It uses 8 symbols to represent all its numbers i.e. 01234567

// Hexadecimal number system
// Hexadecimal number system is a base 16 number system. It uses 16 symbols to represent all its numbers i.e. 0123456789ABCDEF

public class Octal_to_Hexadecimal {
    public static String octalToHexadecimal(int octal) {
        // Convert octal to decimal
        int decimal = 0;
        int base = 1;
        while (octal != 0) {
            int lastDigit = octal % 10;
            decimal += lastDigit * base;
            octal /= 10;
            base *= 8;
        }

        // Convert decimal to hexadecimal using recursion
        return decimalToHexadecimal(decimal);
    }

    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "";
        }
        int lastDigit = decimal % 16;
        String hexadecimalDigit = "";
        if (lastDigit < 10) {
            hexadecimalDigit = String.valueOf(lastDigit);
        } else {
            char digitChar = (char) (lastDigit - 10 + 'A');
            hexadecimalDigit = String.valueOf(digitChar);
        }

        decimal /= 16;
        return decimalToHexadecimal(decimal) + hexadecimalDigit;
    }

    public static void main(String[] args) {
        int octalNumber = 125715;
        String hexadecimalNumber = octalToHexadecimal(octalNumber);
        System.out.println(hexadecimalNumber); 
    }
}


//OUTPUT: ABCD
