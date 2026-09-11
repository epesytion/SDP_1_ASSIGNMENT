package assignment;

public class Director {
    public void makeOfficeLaptop(Builder builder){
        builder
                .setCPU("AMD Ryzen 5 7500f")
                .setGPU("Radeon Graphics")
                .setRAM("16 GB DDR5")
                .setIntegrated(true)
                .setStorage("SSD 256 GB");
    }
    public void makeGamingPC(Builder builder){
        builder
                .setCPU("Intel Core i9-14700K")
                .setGPU("NVIDIA GeForce RTX 5070")
                .setRAM("32 GB DDR5")
                .setIntegrated(false)
                .setStorage("HDD 2 TB");
    }
    public void myLaptop(Builder builder){
        builder
                .setCPU("AMD Ryzen 7 5825U")
                .setGPU("Radeon Graphics")
                .setRAM("SSD 32 GB")
                .setIntegrated(true)
                .setStorage("SSD 512 GB");
    }
}
