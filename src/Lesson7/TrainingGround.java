package Lesson7;

public class TrainingGround {
    public static void main (String[] args){
        Hero hero = new Hero("Max");
        hero.attackEnemy();
    }
}

class Hero{
    private String name;
    public Hero (){}
    public Hero(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void attackEnemy(){
        System.out.println("Hero attacks enemy");
    }
}
class Mage extends Hero{
    @Override
    public void attackEnemy(){
        System.out.println("Mage attacks enemy");
    }
}

class Archer extends Hero{
    @Override
    public void attackEnemy(){
        System.out.println("Archer attacks enemy");
    }
}

class  Warrior extends Hero{
    @Override
    public void attackEnemy(){
        System.out.println("Warrior attacks enemy");
    }
}

