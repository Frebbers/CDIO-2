import java.util.Random;
public class Die {
    private int faces;
    private int value;
    private Random randomizer;

    //define constructor
    public Die(int faces) {
        this.faces = faces;
        this.randomizer = new Random();
        //rolls to ensure value is never null
        roll();
    }
    //define the roll method
    public void roll() {this.value = this.randomizer.nextInt(this.faces) + 1;}
    //define method to return value of the die
    public int getValue() {return this.value;}
    //Probably rendundant since the constructor takes an int value.
    public void setFaces(int input) {
        this.faces = input;
        roll();
    }
}
