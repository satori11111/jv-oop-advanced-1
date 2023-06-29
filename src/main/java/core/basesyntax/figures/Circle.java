package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area:" + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }
}