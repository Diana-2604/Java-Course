package Lesson6;

public class Notebook {
    private String brand;
    private String os;
    private Integer cores;
    private Integer ram;
    private boolean sensor;
    private Integer price;

    public Notebook(String brand, String os, Integer cores, Integer ram, boolean sensor, Integer price) {
        this.brand = brand;
        this.os = os;
        this.cores = cores;
        this.ram = ram;
        this.sensor = sensor;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getOS() {
        return this.os;
    }

    public Integer getCores() {
        return this.cores;
    }

    public Integer getRAM() {
        return this.ram;
    }

    public boolean getSensor() {
        return this.sensor;
    }

    public Integer getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return ("Brand: " + brand + ", OS: " + os + ", " + cores + " cores, RAM: " + ram + "GB, Sensor: " + sensor + ", Price: " + price + " rub\n");
    }
}

