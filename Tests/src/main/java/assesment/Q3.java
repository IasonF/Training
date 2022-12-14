package assesment;

import java.io.*;

class Tail {
}

public class Q3 implements Serializable {

    private String name;
    private transient int age;
    private Tail tail;

    public String getName() {
        return name;
    }

    public Tail getTail() {
        return tail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void main(String[] args) {
        try (ObjectInputStream is = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("birds.dat")))) {
            Q3 bird = (Q3) is.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}