package com.hiperium.algorithms.arrays;

import java.util.HashMap;
import java.util.List;

/**
 * There's an algorithm's tournament taking place in which teams of programmers compete against each other to solve
 * algorithmic problems as fast as possible. Teams compete in a round-robin, where each team faces off against all other
 * teams. Only two teams compete against each other at a time, and for each competition, one team is designated the home
 * team, while the other team is the away team. In each competition there's always one winner and one loser; there are
 * no ties. A team receives 3 points if it wins and 0 points if it loses. The winner of the tournament is the team that
 * receives the most amount of points.
 *
 * Given an array of pairs representing the teams that have competed against each other and an array containing the
 * results of each competition, write a function that returns the winner of the tournament. The input arrays are named
 * "competitions" and "results", respectively. The "competitions" array has elements in the form of <span>[homeTeam,
 * awayTeam]</span>, where each team is a string of at most 30 characters representing the name of the team. The
 * "results" array contains information about the winner of each corresponding competition in the "competitions" array.
 * Specifically, "results[i]" denotes the winner of "competitions[i]", where a <span>1</span> in the "results" array
 * means that the home team in the corresponding competition won and a <span>0</span> means that the away team won.
 *
 * It's guaranteed that exactly one team will win the tournament and that each team will compete against all other teams
 * exactly once. It's also guaranteed that the tournament will always have at least two teams.
 *
 */
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
