package dev.pablomedrano.designpatterns.visitor.figure.after;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {


    public static void main(String[] args) {
        List<Element> elementList;
        elementList = new ArrayList<>();
        elementList.add(new ElementA());
        elementList.add(new ElementB());
        elementList.add(new ElementA());
        elementList.add(new ElementB());
        elementList.add(new ElementB());

        Visitor1 visitor1 = new Visitor1();
        for (Element element : elementList) {
            element.accept(visitor1);
        }

        Visitor2 visitor2 = new Visitor2();
        for (Element element : elementList) {
            element.accept(visitor2);
        }
        System.out.println("Count As: "+ visitor2.getAs());
        System.out.println("Count Bs: "+ visitor2.getBs());
    }

}
