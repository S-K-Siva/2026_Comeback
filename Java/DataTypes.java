package Java;
public class DataTypes {
    public static void main(String args[]){
        int num1 = 68; // Integer -> byte, short, int, long
        byte Byte = 111; // -128 to 127 (-2^7 to 2^7 - 1)
        short Short = 12345; // (-2^15 to 2^15 - 1)
        int num2 = 67; // (-2^31 to 2^31 - 1)
        long Long = 10_00_000; //(-2^63 to 2^63 - 1)
        float weight = 103.2f;
        char ch = 'S';
        boolean isMale = true;
        String name = "Siva";
        System.out.println("My Roll Number is " + num1);
        System.out.println("My Friend roll number is " + num2);
        System.out.println("the sum of num1 and num2 is " + (num1 + num2));
        System.out.println("My weight is " + weight);
        System.out.println(num1 + weight); //(int + float) -> float
        System.out.println("My name starts with the letter '" + ch + "'");
        System.out.println("Am I male ? : " + isMale);
        System.out.println("My name is " + name);
    }
}
