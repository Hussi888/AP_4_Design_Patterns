package Singleton;

public class Game
{
    // static variable single_instance of type Game
    private static Game single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Game()
    {
        s = "Hello I am a string part of Game class";
    }

    // static method to create instance of Game class
    public static Game getInstance()
    {
        if (single_instance == null)
            single_instance = new Game();

        return single_instance;
    }
}