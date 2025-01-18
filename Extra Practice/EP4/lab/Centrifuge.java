package lab;

public class Centrifuge extends LabEquipment {

    private int maxRPM;
    public static final int MIN_RPM = 500;



    public Centrifuge(String manufacturer, String model,int MIN_YEAR, int maxRPM) {
        super(manufacturer, model, MIN_YEAR);
        this.maxRPM = maxRPM;
    }

    //Copy constructor
    public Centrifuge(Centrifuge source){
        super(source);
        setMaxRPM(source.maxRPM);

    }


    public int getMaxRPM() {
        return this.maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        if(maxRPM < MIN_RPM ){
            throw new IllegalArgumentException("Max RPM must be greater thant min RPM");
        }
        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance : Check the rotor, clean teh chamber, and lubricate the spindle.";
    }

    @Override
    public LabEquipment clone() {
        return new Centrifuge(this);
    }


}
