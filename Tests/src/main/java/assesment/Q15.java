package assesment;

public class Q15 {
    enum AnimalsInPark {
        SQUIRREL, CHIPMUNK, SPARROW;
    }

    public static void main(String[] args) {
        AnimalsInPark[] animals = AnimalsInPark.values();
        System.out.println(animals[1]);
    }
}

