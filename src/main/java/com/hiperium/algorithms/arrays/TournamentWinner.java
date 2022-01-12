package com.hiperium.algorithms.arrays;

import java.util.HashMap;
import java.util.List;

public final class TournamentWinner {
    private static final int HOME_TEAM_WON = 1;
    private TournamentWinner() {}

    // O(n) time | O(k) space; where 'k' is the number of teams.
    public static String getWinner(List<List<String>> competitions, Integer[] results) {
        String currentBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            List<String> competition = competitions.get(i);
            int result = results[i];
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            String winningTeam = result == HOME_TEAM_WON? homeTeam : awayTeam;

            if (!scores.containsKey(winningTeam))
                scores.put(winningTeam, 0);
            scores.put(winningTeam, scores.get(winningTeam) + 3);

            if (scores.get(winningTeam) > scores.get(currentBestTeam))
                currentBestTeam = winningTeam;
        }
        return currentBestTeam;
    }
}
