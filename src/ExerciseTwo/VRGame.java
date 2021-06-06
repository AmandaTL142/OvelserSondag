package ExerciseTwo;
/*
Exercise 2
Write a program that exemplifies the concept of inheritance.
Comment the program accordingly to describe your example.
You should use real-life concepts as classes in the program.
 */

public class VRGame extends Game {
    private String headsetType;

    public VRGame(String name, int ID, String headsetType){
        super(name, ID);
        this.headsetType = headsetType;
    }

    public void printInfo(){
        System.out.println(getID() + " " + getName() + " " + headsetType);
    }

    public String getHeadsetType(){
        return headsetType;
    }

    public void setHeadsetType(String s){
        headsetType = s;
    }

    @Override
    public String toString(){
        return getID() + ": " + getName() + ", " + headsetType;
    }

}
