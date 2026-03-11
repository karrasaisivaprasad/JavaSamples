package BasicExamples;

public class ArrayExample {
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 88, 92};
        System.out.println(marks[3]);

        for (int i = 0; i < marks.length; i++) {
           System.out.println("Mark: " + marks[i]);
       }
        System.out.printf("%n%n");
        for(int mark:marks){

            System.out.println("Mark: "+mark);
            System.out.printf("%d%n", mark);
        }

    }
}
