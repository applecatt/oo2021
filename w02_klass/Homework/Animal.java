public class Animal{
    public int age;
    private boolean ishungry;

    public String name;
    public String species;

    public Animal(String species, boolean ishungry){
        System.out.println("Võtsid uue looma!");
    }
    public void setName(String name){
        this.name = name;
        System.out.println("Muutsid looma nime!");
    }
    public boolean getIsHungry(){
        return this.ishungry;
    }
}
