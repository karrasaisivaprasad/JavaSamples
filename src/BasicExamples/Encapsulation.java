package BasicExamples;

public class Encapsulation {
    String name;
    int rollNo;

    void setName(String nm){
        name = nm;
    }
    void setRollNo(int rlNo){
        rollNo = rlNo;
    }

    void Dispalyinfo(){
        System.out.println(name +" is the student with a RollNo of "+rollNo);
    }

    public static void main(String[] args){
        Encapsulation S1 = new Encapsulation();
        Encapsulation S2 = new Encapsulation();
        Encapsulation S3 = new Encapsulation();
        S1.setName("John");
        S1.setRollNo(1102);

        S2.setName("Daniel");
        S2.setRollNo( 1004);

        S3.setName("Greek");
        S3.setRollNo(1006);

      //  S1.Dispalyinfo();
        S2.Dispalyinfo();
        S3.Dispalyinfo();
    }

}
