/*
 * Copyright (C) 2017 Max 'Libra' Kersten
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package shouldersurfer;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Max 'Libra' Kersten
 */
public class ShoulderSurfer {

    //The character which needs to be used as a marking which character is unsure, a question mark by default
    private static final String DIVIDER = "?";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String used during debugging
        calculateKeyMappings(DIVIDER + "te" + DIVIDER + "sten");
        //calculateKeyMappings("?qwer?yy");
        //Obtain source from input
        //calculateKeyMappings(getArguments(args));
        //The LevenshteinDistance will be implemented in a coming update
        //calculateLevenshteinDistance(source);
    }

    /**
     * Checks if the amount of parameters is no more or less than one, which is
     * then returned. Otherwise it displays an error message.
     *
     * @param args the list of arguments
     * @return the given argument
     */
    private static String getArguments(String[] args) {
        //check >1 || <1 args, error if true
        if (args.length > 1) {
            System.out.println("[ShoulderSurfer] Error: please provide only one parameter");
            System.exit(0);
        } else if (args.length < 1) {
            System.out.println("[ShoulderSurfer] Error: please provide a parameter");
            System.exit(0);
        }
        return args[0];
    }

    private static void calculateLevenshteinDistance(String source) {
//        Map<String, Integer> distances = new HashMap<>();
//        for (String target : Library.dictionary) { //Obtain target from wordlist
//            //Calculate the Levenshtein distance between the source and the current dictionary entry
//            distances.put(target, LevenshteinDistance.calculate(source, target));
//        }
    }

    /**
     * This is the main function to calculate the available options using the
     * given uncertain characters
     *
     * @param source the user input as is passed using the argument
     */
    private static void calculateKeyMappings(String source) {
        List<String> possibilities = findUncertainCharacters(filterInput(source));
        Map<String, List<String>> results = createMapping(possibilities);

        //Generate all possible passwords
        //For each unknown character, the whole generated list will be used.
        List<String> lists = new ArrayList<>();
        //The first item in the list, is the given input as it is provided by the user
        lists.add(source);

        for (int i = 0; i < results.keySet().size(); i++) {
            //Get the key and value set for each keyset
            String key = results.keySet().toArray()[i].toString();
            List<String> values = results.get(key);

            //Loop through the output list (using lists-list as a temporary list for the options)
            List<String> output = new ArrayList<>();
            for (String value : values) {
                for (String entry : lists) {
                    //Remove the divider and the associated unknown character for a possible character
                    output.add(entry.replace(DIVIDER + key, value));
                }
            }
            //Clear the list
            lists.clear();
            //Repopulate the list with the list with more options, until there are no divider characters left
            lists.addAll(output);
        }
        //Print each entry in the list, which is a possible outcome based on the given input by the user
        for (String entry : lists) {
            System.out.println(entry);
        }
    }

    /**
     * Filters the input to avoid errors
     *
     * @param source the userinput as is passed using the argument
     * @return a String[] which contains the unknown characters as the first
     * character of each value
     */
    private static String[] filterInput(String source) {
        //If the input ends with a divider character, it is remporarely removed to avoid an error or a loop during the replacement
        if (source.endsWith(DIVIDER)) {
            source = source.substring(0, source.length() - 1);
        } else if (source.contains(DIVIDER + DIVIDER)) { //Two divider characters would also cause an error or a loop. A solution is given for the user and the program exits
            System.out.println("[ShoulderSurfer] The specified character to mark unsure characters is '" + DIVIDER + "'");
            System.out.println("[ShoulderSurfer] Can not use a double '" + DIVIDER + "', use another character which is mapped next to it instead!");
            System.exit(0);
        }

        //Split the input in multiple values, based on the DIVIDER
        String[] output = source.split("\\" + DIVIDER);
        String[] correctedOutput = new String[output.length - 1];
        for (int i = 1; i < output.length; i++) { //int i = 1 by default so we skip the first value of the output, which equals nothing
            //The correctedOutput should start at 0, since does not have the redundant empty value slot at index 0
            correctedOutput[i - 1] = output[i];
        }
        return correctedOutput;
    }

    /**
     * Using the array that is created in the filterInput-method, the unknown
     * characters are defined
     *
     * @param splittedSourceArray the String-array as is created by the
     * filterInput method
     * @return a list with the uncertain characters
     */
    private static List<String> findUncertainCharacters(String[] splittedSourceArray) {
        List<String> possibilities = new ArrayList<>();

        //Save all uncertain characters in the possibilities list, each first character in the splittedSourceArray is an unknown character
        for (int i = 0; i < splittedSourceArray.length; i++) {
            possibilities.add((splittedSourceArray[i].substring(0, 1)));
        }

        //Check if the possibilities list is not empty, if so: the program will shut down
        if (possibilities.size() <= 0) {
            System.out.println("[ShoulderSurfer] No possible options have been found!");
            System.exit(0);
        }
        return possibilities;
    }

    /**
     * Loads the mapped keys as they are defined in the PossibleKeys.java class
     *
     * @param possibilities possible unknown characters based on the userinput
     * @return a Map<UnknownCharacter, PossibleOptions>
     */
    private static Map<String, List<String>> createMapping(List<String> possibilities) {
        //Obtain all mapped keys
        Map<String, HashSet<String>> mapping = PossibleKeys.getAllKeys();
        //Create Map<String, List<String>> to store results
        Map<String, List<String>> results = new HashMap<>();

        //Calculate and store all posibilities per character
        for (String possibility : possibilities) {
            //List used in the results HashMap
            List<String> list = new ArrayList<>();

            //if the key consists, it is added to the list, else an error message is displayed and the program is shut down
            if (mapping.containsKey(possibility)) {
                for (String option : mapping.get(possibility)) {
                    list.add(option);
                }
                //The possible character with the list of mapped keys is saved in the results hashmap.
                results.put(possibility, list);
            } else {
                System.out.println("Character " + possibility + " has no mapping. Therefore, no alternatives can be calculated.");
                System.out.println("You can try to map " + possibility + " in the source code and recompile ShoulderSurfer to function properly");
                System.exit(0);
            }
        }
        return results;
    }
}
