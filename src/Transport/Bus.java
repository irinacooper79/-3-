package Transport;

public class Bus  extends Transport {

    public String destination;
    private String statusRefill;

    public Bus(String brand, String model, int productionYear, String productionCountry, String fuel) {
        super(brand, model, productionYear, productionCountry, fuel);
    }

    public String getDestination() {
        return destination;
    }

    public String setDestination(String destination) {
        if (destination != null) {
            this.destination = destination;
        } else {
            this.destination = "место назначения - Москва-Петушки";
        }

        @Override
        public void refill () {
        }

            @Override
            protected void refill Object Boolean;
        ( Boolean boolean gasoline;
        gasoline, Boolean boolean diesel;
        diesel, Boolean Object electricity, electricity){
                if (gasoline || diesel) {
                    statusRefill = "пополнен";
                } else {
                    statusRefill = "не пополнен";
                }
            }

            @Override
            public String toString () {
                return "Bus {" +
                        "destination='" + destination + '\'' +
                        ", statusRefill='" + statusRefill + '\'' +
                        '}';
            }
        }
    }
