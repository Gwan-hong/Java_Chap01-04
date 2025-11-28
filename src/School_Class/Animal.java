package School_Class;

abstract class Animal{
    public abstract void cry();
}

class Dog extends Animal{
    public void cry() {
        System.out.println("멍멍!");
    }
}
class Cat extends Animal{
    public void cry() {
        System.out.println("야옹~");
    }
}


