import java.io.PrintStream;
import java.math.BigDecimal;

public class NewFile {
    public static final float DISTANCE= 14.5F;
    public static final  float MINUTE= 45.0F;
    public  static final float SECONDS = 30.0F;
    public static final float MILLI = 0.621371F;
    public static void main(String[] args) {
        float timeHours = MINUTE / 60.0F + SECONDS/3600.0F;
        float speedKmPerHour = DISTANCE / timeHours;
        float speedMilesPerHour = speedKmPerHour * MILLI;
        System.out.println("Result: ");
        System.out.println(speedMilesPerHour);



    }
}


