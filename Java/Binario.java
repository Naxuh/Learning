// Hacer una funcion que convierta un numero decimal a binario y viceversa

public class Binario {
    public static void main(String[] args)
    {

    }

    public static int decimal_to_binary(int decimal)
    {
        int binary = 0;
        int base = 1;

        while (decimal > 0)
        {
            int remainder = decimal % 2;
            binary += remainder * base;
            decimal /= 2;
            base *= 10;
        }

        return binary;
    }

    public static int binary_to_decimal(int binary)
    {
        int decimal = 0;
        int base = 1;

        while (binary > 0)
        {
            int remainder = binary % 10;
            decimal += remainder * base;
            binary /= 10;
            base *= 2;
        }

        return decimal;
    }
}

