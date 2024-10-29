public class ServiceStation implements ServiceStationInterfase {

    @Override
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());

        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
        if (transport instanceof Car || transport instanceof Truck) {
            checkEngine();
        }
        if (transport instanceof Truck) {
            checkTrailer();
        }
    }
}










