package BasicExamples;

public class Constructors {
    String name;

    //Default Constructor
    public Constructors(){
        System.out.println("This is default constructors");
    }

    /**
     * parameterized constructor
     */
    public Constructors(String nm){
        name = nm;
        System.out.println("This is constructor with parameter name: "+name);
    }
    public static void main (String[] args){
      Constructors C1 = new Constructors();
      Constructors C2 = new Constructors("Anjali");
    }
}
