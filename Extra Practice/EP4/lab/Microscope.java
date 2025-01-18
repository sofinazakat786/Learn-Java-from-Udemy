package lab;

public class Microscope extends LabEquipment {

    private int magnification;

    public static final int MIN_MAGNIFICATION = 1;

    public Microscope(String manufacturer, String model, int MIN_YEAR, int magnification) {
        super(manufacturer, model, MIN_YEAR);
        this.magnification = magnification;
    }

    public Microscope(Microscope source){
        super(source);
        setMagnification(source.magnification);

    }

    //Getters and Setters
    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if (magnification < MIN_MAGNIFICATION) {
            throw new IllegalArgumentException("Manufacturer cannot be less than min mag");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance : Clean teh lenses and check the light source.";
    }

    @Override
    public LabEquipment clone() {
        return new Microscope(this);
    }



}

