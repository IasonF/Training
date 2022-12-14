package ict;

public class FieldsAreInhereted {
    int field = 1;
}

class Child extends FieldsAreInhereted {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.field);
    }
}
