package dev.pablomedrano.designpatterns.visitor.figure.before;

public class Square extends Figure {

    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double numberOfSides() {
        return 4;
    }

}
