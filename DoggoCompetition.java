package PeerProgramming;

import java.util.ArrayList;
import java.util.List;

public class DoggoCompetition {

    public static List<String> doggoCompetition (int myDogsPosition) {
        List<String> places = new ArrayList<>();
        String[] endings = {"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};

        // build list with all positions.
        for (int i = 1; i <= 99; i++) {
            String toAdd = "";
            Integer wrapped = i;
            String thisNum = wrapped.toString();
            toAdd += thisNum;

            if (i < 10) {
                char lastDigit = thisNum.charAt(0);
                toAdd += endings[(int) lastDigit - 48];
            }
            else if (i < 100) {
                char lastDigit = thisNum.charAt(1);
                char firstDigit = thisNum.charAt(0);
                if (firstDigit == '1') {
                    toAdd += endings[0];
                }
                else {
                    toAdd += endings[(int) lastDigit - 48];
                }
            }
            places.add(toAdd);
        }
        places.add("100th");

        //remove myDogsPosition
        places.remove(myDogsPosition-1);

        return places;
    }

}
