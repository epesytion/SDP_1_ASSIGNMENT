package assignment;

public class ObjectBuilder implements Builder{
    private String CPU, GPU, RAM, storage;
    private boolean gpuIntegrated;

    public ObjectBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this; //return 'this' for method chaining
    }

    public ObjectBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public ObjectBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ObjectBuilder setIntegrated(boolean gpuIntegrated) {
        this.gpuIntegrated = gpuIntegrated;
        return this;
    }

    public ObjectBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Product build() {
        try {
            return new Product(CPU, GPU, RAM, gpuIntegrated, storage);
        }
        catch (IllegalStateException e){
            System.out.println("Field cannot be empty");
            return null;
        }
        catch (Exception e){
            System.out.println("Something went wrong");
            return null;
        }
    }
}
