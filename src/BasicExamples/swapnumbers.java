package BasicExamples;

public class swapnumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.printf("Before swap: a=%d, b=%d%n", a,b);
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.printf("After Swap: a=%d, b=%d", a,b);
    }
}
