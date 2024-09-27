public class NewFile1 {
    public static final float PI = 3.1416F;
    public static final float RADIUS = 3.0F;
    public  static  final float HEIGHT = 4.0F;
    public static final float LEG = 5.0F;

    public static void main(String[] args) {
        float area = PI * RADIUS * RADIUS; // it is formula for search square of circle
        float perimeter = 2 * PI * RADIUS; // it is formula for search perimeter of circle
        float areatran= LEG * (HEIGHT / 2); // it is formula for search of square of treangulo
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Square od Trean is " + areatran);

    }
}
