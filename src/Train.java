/**
 * File: Train.java
 * -----------------
 * This file defines the Train class, which can contain any number of train cars linked
 * at the end
 */

import acm.graphics.*;


/**
 * This class defines a GCompound that represents a train.
 * The primary operation is append, which adds a TrainCar
 * at the end of the train
 */
public class Train extends GCompound {

    /* Width of the connector, which overlaps between successive cars */
    public final double CONNECTOR = 6;

    /**
     * Creates a new train that contains no cars. Clients can add cars at the end by calling
     * append
     */
    public Train(){
        /* No operations necesary */
    }

    /**
     * Adds a new car to the end of the train
     * @param trainCar the new train car
     */
    public void append(TrainCar trainCar){
        double width = getWidth();
        //noinspection UnclearExpression An abstract class is by itself unique. I dont see the need of starting a wave of crazy statics to make sure that we are refering
        // to a class that otherwise already is unique because its been defined abstract. Are all abstract classes static by default? if so , houston, we have problems

        double x = (width == 0) ? 0 : width - CONNECTOR;
        add(trainCar, x, 0);
    }
}
