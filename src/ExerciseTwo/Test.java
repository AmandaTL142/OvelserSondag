package ExerciseTwo;
/*
Exercise 2
Write a program that exemplifies the concept of inheritance.
Comment the program accordingly to describe your example.
You should use real-life concepts as classes in the program.
 */

public class Test {
    public static void main(String[] args) {
        VRGame g = new VRGame("Rec Room", 001, "Oculus");

        g.printInfo();
        System.out.println(g);
    }
}
