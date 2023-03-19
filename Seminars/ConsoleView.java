package Seminars;

// import Units.Vector2;
// import chars.HeroTeam;
import java.util.Collections;

import Seminars.Units.Position;

public class ConsoleView {
    private static int step = 0;
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b")))
            + formatDiv("-c");
    private static final String mid10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e")))
            + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h")))
            + formatDiv("-i");

    public static void view() {
        if (step++ == 0) {
            System.out.print(AnsiColors.ANSI_RED + "First step!" + AnsiColors.ANSI_RESET);
            System.out.print(AnsiColors.ANSI_GREEN +
                    String.join("", Collections.nCopies(20, formatDiv(" "))) + "Green Team" + AnsiColors.ANSI_RESET);
            System.out.println(AnsiColors.ANSI_BLUE +
                    String.join("", Collections.nCopies(55, formatDiv(" "))) + "Blue Team" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step: " + step + AnsiColors.ANSI_RESET);
            System.out.print(AnsiColors.ANSI_GREEN +
                    String.join("", Collections.nCopies(20, formatDiv(" "))) + "Green Team" + AnsiColors.ANSI_RESET);
            System.out.println(AnsiColors.ANSI_BLUE +
                    String.join("", Collections.nCopies(55, formatDiv(" "))) + "Blue Team" + AnsiColors.ANSI_RESET);
        }

        System.out.println(ConsoleView.top10);

        int npcIndex = 0;

        for (int i = 1; i <= Program.UNIT - 1; i++) {
            for (int j = 1; j <= Program.UNIT; j++) {
                System.out.print(getChar(new Position(j, i)));
            }
            System.out.print("|");
            System.out.println(PrintInfo(npcIndex));
            System.out.println(ConsoleView.mid10);
            npcIndex++;
        }

        for (int j = 1; j <= Program.UNIT; j++) {
            System.out.print(getChar(new Position(j, Program.UNIT)));
        }
        System.out.print("|");
        System.out.println(PrintInfo(npcIndex));
        System.out.println(ConsoleView.bottom10);
    }

    private static String getChar(Position position) {

        String str = "| ";
        boolean alive = false;
        for (int i = 0; i < Program.UNIT; i++) {
            if (Program.firstList.get(i).getPosition().isEquals(position)) {
                if (Program.secondList.get(i).hp == 0)
                    str = "|" + AnsiColors.ANSI_RED + Program.firstList.get(i).getCharacter().toUpperCase().charAt(0)
                            + AnsiColors.ANSI_RESET;
                else {
                    str = "|" + AnsiColors.ANSI_GREEN + Program.firstList.get(i).getCharacter().toUpperCase().charAt(0)
                            + AnsiColors.ANSI_RESET;
                    alive = true;
                }
            }
            if (Program.secondList.get(i).getPosition().isEquals(position) && !alive) {
                if (Program.secondList.get(i).hp == 0)
                    str = "|" + AnsiColors.ANSI_RED + Program.secondList.get(i).getCharacter().toUpperCase().charAt(0)
                            + AnsiColors.ANSI_RESET;
                else
                    str = "|" + AnsiColors.ANSI_BLUE + Program.secondList.get(i).getCharacter().toUpperCase().charAt(0)
                            + AnsiColors.ANSI_RESET;
            }
        }
        return str;
    }

    private static String PrintInfo(int npcIndex) {
        String str = "";

        if (Program.firstList.get(npcIndex).hp == 0)
            str += "     " + AnsiColors.ANSI_RED + Program.firstList.get(npcIndex).getInfo()
                    + AnsiColors.ANSI_RESET;
        else
            str += "     " + AnsiColors.ANSI_GREEN + Program.firstList.get(npcIndex).getInfo()
                    + AnsiColors.ANSI_RESET;
        if (Program.secondList.get(npcIndex).hp == 0)
            str += "     " + AnsiColors.ANSI_RED + Program.secondList.get(npcIndex).getInfo()
                    + AnsiColors.ANSI_RESET;
        else
            str += "     " + AnsiColors.ANSI_BLUE + Program.secondList.get(npcIndex).getInfo()
                    + AnsiColors.ANSI_RESET;

        return str;
    }

    private static String formatDiv(String str) {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500')
                .replace("s", "...")
                .replace("o", "___");
    }
}
