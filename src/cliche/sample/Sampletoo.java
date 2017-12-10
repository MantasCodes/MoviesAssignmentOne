package cliche.sample;
import asg.cliche.*;
public class Sampletoo {
    @Command (name="yodawg", abbrev="dwg", header ="yo yo yo dawg", description="just type dwg dawg") // One,
    public String Yo() {
        return "SUP DAWWGGGGG";
    }
    
    @Command
    public void exit() { }
    
    @Command (name="adding", abbrev="addd", header="first number added with the second one is:", description="Put in an integer and then a space and then another integer, they're going to be added together") // two,
    public int add(int a, int b) {
        return a + b;
    }
	

}
