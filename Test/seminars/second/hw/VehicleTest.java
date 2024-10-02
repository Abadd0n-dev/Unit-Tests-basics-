package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void carIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertTrue(car instanceof Vehicle, "экземпляр объекта Car является экземпляром транспортного средства");
    }

    @Test
    void carShouldHaveFourWheels() {
        Car car = new Car("Toyota", "Camry", 2020);
        assertEquals(4, car.getNumWheels(), "объект Car создается с 4-мя колесами.");
    }

    @Test
    void motorcycleShouldHaveTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        assertEquals(2, motorcycle.getNumWheels(), "объект Motorcycle создается с 2-мя колесами");
    }

    @Test
    void carTestDriveShouldSetSpeedTo60() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed(), "объект Car развивает скорость 60 в режиме тестового вождения");
    }

    @Test
    void motorcycleTestDriveShouldSetSpeedTo75() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "объект Motorcycle развивает скорость 75 в режиме тестового вождения");
    }

    @Test
    void carShouldStopWhenParked() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Скорость автомобиля должна быть 60 после тест-драйва.");
        car.park();
        assertEquals(0, car.getSpeed(), "Автомобиль должен остановиться после парковки.");
    }

    @Test
    void motorcycleShouldStopWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Скорость мотоцикла должна быть 75 после тест-драйва.");
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Мотоцикл должен остановиться после парковки.");
    }
}