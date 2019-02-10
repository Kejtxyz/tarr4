package pl.sdacademy.tarr4.dziedziczenie.animals.snakes;

import pl.sdacademy.tarr4.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr4.dziedziczenie.animals.interfaces.Predator;

/**
 * Snake
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:27
 **/
public abstract class Snake extends Animal implements Predator {
    public Snake(String name) {
        super(name);
    }

    // metoda poruszania się zygzakiem goZigzag()

}
