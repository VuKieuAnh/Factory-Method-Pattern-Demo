package factoryWheel;

public class CarWheel extends Wheel {
    private float diameter;
    private float width;

    @Override
    public float getDiameter() {
        return this.diameter;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return "tao la banh xe oto";
    }

    public CarWheel(float diameter, float width) {
        this.diameter = diameter;
        this.width = width;
    }
}
