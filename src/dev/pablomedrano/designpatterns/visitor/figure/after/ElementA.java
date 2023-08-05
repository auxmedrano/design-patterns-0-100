package dev.pablomedrano.designpatterns.visitor.figure.after;

public class ElementA implements Element {

    private String attributeA;

    public ElementA() {
        attributeA = "A";
    }

    public String getAttributeA() {
        return attributeA;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

}
