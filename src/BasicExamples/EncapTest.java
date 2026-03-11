package BasicExamples;

public class EncapTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }

    public static void main(){
        EncapTest E = new EncapTest();
        E.setName("James");
        System.out.println("Entered name is "+E.getName());
    }
}

