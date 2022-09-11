public enum Rank {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    FLIGHTATTENDANT("Flight Attendant");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }

}
