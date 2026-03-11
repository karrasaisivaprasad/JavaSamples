public class Main {
    // Here Main is a class,
    String colour = "Red";
    public void main() {
        //Inside the class Method should create
        System.out.println("Car is driving");
        Main mycar = new Main();
        Main mycar2 = new Main();
        Main mycar3 = new Main();
        mycar2.colour = "Green";
        // Inside the Method object needs to be create if necessary
        System.out.println(mycar.colour);
        System.out.println(mycar2.colour);
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        for(int n=1;n<10;n++)
        {
            System.out.println(n);
        }
    }
    // you cannot print the variable in the class
}
