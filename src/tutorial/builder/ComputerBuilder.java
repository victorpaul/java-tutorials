package tutorial.builder;

public class ComputerBuilder {
    private String cpu;
    private String ram;
    private String gpu;
    private String mb;
    private String ssd;

    public ComputerEntity build() {
        if (cpu.equals("intel") && mb.equals("AMD asrock AM4")) {
            return null;
        } else {
            ComputerEntity ce = new ComputerEntity(cpu, ram, gpu, mb, ssd);
            return ce;
        }
    }

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder setMotherboard(String mb) {
        this.mb = mb;
        return this;
    }

    public ComputerBuilder setSSD(String ssd) {
        this.ssd = ssd;
        return this;
    }

    public String getCpu() {
        return cpu;
    }
}