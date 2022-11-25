package Transport;

public class Mechanic {

    private final String firstName;
    private final String lastName;
    private finak String
    company;
    private final MechanicTransportType type;

    public Mechanic(String firstName, String company, MechanicTransportType type)
}

    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.type = type;
}

    public void doMaintenance(){
        System.out.printf("Механик %s проводит техобслуживание",firstName,lastName);
        }
        public void fixCar (Transport car) {
            System.out.printf ("Чиним машину", %s %s, car.getBrand().car.getModel();
        }
            public String getFirstName(){
                return firstName;
            }
            public String getLastName(){
                return lastName;
            }
            public String getCompany(){
                return company;
            }
            public MechanicTransportType getType(){
                return type;
            }
        }