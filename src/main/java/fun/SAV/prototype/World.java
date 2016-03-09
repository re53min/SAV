package fun.SAV.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by b1012059 on 2015/12/02.
 */
public class World {
    private static Logger log = LoggerFactory.getLogger(World.class);
    private HashMap<Integer, Passenger> passengers;
    private ArrayList<Vehicle> vehicles;
    private Config conf;
    private AllocationSystem server;
    private int nextStep;

    public World(Config conf){
        this.conf = conf;
        nextStep = conf.exponentialDistribution();

        passengers = new HashMap<>();
        vehicles = new ArrayList();
        server = new AllocationSystem();

        for(int i = 0; i < conf.getNvehicle(); i++){
            Vehicle v = new Vehicle();
            vehicles.add(v);
        }
        for(int i = 0; i < conf.getNpassenger(); i++){
            Passenger p = new Passenger();
            passengers.put(i,p);
        }
        server.addAllVehicles(vehicles);
    }

    /**
     * デマンド発生
     */
    public void demand(int epoch){
        if(epoch == nextStep){

        }

    }

    private static void testWorld(){
        int epoch = 0;
        Config conf = new Config();

        World world = new World(conf);
        while(epoch < conf.getEndStep()) {
            epoch++;
            log.info("Hello World");
        }
    }

    public static void main(String args[]){
        testWorld();
        //System.out.println("Hello World");
    }
}
