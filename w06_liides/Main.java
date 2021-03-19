public class Main {
    public static void main(String[] args) {
        EstonianID estonian = new EstonianID("39608240216");

        System.out.println(estonian.getGender());
        System.out.println(estonian.getFullYear());
        System.out.println(estonian.getDOB());
        System.out.println(estonian.getAge());
        System.out.println(estonian.getMonth());
        System.out.println(estonian.getDay());
        System.out.println(estonian.untilNextBirthday());

        FinnishID finnish = new FinnishID("130293-003K");

        System.out.println(finnish.getGender());
        System.out.println(finnish.getFullYear());
        System.out.println(finnish.getDOB());
        System.out.println(finnish.getAge());
        System.out.println(finnish.getMonth());
        System.out.println(finnish.getDay());
        System.out.println(finnish.untilNextBirthday());

        Cat cat = new Cat("Miisu");
        
        System.out.println(cat.speak());
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(cat.beSneaky());
        System.out.println(cat.lookAround());
        System.out.println(cat.attack());
        System.out.println(cat.defend());

        Dog dog = new Dog("Miika");
        
        System.out.println(dog.speak());
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        System.out.println(dog.beSneaky());
        System.out.println(dog.lookAround());
        System.out.println(dog.attack());
        System.out.println(dog.defend());
    }
}
