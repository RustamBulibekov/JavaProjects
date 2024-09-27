import javax.swing.plaf.PanelUI;


public class Temperatura {
    public static final float CHANGETOMILE = 0.621371f;
    public static final int TEMPERATURACELCIA = 27;
    public static final int SPEEDKM = 100;
    public static final int MOISTURE = 70;
    public static final float CONCTANTC1 = -42.379f; // constant c1 de formula index warm
    public static final float CONSTANTC2 = 2.04901523f; // constant c2 de formula index warm
    public static final float CONSTANTC3 = 10.14333127f; // constant c3 de formula index warm
    public static final float CONSTANTC4 = -0.22475541f; // constant c4 de formula index warm
    public static final double CONSTANTC5 = -6.83783 * Math.pow(10, -3); // constant c5 de formula index warm
    public static final double CONSTANTC6 = -5.481717 * Math.pow(10, -2);// constant c de formula index warm
    public static final double CONSTANTC7 = 1.22874 * Math.pow(10, -3); // constant c7 de formula index warm
    public static final double CONSTANTC8 = 8.5282 * Math.pow(110, -4); // constant c8 de formula index warm
    public static final double CONSTANTC9 = -1.99 * Math.pow(10, -6);// constant c9 de formula index warm

    public static void main(String[] args) {

        float TemperaturaFaren = ((float)TEMPERATURACELCIA * 9 / 5) + 32; // change temp from C to F

        float VelocMil = SPEEDKM * CHANGETOMILE; // change km to ml


        double windchill_in_farengate = 37.74 + (0.6215 * TemperaturaFaren) - 35.75 * (Math.pow(VelocMil,0.16)) +
                0.4275 * TemperaturaFaren * (Math.pow(VelocMil,0.16)); // formula wind chill

        double windchill_in_celcius = (windchill_in_farengate - 32) * 5 / 9; // change result to C

        float moisture_in_figure = (float) MOISTURE / 100;// to change procent in number


        double index_warm_farengate = CONCTANTC1 + CONSTANTC2 * TemperaturaFaren + CONSTANTC3 * moisture_in_figure +
                CONSTANTC4 * TemperaturaFaren * moisture_in_figure + CONSTANTC5 * (Math.pow(TemperaturaFaren,2)) +
                CONSTANTC6 * (Math.pow(moisture_in_figure, 2)) + CONSTANTC7 * (Math.pow(TemperaturaFaren, 2))
                * moisture_in_figure + CONSTANTC8 * TemperaturaFaren * (Math.pow(moisture_in_figure, 2)) +
                CONSTANTC9 * (Math.pow(TemperaturaFaren, 2)) * (Math.pow(moisture_in_figure, 2)); // formula index warm

        double index_warm_celcius = (index_warm_farengate - 32) * 5/9; // change to C



        System.out.println("INPUT: Temperate in celcius " + TEMPERATURACELCIA + "\nSpeed of wind " + SPEEDKM + "\nMoisture in % " +MOISTURE);
        System.out.println("Change temperature in farengate: " + TemperaturaFaren);
        System.out.println("Change speed in mile from km: " + VelocMil);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("Result wild chill in celcius " + windchill_in_celcius);
        System.out.println("Result Index warm in celcius "+ index_warm_celcius);


    }

}

