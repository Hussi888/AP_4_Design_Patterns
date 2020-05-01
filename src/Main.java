

import Abstract_Factory.AbstractFactory;
import Abstract_Factory.FactoryProducer;
import Abstract_Factory.Shape;
import Builder.HouseBuilder;
import Builder.House;
import Builder.IglooHouseBuilder;
import Builder.CivilEngineer;
import Singleton.Game;

public class Main {
    public static void main(String args[]) {
        //Abstract Factory Method
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();

        //Builder Pattern
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("\nBuilder constructed: "+ house);

        Game a = Game.getInstance();
        System.out.println("\nSinglton Object:\n"+ a.s);

    }
}
