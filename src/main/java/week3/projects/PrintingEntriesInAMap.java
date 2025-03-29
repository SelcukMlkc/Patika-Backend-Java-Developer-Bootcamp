package week3.projects;

import java.util.HashMap;
import java.util.Map;

public class PrintingEntriesInAMap {

    public static void main(String[] args) {

        Map<String, Integer> countryPopulations = new HashMap<>();

        countryPopulations.put("TÜRKIYE", 85_000_000);
        countryPopulations.put("GERMANY", 83_000_000);
        countryPopulations.put("EGYPT", 114_500_000);
        countryPopulations.put("JAPAN", 1_411_000_000);
        countryPopulations.put("CHINA", 85_000_000);

        for (Map.Entry<String, Integer> entry : countryPopulations.entrySet()) {
            System.out.println("Ülke: " + entry.getKey() + " - Nüfus: " + entry.getValue());
        }

    }
}
