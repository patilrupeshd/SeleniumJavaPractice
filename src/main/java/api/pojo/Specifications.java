package api.pojo;

public class Specifications {
    private String processor;
    private String ram;
    private String storage;
    private String display;
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    public Integer getWarranty_years() {
        return warranty_years;
    }
    public void setWarranty_years(Integer warranty_years) {
        this.warranty_years = warranty_years;
    }
    public String getBattery_life() {
        return battery_life;
    }
    public void setBattery_life(String battery_life) {
        this.battery_life = battery_life;
    }
    public String getBluetooth_version() {
        return bluetooth_version;
    }
    public void setBluetooth_version(String bluetooth_version) {
        this.bluetooth_version = bluetooth_version;
    }
    public Boolean getNoise_cancellation() {
        return noise_cancellation;
    }
    public void setNoise_cancellation(Boolean noise_cancellation) {
        this.noise_cancellation = noise_cancellation;
    }
    private Integer warranty_years;
    private String battery_life;
    private String bluetooth_version;
    private Boolean noise_cancellation;
}
