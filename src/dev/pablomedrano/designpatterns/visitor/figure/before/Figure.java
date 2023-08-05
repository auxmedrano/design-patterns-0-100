package dev.pablomedrano.designpatterns.visitor.figure.before;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double numberOfSides();

}
