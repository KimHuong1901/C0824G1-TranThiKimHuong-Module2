package ss7.thuc_hanh.th1;
//public class Chicken extends Animal{}

public  class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken: gggggg";
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSound());
        }
}

//    public static void main(String[] args) {
//
//    }
}
