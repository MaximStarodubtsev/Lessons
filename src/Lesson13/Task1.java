package Lesson13;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\RandomNumbersFile.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new Computer("mac", 12299));
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(path.toFile());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Computer computer = (Computer)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(computer.model + " " + computer.series);
        }
        catch(FileNotFoundException e){

        }
        catch (IOException e){

        }
        catch (ClassNotFoundException e){

        }
    }
}

class Computer implements Serializable {
    String model;
    int series;

    public Computer(String model, int series) {
        this.model = model;
        this.series = series;
    }
}