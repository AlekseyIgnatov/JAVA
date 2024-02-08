package main;

//import main.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import main.Clients.Animal;
import main.Clients.Cat;
import main.Clients.Crocodile;
import main.Clients.Dog;
import main.Clients.Illness;
import main.Clients.Owner;
import main.Clients.Duck;
import main.Clients.Ant;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса

        Animal animal1 = new Duck();
        Animal animal2 = new Crocodile();
        Animal animal3 = new Ant();
        Animal animal4 = new Cat();

        animal1.fly();
        animal1.toGo();
        animal1.swim();

        animal2.toGo();
        animal2.swim();
        animal2.fly();

        animal3.toGo();
        animal3.swim();
        animal3.fly();

        animal4.toGo();
        animal4.swim();
        animal4.fly();

        /*System.out.println(cat.getOwner());
        System.out.println(cat.getNickName());
        System.out.println("Болезнь:" + cat.getIllness());

        System.out.println(cat.getNickName());

        cat.setIllness(new Illness(null));

        System.out.println("Болезнь:" + cat.getIllness());


        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());

        cat.lifeCycle();

        Animal catty = new Cat();
        Dog goodBoy = new Dog();
        Animal duck = new Duck();

        System.out.println(goodBoy.getType());
        System.out.println(catty.getType());

        System.out.println(catty);


        Cat.meow();

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(catty);
        animals.add(goodBoy);
        animals.add(cat);

        int i = 0;
        for (Animal animal : animals){
            System.out.println(i + " "+ animal);
            i++;
        } */

        

    }
}