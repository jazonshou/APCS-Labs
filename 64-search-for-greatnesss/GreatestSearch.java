
/**
 * Write a description of class GreatestSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class GreatestSearch
{
    // Create instance variable to store teams ArrayList of Strings
    private ArrayList<String> teams;
    // Create constructor (populate it with the list of Premier League teams (2020-2021) in alphabetical order)
    // https://www.premierleague.com/clubs
    public GreatestSearch() {
        teams = new ArrayList<String> ();
        String[] t = {"Arsenal", "Aston Villa", "Brentford", "Brighton and Hove Albion", "Burnley", 
                      "Chelsea", "Crystal Palace", "Everton", "Leeds United", "Leicester City", "Liverpool", 
                      "Manchester City", "Manchester United", "Newcastle United", "Norwich City", "Southampton", 
                      "Tottenham Hotspur", "Watford", "West Ham United", "Wolverhampton Wanderers"};

        for(String team : t) {
            teams.add(team);
        }
    }
    
    // Linear Search Method (receives a team Name) and returns location.
    public int linearSearch(String team) {
        int location = -1;
        for(int i = 0; i < teams.size(); i++) {
            if(teams.get(i).equals(team)) {
                location = i;
                break;
            }
        }
        return location;
    }
    
    // Binary Search Method (receives a team Name) and returns location.
    public int binarySearch(String team) {
        int b = 0, e = teams.size()-1, m = (b + e) / 2;
        while(b <= e) {
            if(teams.get(m).equals(team)) {
                return m;
            }
            if(teams.get(m).compareTo(team) < 0) {
                b = m + 1;
            } 
            if(teams.get(m).compareTo(team) > 0) {
                e = m - 1;
            }
            m = (b + e) / 2;
        }
        return -1;
    }
    
    // toString method returns a String showing the contents of the Arraylist of teams
    public String toString() {
        return teams.toString();
    }
}
