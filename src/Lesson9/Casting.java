package Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Casting {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("Victoria", 28, 1000));
        actors.add(new Actor("Nina", 50, 2400));
        actors.add(new Actor("Katya", 28, 2000));
        actors.add(new Actor("Born", 26, 45000));
        actors.add(new Actor("Max", 26, 3000));

        Actor.list(actors);
        Collections.sort(actors, new Actor.SortByNames());
        Actor.list(actors);
    }


}

class Actor {

    public static class SortByNames implements Comparator<Actor> {
        public int compare(Actor actor, Actor t1) {
            if (actor.fee > t1.fee)
                return 1;
            else if (actor.fee < t1.fee) return -1;
            else return 0;
        }
    }
    String name;
    int age;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    int fee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Actor(String name, int age, int fee) {
        this.name = name;
        this.age = age;
        this.fee = fee;
    }

    public static void fire(ArrayList<Actor> list){
        Actor actor = list.get(0);
        for (var a: list){
            if (a.fee>actor.fee) actor = a;
        }
        list.remove(actor);
    }

    public static void list(ArrayList<Actor> list){
        System.out.println();
        for (Actor a: list){
            System.out.println(a.name);
        }
    }

}