public class Animal {
    public String name;
    public boolean isDog;
    public Animal(String name,boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }
    public String getName(){
        return this.name;
    }
    public boolean getIsDog(){
        return this.isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + getIsDog();
    }
}
