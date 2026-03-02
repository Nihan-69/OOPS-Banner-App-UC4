/**
 * OOPSBannerApp
 *
 * UC6: Refactor Banner Logic into Functions
 *
 * @author Nihan
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] banner = new String[7];

        // Assemble O O P S
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
                "  ****** ",
                " *     * ",
                "*       *",
                "  ****** ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
                " ********",
                " *       ",
                "*        ",
                " ********",
                "        *",
                " *      *",
                "  ****** "
        };
    }
}