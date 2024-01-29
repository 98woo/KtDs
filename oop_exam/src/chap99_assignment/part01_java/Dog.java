package chap99_assignment.part01_java;

public class Dog extends Animal{

    private String color;

    public Dog(String name, String type, String sound, String color) {
        super(name, type, sound);
        this.color = color;
    }

    public void isColor() {
        System.out.println(this.getName() + "의 털은 " + this.color + "색입니다.");
    }
}
