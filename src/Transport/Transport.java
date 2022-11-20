package Transport;

public abstract class Transport {

    private String brand;
    String model;
    private int productionYear;
    String productionCountry;
    String color;
    private int maxSpeed;
    private String fuel;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String дизель) {

            }

    public int Transport(String brand, String model, int productionYear, String productionCountry, String fuel) {
        this(brand, model, productionYear, productionCountry, "Серый", 1582, fuel);

        if (brand == null) {
            this.brand = "audi";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "TT";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;

        if (productionCountry == null) {
            this.productionCountry = "Индия";
        } else {
            this.productionCountry = brand;
        }
        if (color == null) {
            this.color = "серый";
        } else {
            this.color = color;
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 1000;
        } else {
            this.fuel = fuel;

        }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color,
        int maxSpeed, String fuel){
            if (brand == null) {
                this.brand = "audi";
            } else {
                this.brand = brand;
            }
            if (model == null) {
                this.model = "TT";
            } else {
                this.model = model;
            }
            this.productionYear = productionYear;

            if (productionCountry == null) {
                this.productionCountry = "Индия";
            } else {
                this.productionCountry = productionCountry;
            }
            if (color == null) {
                this.color = "серый";
            } else {
                this.color = color;
            }
            if (maxSpeed == 0) {
                this.maxSpeed = 1000;
            } else {
                this.maxSpeed = maxSpeed;
            }
            this.fuel = fuel;

        }

        public String getFuel () { return fuel;
        }

        java.lang.String fuel1 = fuel;
        java.lang.String fuel2 = fuel;
        public void setFuel (String fuel){
            if (fuel == null) {
                this.fuel = "топливо";
            } else {
                this.fuel = fuel;
            }
        }

        public String getBrand () {
            return brand;
        }

        java.lang.String brand1 = brand;
        public void setBrand (String brand){
            if (brand == null && brand.isEmpty()) {
                this.brand = "audi";
            } else {
                this.brand = brand;
            }
        }

        public String getModel () {
            return model;
        }

        java.lang.String model1 = model;
        public void setModel (String model){
            if (model == null && model.isEmpty()) {
                this.model = "TT";
            } else {
                this.model = model;
            }
        }

        public String getProductionYear () {
            return productionYear;
        }

        public String getProductionCountry () {
            return productionCountry;
        }

        public String getColor;
        () {
            return color;
        }

        public void setColor (String color){
            if (color == null) {
                this.color = "серый";
            } else {
                this.color = color;
            }
        }

        public int getMaxSpeed () {
            return maxSpeed;
        }

        public void setMaxSpeed ( int maxSpeed){
            if (maxSpeed == 0) {
                this.maxSpeed = 1000;
            } else {
                this.maxSpeed = maxSpeed;
            }
        }

        public abstract void refill ();

        protected abstract void refill (Boolean Object gasoline;
        gasoline,  Object Object diesel;
        diesel; Object electricity; electricity);
    }
}