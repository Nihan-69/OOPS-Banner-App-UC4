/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Static Inner Class
 *
 * @author Nihan
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class to encapsulate
     * character and its banner pattern.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character the character symbol
         * @param pattern   the 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         *
         * @return character symbol
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         *
         * @return 7-line banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to create O pattern
     *
     * @return 7-line pattern for letter O
     */
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

    /**
     * Utility method to create P pattern
     *
     * @return 7-line pattern for letter P
     */
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

    /**
     * Utility method to create S pattern
     *
     * @return 7-line pattern for letter S
     */
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

    /**
     * Main method to assemble and print banner.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {

            StringBuilder row = new StringBuilder();

            // O O P S
            row.append(patterns[0].getPattern()[i]);
            row.append(patterns[0].getPattern()[i]);
            row.append(patterns[1].getPattern()[i]);
            row.append(patterns[2].getPattern()[i]);

            banner[i] = row.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}