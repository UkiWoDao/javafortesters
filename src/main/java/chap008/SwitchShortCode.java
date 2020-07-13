package chap008;

public class SwitchShortCode {

    public static String shortCodeSorting(String shortCode) {
        if (shortCode.toLowerCase().matches("uk")) {
            shortCode = "UK";
        }
        String longCode;
        switch(shortCode) {
            case "UK":
                longCode = "United Kingdom";
                break;
            case "US":
            case "USA":
                longCode = "United States";
                break;
            case "FR":
                longCode = "France";
                break;
            case "SE":
                longCode = "Sweden";
                break;
            default:
                longCode = "Rest Of World";
        }
        System.out.println(longCode);
        return longCode;
    }

}
