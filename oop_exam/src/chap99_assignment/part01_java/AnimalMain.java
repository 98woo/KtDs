package chap99_assignment.part01_java;

public class AnimalMain {
    public static void main(String[] args) {

        Animal dog1 = new Animal("바둑이", "시고르자브종", "왘왘");
        Animal dog2 = new Animal("백구", "진돗개", "멍멍");

        Animal cat1 = new Animal("치즈", "코리안숏헤어", "야옹");
        Animal cat2 = new Animal("고등어", "코리안숏헤어", "냐옹");

        dog1.introduceAnimal();
        dog1.makeSound();

        cat1.introduceAnimal();
        cat1.makeSound();


        Cat cs = new Cat("춘식", "노르웨이숲", "소형");
        Cat cb = new Cat("춘배", "메인쿤", "중형");

        cs.introduceAnimal();
        cs.makeSound("애옹");

        Dog dog3 = new Dog("초코", "포메", "왕왕", "흰둥");

        dog3.introduceAnimal();
        dog3.isColor();
        dog3.makeSound();
    }
}
