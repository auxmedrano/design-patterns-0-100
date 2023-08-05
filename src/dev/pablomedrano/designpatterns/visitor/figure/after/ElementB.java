package dev.pablomedrano.designpatterns.visitor.figure.after;

public class ElementB implements Element {

    private String attributeB;

    public ElementB() {
        attributeB = "B";
    }

    public String getAttributeB() {
        return attributeB;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

}
