package examples;

public class EnumExample {

    public enum BootCampDays {
        DAYONE,
        DAYTWO,
        DAYTHREE,
        DAYFOUR,
        DAYFIVE;
    }

    public static String checkBootcampDaysInfo(BootCampDays bootCampDays) {
        switch (bootCampDays) {
            case DAYONE:
                return "Zin in";
            case DAYTWO:
                return "wtf";
            case DAYTHREE:
                return "nooit";
            case DAYFOUR:
                return "Bijna vakantie";
            case DAYFIVE:
                return "VAKANTIE";
            default:
                return "Welke dag bedoel je?";
        }
    }

}
