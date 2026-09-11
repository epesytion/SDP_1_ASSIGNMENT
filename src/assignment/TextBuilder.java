package assignment;

public class TextBuilder implements Builder {
    private final StringBuilder sb = new StringBuilder("* * * * * * * * * * * *\n" +
                                                       "* Computer Spec Sheet *\n" +
                                                       "* * * * * * * * * * * *\n");

    public TextBuilder setCPU(String CPU) {
        sb.append("- CPU: ").append(CPU).append("\n");
        return this;
    }
    public TextBuilder setGPU(String GPU) {
        sb.append("- GPU: ").append(GPU).append("\n");
        return this;
    }
    public TextBuilder setRAM(String RAM) {
        sb.append("- RAM: ").append(RAM).append("\n");
        return this;
    }
    public TextBuilder setIntegrated(boolean isIntegrated) {
        if (isIntegrated){
            sb.append("- GPU is integrated into CPU: ");
            return this;
        }
        else {
            sb.append("- GPU is not integrated into CPU: ");
            return this;

        }
    }
    public TextBuilder setStorage(String storage) {
        sb.append("- Storage: ").append(storage).append("\n");
        return this;
    }
    public String getResult(){
        return sb.toString();
    }



}


