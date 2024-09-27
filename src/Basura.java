public class Basura {
    public static final int DAYSINYEAR= 365;
    public static final int GARBAGEBRIT = 500000;
    public static final int GARBAGESEA = 100;
    public static final int VALUE1 = 30;
    public static final int VALUE2 = 150;
    public static final int MINUTEINDAY = 24 * 60;
    public static final int MINUTEINSECOND = 60 * 60;

    public static void main(String[] args) {
        int garbageinday = VALUE1 * MINUTEINDAY; // garbage in one day
        int tomakegarbageinday = ((VALUE2 * MINUTEINSECOND) / 300) * 24;
        System.out.println("To recycle garbage in day " + tomakegarbageinday);
        System.out.println("To drop garbage in day " + garbageinday);
        int garbageseaday = GARBAGESEA * DAYSINYEAR;
        System.out.println("To take Garbage from sea in year " + garbageseaday + ".kg");
        System.out.println("Actual year " + GARBAGEBRIT);
        System.out.println("Year 2025 " + (GARBAGEBRIT - garbageseaday));
        System.out.println("Year 2026 " + (GARBAGEBRIT - (garbageseaday * 2)));
        System.out.println("Year 2027 " + (GARBAGEBRIT - (garbageseaday * 3)));
        System.out.println("Year 2028 " + (GARBAGEBRIT - (garbageseaday * 4)));
        System.out.println("Year 2029 " + (GARBAGEBRIT - (garbageseaday * 5)));






    }
}