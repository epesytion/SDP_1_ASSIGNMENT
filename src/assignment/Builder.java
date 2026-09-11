package assignment;

public interface Builder { //fluent
    Builder setCPU(String CPU);
    Builder setGPU(String GPU);
    Builder setRAM(String RAM);
    Builder setIntegrated(boolean gpuIntegrated);
    Builder setStorage(String storage);
    Builder build();
}
