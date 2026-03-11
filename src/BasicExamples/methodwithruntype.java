package BasicExamples;

public class methodwithruntype {

        static int add(int a, int b) {
            return a + b;
            //add is method and we are calling that method in main method
        }

        public static void main(String[] args) {
            int result = add(10, 5);
            System.out.println("Sum: " + result);
        }
    }