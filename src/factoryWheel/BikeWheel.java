package factoryWheel;

public class BikeWheel extends Wheel {
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
        return "Tao la banh xe dap";
    }

    public BikeWheel(float diameter, float width) {
        this.diameter = diameter;
        this.width = width;
    }
}
