package zad1;

public class Main {

    public static void main(String[] args) {



        //   Bulb bulb2 = new Bulb("Osram", 100, 200);
        //   Bulb bulb3 = new Bulb("Philips", 340, 210);

        Bulb bulb = new Bulb();

        try {


            Bulb philips = bulb.create("Philips", 100, 130);
            Bulb osram = bulb.create("Osram",123,170);

            System.out.println(philips.description());
            System.out.println(osram.bustPower().description());
        } catch (Exception error) {
            error.printStackTrace();
        }

        try {
            bulb.create("No Name",0,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //  System.out.println(bulb2.description());
        //  System.out.println(bulb3.description());


          System.out.println(Bulb.bulbCounter);

    }
}

