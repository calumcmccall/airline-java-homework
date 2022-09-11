public class Pilot extends Staff {

    private String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence) {
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public String flyPlane(Plane plane){
        return this.getName() + " is now flying a " + plane.getPlaneType();
    }

}
