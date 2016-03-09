package fun.SAV.prototype;

/**
 * Created by b1012059 on 2015/12/02.
 */
public class Config {
    private int nVehicle;
    private int nPassenger;
    private int vehicleSpeed;
    private int endStep;

    public Config(){
        nVehicle = 2;
        nPassenger = 2;
        vehicleSpeed = 30;
        endStep = 10;
    }

    public int getNvehicle(){
        return this.nVehicle;
    }
    public int getNpassenger(){
        return this.nPassenger;
    }
    public int getEndStep(){
        return this.endStep;
    }
    public int getvehicleSpeed(){
        return this.vehicleSpeed;
    }

    /**
     * 指数分布
     * @return
     */
    public int exponentialDistribution() {
        double tau = -1.0 * endStep / nPassenger * Math.log(1.0 - Math.random());
        return (int)Math.round(tau);
    }
}
