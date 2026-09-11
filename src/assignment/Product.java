package assignment;

public class Product {
    private final String CPU;
    private final String GPU;
    private final String RAM;
    private final boolean gpuIntegrated;
    private final String storage;

    Product(String CPU, String GPU, String RAM, boolean gpuIntegrated, String storage){
        this.CPU = CPU; this.GPU = GPU;
        this.RAM = RAM; this.gpuIntegrated = gpuIntegrated;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer[" + CPU + ", " + GPU + ", " + RAM + ", "  + gpuIntegrated + ", "  + storage + "] \n";
    }
}
