public class Team
{
    private String teamName;
    private Athlete[] players;
    
    public Team (String nm, int size) {
        this.teamName = nm;
        this.players = new Athlete[size];
    }
    
    public void addAthlete(int index, Athlete a) {
        players[index] = a;
    }
    
    public String toString() {
        String output = "The members of this team are: \n";
        for(Athlete a : players) {
            output += a;
        }
        return output;
    }
}
