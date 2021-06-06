package ExerciseTwo;
/*
Exercise 2
Write a program that exemplifies the concept of inheritance.
Comment the program accordingly to describe your example.
You should use real-life concepts as classes in the program.
 */

public abstract class Game {
    private String name;
    private int ID;

    public Game(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public abstract void printInfo();

    public String getName() {
        return name;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString(){
        return ID + ": " + name;
    }
}

class WrongID extends Exception{
    public WrongID(String message){
        super(message);
    }
}