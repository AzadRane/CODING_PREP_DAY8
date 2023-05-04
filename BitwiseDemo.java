public class BitwiseDemo
{
    public static void main(String args[])
    {
        byte a=5;
        byte b=2;

        System.out.println("Bitwise and :"+(a&b));

        System.out.println("Bitwise or :"+(a|b));

        System.out.println("Bitwise xor :"+(a^b));

        System.out.println("Bitwise compliment of b:"+(~b));

        System.out.println("Bitwise left shift  :"+(a<<2));

        System.out.println("Bitwise right shift :"+(a>>2));


    }
}