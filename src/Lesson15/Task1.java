package Lesson15;

import lombok.Getter;
import lombok.Setter;

import javax.sound.sampled.EnumControl;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        Thread fabricThread = new Thread(fabric);


        Servant servant1 = new Servant(fabric,"Ramires", 100);
        Servant servant2 = new Servant(fabric,"Fabio", 100);
        Thread servantThread = new Thread(servant1);
        Thread secondServantThread = new Thread(servant2);

        Scientist scientist1 = new Scientist("Tom", servant1);
        Scientist scientist2 = new Scientist("John", servant2);
        Thread firstScientistThread = new Thread(scientist1);
        Thread secondScientistThread = new Thread(scientist2);

        fabricThread.start();
        servantThread.start();
        secondServantThread.start();
        firstScientistThread.start();
        secondScientistThread.start();

        System.out.println(servantThread.getState());
        System.out.println(secondServantThread.getState());
        System.out.println(fabricThread.getState());
    }
}

class Scientist implements Runnable{

    private String name;
    private Servant servant;
    private int countOfRobots;
    private Scientist(){
        countOfRobots = 0;
    }

    public Scientist(String name, Servant servant) {
        this.name = name;
        this.servant = servant;
        countOfRobots = 0;
    }

    //Scientist takes components from servant and makes robot.
    @Override
    public void run(){
        int i = 0;
        try {
            while (!Thread.interrupted()&&i<100) {
                synchronized (servant.getComponents()) {
                    while (servant.getComponents().entrySet().stream().allMatch((p) -> p.getValue() != 0)) {
                        countOfRobots++;
                        Iterator iterator = servant.getComponents().keySet().iterator();
                        while (iterator.hasNext()){
                            String str = (String) iterator.next();
                            servant.getComponents().put(str, servant.getComponents().get(str)-1);
                        }
                    }
                }
                Thread.sleep(100);
                i++;
                System.out.println(name+" with servant " +servant.name +" : robots ="+ countOfRobots);
            }
        }
        catch (InterruptedException e){ }
    }

}

@Getter
@Setter
class Servant implements Runnable{

    String name;
    private HashMap<String, Integer> components = new HashMap<>();
    Fabric fabric;
    int mil;

    public Servant(Fabric fabric, String name, int mil){
        this.mil = mil;
        this.name = name;
        this.fabric = fabric;
        components.put("Head",0);
        components.put("RAM", 0);
        components.put("Body", 0);
        components.put("LeftHand",0);
        components.put("RightHand", 0);
        components.put("LeftFoot", 0);
        components.put("RightFoot", 0);
        components.put("CPU", 0);
        components.put("HDD", 0);
    }

    //Servant goes to dump and collects components for robot.
    @Override
    public void run () {
        int i = 0;
        try {
            while (!Thread.interrupted() && i < 100) {
                collectComponents();
                i++;
                System.out.println("Servant " + name + ": " + this.getComponents().toString());
                System.out.println();
                Thread.sleep(mil);

            }
        } catch (IllegalThreadStateException e) {
        } catch (InterruptedException e) {
        }

    }

    public synchronized void collectComponents() {
        int count = new Random().nextInt(3) + 1;
        for (int j = 0; j < count; j++) {
            String str = "";
            int num = new Random().nextInt(this.getComponents().keySet().size());
            Iterator iterator = this.getComponents().keySet().iterator();
            for (int k = 0; k <= num; k++) {
                str = (String) iterator.next();
            }
            if (fabric.getDump().getComponents().get(str).intValue() != 0) {
                int number = this.getComponents().get(str).intValue() + 1;
                this.getComponents().put(str, number);
                number = fabric.getDump().getComponents().get(str).intValue() - 1;
                fabric.getDump().getComponents().put(str, number);
            } else {
                Iterator iterator1 = fabric.getDump().getComponents().keySet().iterator();
                while (iterator1.hasNext()) {
                    String buff = (String)iterator1.next();
                    if(fabric.getDump().getComponents().get(buff)!=0){
                        int number1 = this.getComponents().get(str).intValue() + 1;
                        this.getComponents().put(buff,number1);
                    }
                }
            }
        }
    }
}

@Getter
@Setter
class Fabric implements Runnable{
    private Dump dump = new Dump();

    //Fabric throws some random components(head, foots, etc.) - from 1 to 4.
    @Override
    public void run (){
        int i=1;
        try{
            while((!Thread.interrupted())&&(i<=100)){
                int count = new Random().nextInt(3)+1;
                for(int j = 0; j< count; j++){
                    String str = "";
                    int num = new Random().nextInt(dump.getComponents().keySet().size());
                    Iterator iterator = dump.getComponents().keySet().iterator();
                    for (int k = 0; k <= num ; k++) {
                        str = (String)iterator.next();
                    }
                    int number = dump.getComponents().get(str).intValue();
                    number++;
                    dump.getComponents().put(str,number);
                }
                i++;
                System.out.println("DUMP: "+ dump.getComponents().toString());
                System.out.println();
                Thread.sleep(100);
            }
        }
        catch (IllegalThreadStateException e){

        }
        catch (InterruptedException e){

        }
    }

}

@Setter
@Getter
class Dump{
    private HashMap<String, Integer> components = new HashMap<>();
    public Dump(){
       components.put("Head",1);
       components.put("RAM", 2);
       components.put("Body", 2);
       components.put("LeftHand",3);
       components.put("RightHand", 3);
       components.put("LeftFoot", 4);
       components.put("RightFoot", 3);
       components.put("CPU", 1);
       components.put("HDD", 2);
    }
}

//class Component{}
//
//class Head extends Component{}
//
//class RAM extends Component{}
//
//class Body extends Component{}
//
//class LeftHand extends Component{}
//
//class RightHand extends Component{}
//
//class LeftFoot extends Component{}
//
//class RightFoot extends Component{}
//
//class CPU extends Component{}
//
//class HDD extends Component{}
