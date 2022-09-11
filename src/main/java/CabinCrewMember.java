public class CabinCrewMember extends Staff {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String talkToPassengers(){
        return "Welcome aboard the flight";
    }

}
