package dev.pablomedrano.designpatterns.visitor.figure.after.solution;

public class Circle extends Figure {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(FigureVisitor figureVisitor) {
        figureVisitor.visitCircle(this);
    }

}
