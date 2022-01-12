package com.hiperium.algorithms.arrays;

import com.hiperium.algorithms.annotation.BiDimensionalListConverter;
import com.hiperium.algorithms.annotation.IntegerArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

class TournamentWinnerTest {

    @ParameterizedTest(name = "resultsArray = {1}")
    @CsvSource(value = {
            "[HTML|Java, Java|Python, Python|HTML]; [0, 0, 1]; Python",
            "[HTML|Java, Java|Python, Python|HTML, C#|Python, Java|C#, C#|HTML]; [0, 1, 1, 1, 0, 1]; C#",
            "[HTML|Java, Java|Python, Python|HTML, C#|Python, Java|C#, C#|HTML, SQL|C#, HTML|SQL, SQL|Python, SQL|Java]; [0, 0, 0, 0, 0, 0, 1, 0, 1, 1]; SQL",
            "[AlgoMasters|FrontPage Freebirds, Runtime Terror|Static Startup, WeC#|Hypertext Assassins, AlgoMasters|WeC#, Static Startup|Hypertext Assassins, Runtime Terror|FrontPage Freebirds, AlgoMasters|Runtime Terror, Hypertext Assassins|FrontPage Freebirds, Static Startup|WeC#, AlgoMasters|Static Startup]; [1, 0, 0, 1, 0, 0, 1, 0, 0, 1]; AlgoMasters"
    }, delimiter = ';')
    void mustGetTournamentWinner(@BiDimensionalListConverter List<List<String>> competitions, @IntegerArrayConverter Integer[] results, String expectedWinner) {
        System.out.println("competitions = " + competitions);
        String currentBestTeam = TournamentWinner.getWinner(competitions, results);
        System.out.println("currentBestTeam = " + currentBestTeam);
        Assertions.assertEquals(expectedWinner, currentBestTeam);
    }
}
