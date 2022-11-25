package Transport;

public class ServiceStation{
    private final Queue <Transport> serviceQueue = new LinkedList<>();

    public void addToQueue (Car car) {service-Queue.add(car);}
    public void addToQueue (Truck truck) { serviceQueue.add(truck);}

    public void service(){
        Transport next = serviceQueue.poll();
        if (next != null){
            System.out.println("Servicing" + next.getModel() + " " + next.getBrand());
        }
    }
}