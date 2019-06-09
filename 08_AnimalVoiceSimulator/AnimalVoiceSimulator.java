interface Animal
{
    public abstract void cry();
    public abstract String getAnimalName();
}
class Simulator
{
    public void playSound(Animal animal)
    {
        System.out.println("NAME:"+animal.getAnimalName());
        animal.cry();
    }
}
class Cat implements Animal
{
    String name = "小猫Tom";
    @Override
    public void cry() {
        System.out.println("小猫喵喵叫");
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
    class Dog implements Animal
{
    String name = "小狗Spike";
    @Override
    public void cry() {
        System.out.println("小狗汪汪叫");
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
public class AnimalVoiceSimulator
{
    public static void main(String args[])
    {
        Simulator simulator= new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}
