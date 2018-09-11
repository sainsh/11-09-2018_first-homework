import java.awt.*;

public class Cat {

    String name;
    Color color;
    int age;

    public Cat(String name, Color color, int age){

        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String meow(){
        return "meow";
    }

    public void changeColor(Color newColor){
        this.color=newColor;
    }

    public void birthday(){
        this.age += 1;
    }
}
