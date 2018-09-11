import java.util.Random;

public class Dice {


    String eyes;
    Random rand;

    public Dice(){
        rand = new Random();

    }


    public String rollDice(int numberOfDice){

        eyes= "";

        for(int i=0; i< numberOfDice; i++){
            eyes += Integer.toString(rand.nextInt(6)+1) + " ";
        }

        return eyes;
    }

}
