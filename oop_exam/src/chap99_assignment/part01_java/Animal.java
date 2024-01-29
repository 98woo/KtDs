package chap99_assignment.part01_java;

public class Animal {

    private String name;
    private String type;
    private String sound;

    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void introduceAnimal() {
        System.out.println(this.name + "는 " + this.type + "입니다.");
    }

    public void makeSound() {
        System.out.println(this.name + ": " + this.sound);
    }
}
