import java.util.Scanner;

public class Pet{
    
    public static void main(String[] args){

        System.out.println("Kas soovid võtta uue looma?(y/n)");
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean hunger = false;
        String species = "";

        if (input.equals("y")){
            System.out.println("Mis on looma liik?");
            species = scanner.nextLine();
            System.out.println("Kas loom on näljane?(y/n)");
            if (input.equals("y")){
                hunger = true;
            }
            Animal animal = new Animal(species, hunger);
            System.out.println("Mis on looma nimi?");
            String name = scanner.nextLine();
            animal.setName(name);
            System.out.println("Kas soovid looma nime muuta?");

            if (input.equals("y")){
                System.out.println("Sisesta uus nimi:");
                String newname = scanner.nextLine();
                animal.setName(newname);
            }
            if (animal.getIsHungry()){
                System.out.println("Loom on näljane");
            }
            else{
                System.out.println("Loom ei ole näljane");
            }
        }

    }
}