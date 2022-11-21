package Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        Car lada = new Car("Lada ", "Granda", 2015, "России", "серого", 1.3);
        lada.setRegistrationNumber("а222го21");
        System.out.println(lada.isCorrectRegNumber());

        Car audi = new Car("Audi ", "A8 50 L TDI", 2020, "Германии", "белый ", 3.0);
        audi.setGearBox("AT");
        audi.setTiresWinOrSum(false);
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 30_000, "66698365"));
        audi.getInsurance().checkExpireDate();
        audi.getInsurance().checkNumber();
        audi.setFuel("Дизель");

        Car bmw = new Car("BMW ", "Z8", 2021, "Германии", "белый ", 3.0);
        bmw.setTiresWinOrSum(false);
        bmw.setKey(new Car.Key(true, true));
        bmw.setFuel("Электро");

        Car kia = new Car("Kia ", "Sportage", 2018, "Южной Корее", "красный ", 2.4);
        Car hyundai = new Car("Hyundai ", "Avante", 2016, "Южной Корее", "оранжевый ", 1.6);

        System.out.println();
        printInfoCar(lada);
        printInfoCar(audi);
        printInfoCar(bmw);
        printInfoCar(kia);
        printInfoCar(hyundai);

        System.out.println();

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println();
        printInfoTrain(lastochka);
        printInfoTrain(leningrad);

        System.out.println();

        Bus nefaz = new Bus("НефАЗ", "5299", 2000, "Россия", "Синий", 140);
        Bus city = new Bus("Сити Ритм", "10", 2018, "Россия", "Голубой", 190);
        Bus paz = new Bus("Паз", "3205", 1966, "Россия", "Зеленый", 100);

        System.out.println();
        printInfoBus(nefaz);
        printInfoBus(city);
        printInfoBus(paz);

    }

    public static void printInfoCar(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуска " + car.getProductionYear() +
                        ", страна сборки " + car.getProductionCountry() +
                        ", цвет кузова " + car.getColor() +
                        ", обьем двигателя " + car.getEngineVolume() +
                        ", коробка передач - " + car.getGearBox() +
                        ", тип кузова - " + car.getBody() +
                        ", рег.номер - " + car.getRegistrationNumber() +
                        ", кол-во мест - " + car.getNumberOfSeats() +
                        ",  " + (car.isSummerTyres() ? "летняя" : "зимняя") + "резина" +
                        ", " + (car.getKey().isKeylessAccess() ? "безключевой доступ" : "ключевой") +
                        ", " + (car.getKey().isDisStart() ? "удаленный запуск" : "не удаленный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumOfInsurance() +
                        ", стоимость страховки: " + car.getInsurance().getCostInsurance() +
                        ", срок действия страховки: " + car.getInsurance().getInsuranceValPer()+
                        ", топливо: "+car.getFuel()
        );
    }

    public static void printInfoTrain(Train train) {
        System.out.println(
                train.getBrand() + " " + train.getModel() +
                        ", год выпуска " + train.getProductionYear() +
                        ", страна сборки " + train.getProductionCountry() +
                        ", скорость передвижения -  " + train.getMaxSpeed() +
                        ", цена проезда - " + train.getPriceOfTrip() +
                        ", отходит от - " + train.getStationName() +
                        ", следует до - " + train.getFinalStop() +
                        ", в поезде - " + train.getNumberOfWagons() + " вагонов."
        );
    }

    public static void printInfoBus(Bus bus) {
        System.out.println(
                bus.getBrand() + " " + bus.getModel() +
                        ", год выпуска " + bus.getProductionYear() +
                        ", страна сборки " + bus.getProductionCountry() +
                        ", скорость передвижения -  " + bus.getMaxSpeed() +
                        ", цвет - " + bus.getColor() +
                        ", скорость - " + bus.getMaxSpeed()
        );
    }
}