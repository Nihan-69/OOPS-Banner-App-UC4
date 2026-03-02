import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Nihan
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Builds and returns a map of character patterns.
     *
     * @return Map containing character and corresponding 7-line pattern
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> characterMap = new HashMap<>();

        characterMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        characterMap.put('P', new String[]{
                "  ****** ",
                " *     * ",
                "*       *",
                "  ****** ",
                " *       ",
                " *       ",
                " *       "
        });

        characterMap.put('S', new String[]{
                " ********",
                " *       ",
                "*        ",
                " ********",
                "        *",
                " *      *",
                "  ****** "
        });

        return characterMap;
    }

    /**
     * Renders the banner message using character patterns.
     *
     * @param message      the word to display
     * @param characterMap map containing character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> characterMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = characterMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]);
                }
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}