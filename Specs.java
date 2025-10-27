abstract class Laptop1 {
    private int ram;
    private int ssd;
    private String cpu;
    public abstract int getRAM();
    public abstract int getSSD();
    public abstract String getCPU();
    @Override
    public String toString() {
        return "RAM=" + this.getRAM() + "GB, SSD=" + this.getSSD() + "GB, CPU=" + this.getCPU();
    }
    public Laptop1(int ram, int ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }
    public int getRam() {
        return this.ram;
    }
    public int getSsd() {
        return this.ssd;
    }
    public String getCpu() {
        return this.cpu;
    }
    public static Laptop1 getSpecs(String type, int ram, int ssd, String cpu) {
        if ("min".equalsIgnoreCase(type)) {
            return new Minimum1(ram, ssd, cpu);
        } else if ("reco".equalsIgnoreCase(type)) {
            return new Recommended1(ram, ssd, cpu);
        }
        return null;
    }
}
class Minimum1 extends Laptop1 {
    public Minimum1(int ram, int ssd, String cpu) {
        super(ram, ssd, cpu);
    }
    @Override
    public int getRAM() {
        return getRam();
    }
    @Override
    public int getSSD() {
        return getSsd();
    }
    @Override
    public String getCPU() {
        return getCpu();
    }
}
class Recommended1 extends Laptop1 {
    public Recommended1(int ram, int ssd, String cpu) {
        super(ram, ssd, cpu);
    }
    @Override
    public int getRAM() {
        return getRam();
    }
    @Override
    public int getSSD() {
        return getSsd();
    }
    @Override
    public String getCPU() {
        return getCpu();
    }
}
class LaptopFactory1 {
    public static Laptop1 getSpecs(String type, int ram, int ssd, String cpu) {
        if ("min".equalsIgnoreCase(type)) {
            return new Minimum1(ram, ssd, cpu);
        } else if ("reco".equalsIgnoreCase(type)) {
            return new Recommended1(ram, ssd, cpu);
        }
        return null;
    }
}
public class Specs {
    public static void main(String[] args) {
        Laptop1 min = LaptopFactory1.getSpecs("min", 8, 256, "i5-12450Hz");
        System.out.println(min);

        Laptop1 reco = LaptopFactory1.getSpecs("reco", 16, 512, "i7-12650Hz");
        System.out.println(reco);
    }
}