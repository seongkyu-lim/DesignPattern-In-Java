package CreationalPattern.Builder.builders;

import CreationalPattern.Builder.cars.CarType;
import CreationalPattern.Builder.components.Engine;
import CreationalPattern.Builder.components.GPSNavigator;
import CreationalPattern.Builder.components.Transmission;
import CreationalPattern.Builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
