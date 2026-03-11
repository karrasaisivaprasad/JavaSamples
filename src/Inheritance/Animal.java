package Inheritance;

class Animal {
    public void heart() {
        System.out.println("we have a heart");
    }
}

class Mammal extends Animal {
    public void mammarygland() {
        System.out.println("We have mammary gland");
    }
}

class Reptile extends Animal{
    public void hishis(){
        System.out.println("his his !!!");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog barks bow bow!!!");
    }

}

class InheritanceDemo{
    public static void main (String[]args){
        Dog d = new Dog();
        d.bark();
        d.mammarygland();
        d.heart();

        Reptile r = new Reptile();
        r.hishis();
        r.heart();
    }
}