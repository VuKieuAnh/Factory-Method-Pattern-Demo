package factoryWheel;

public class WheelFactory {
    public static Wheel getWheel(NameWheel nameWheel, float diameter,float width) {
        if(nameWheel.equals(NameWheel.BANHOTO)){
            return new CarWheel(diameter, width);
        }else if(nameWheel.equals(NameWheel.BANHXEDAP)){
            return new BikeWheel(diameter, width);
        }
        return null;
    }

    public static void main(String[] args) {
        Wheel banhoto1 = getWheel(NameWheel.BANHOTO, 200, 100);
        Wheel banhoto2 = getWheel(NameWheel.BANHXEDAP, 2001, 200);
        System.out.println(banhoto1.toString());
    }
}
