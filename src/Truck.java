public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service(ServiceStation station) {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            station.updateTyre();
        }
        station.checkEngine();
        station.checkTrailer();
    }

}
