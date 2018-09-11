import sun.security.provider.ConfigFile;

import java.awt.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //chapter 1
        //System.out.println("Hello World");
        //System.out.println("Kathryn");

        //chapter 2.1 -> 2.3
        /*Car myCar = new Car(25.5,"1BC32E", Color.BLUE, true);

        Car sallyCar = new Car(13.9,"3D20BN", Color.BLACK, false);

        System.out.println("My Car's Licence Plate: " + myCar.licencePlate);
        System.out.println("Sally's Licence Plate: " + sallyCar.licencePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
        */

        //chapter 2.4 -> 2.5
       // System.out.println("Enter a Word");
       /* Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);
        */
        /*
        String userInput = sc.next();

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "+ userInput.contains("Enter".toLowerCase()));

        */

        //chapter 2.6
        /*
        int[] numbers = new int[5];

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] numbers2 = {31,45,22,98,10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavoriteCandybars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1: "+myFavoriteCandybars[1]);
        myFavoriteCandybars[2]="Butterfinger";
        System.out.println("index 2: " +myFavoriteCandybars[2]);
        System.out.println("Length: " +myFavoriteCandybars.length);

        System.out.println(Array.get(myFavoriteCandybars,2));

        */
        //chapter 2.7
        /*
        Car myCar = new Car(25.5,"1BC32E", Color.BLUE, true);

        Car sallyCar = new Car(13.9,"3D20BN", Color.BLACK, false);

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);
        */

        //chapter 2.8
        /*
        String s = "dog";
        String replacedF = s.replace("d","f");
        System.out.println(replacedF);
        */

        //chapter 2.9 challenge
        /*
        Cat myCat = new Cat("Gavstriks",Color.GRAY, 6);

        System.out.println(myCat.meow());


        System.out.println("age of cat: " + myCat.age);

        myCat.birthday();

        System.out.println("new age of cat: " +myCat.age);

        System.out.println("color of cat: " +myCat.color);
        myCat.changeColor(Color.RED);
        System.out.println("new color of cat: " + myCat.color);

        */

        //chapter 3.1 -> 3.2
        /*
        System.out.println("Enter an age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age>=0 && age <= 5){
            System.out.println("Baby");
        }
        else if(age>= 6 && age <= 11){
            System.out.println("Kid");
        }
        else if(age >= 12 && age <= 17){
            System.out.println("Teen");
        }
        else if(age >= 18){
            System.out.println("adult");
        }
        else{
            System.out.println("Invalid");
        }

        System.out.println("Thanks for using this program");

        */

        //chapter 3.3
        /*
        System.out.println("While Loop");
        int x = 3;
        while(x>0){
            System.out.println("Current x: " + x);
            x -=1;
        }
        System.out.println("Final x: " +x);
        System.out.println();


        System.out.println("Do-While Loop");
        int y = 3;
        do{
            System.out.println("Current y: "+y);
            y -= 1;
        } while(y>0);

        System.out.println("Final y: " + y);
        System.out.println();

        System.out.println("For Loop");

        for(int i=3; i> 0; i--){
            System.out.println("current i: " + i);

        }
        System.out.println();

        */

        //chapter 3.4

        /*
        double power = Math.pow(5,3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);
        */

        //chapter 3.5 -> 3.6

        /*
        Coin c = new Coin();
        System.out.println("Initial: "+ c.getFaceUp());

        for(int i= 0; i < 10; i++){
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }
        */

        //chapter 3.7 challenge

        /*
        Scanner in = new Scanner(System.in);
        String userInput;
        Dice d = new Dice();
        while(true) {

            System.out.println("what do you want to do?");
            userInput = in.next();

            if (userInput.contains("dice")) {

                System.out.println("how many dice (d6) do you want to roll");

                System.out.println("you rolled: " + d.rollDice(in.nextInt()));

            }
            else if(userInput.contains("stop") || userInput.contains("end")){
                break;
            }


        }



        */



        //chapter 4.2

        /*
        BankAccount myBankAccount = new BankAccount(4141, 100);
        //System.out.println(myBankAccount.bank_account);

        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);
        */

        //chapter 4.3

        /*
        Insect insect = new Insect(5,6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2,1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        if (spider instanceof Insect && spider instanceof Spider){
            System.out.println("Spider is an insect and a spider");
        }
        */
        //chapter 4.3

        /*
        Dog d = new Dog();
        Cat2 c = new Cat2();

        if ( c instanceof Pet){
            c.play();
        }
        if(d instanceof Pet){
            d.play();
        }

        Pet p;
        Random rand = new Random();
        int n = rand.nextInt(2);
        if(n==0) {
            p = new Dog();
        }
        else{
           p= new Cat2();
        }

        p.play();
        */

        //chapter 4.5
        /*
        Answerable phone = () -> "Hello";

        System.out.println(phone.answer());

        Predicate isOdd = n -> n % 2 !=0;
        System.out.println(isOdd.test(2));

        Predicate isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(2));
        */

    }


}
