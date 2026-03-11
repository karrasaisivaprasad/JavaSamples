package BasicExamples;

public class Arrayexamle2 {
    public static void main(String[] args){
        int marks[] = new int[5];
        marks[0]=76;
        marks[1]=768;
        marks[2]=87;
        marks[3]=98;
        marks[4]=99;
        for (int i=0;i<marks.length;i++){
           if (marks[i]==87){
                System.out.println("index of 87 is: "+(i+1));
     }
          System.out.println(marks[i]);
        }
    }

}
