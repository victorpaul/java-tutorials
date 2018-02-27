package tutorial.builder;

public class ComputerEntity {
    private String cpu;
    private String ram;
    private String gpu;
    private String motherboard;
    private String ssd;

    public ComputerEntity(String cpu, String ram, String gpu, String motherboard, String ssd) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getSsd() {
        return ssd;
    }
}
