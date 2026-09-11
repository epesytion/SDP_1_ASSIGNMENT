package assignment;

public class Client {
    static void main(String[] args) {
        Director director = new Director();

        ObjectBuilder objectBuilder = new ObjectBuilder();
        director.makeGamingPC(objectBuilder);

        TextBuilder textBuilder = new TextBuilder();
        director.myLaptop(textBuilder);


        System.out.println(objectBuilder.build());
        System.out.println(textBuilder.getResult());

    }
}
