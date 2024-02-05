package chap99_assignment.part01_java;

public class Cat {

    private String name;
    private String type;
    private String size;

    public Cat(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public void introduceAnimal() {
        System.out.println(this.name + "은 " + this.type + "입니다.");
    }

    public void makeSound(String sound) {
        System.out.println(this.name + ": " + sound);
    }
}
