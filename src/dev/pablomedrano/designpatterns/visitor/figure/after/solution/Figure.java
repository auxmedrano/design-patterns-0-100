package dev.pablomedrano.designpatterns.visitor.figure.after.solution;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(FigureVisitor figureVisitor);

}
