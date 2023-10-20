package model;

public class Request {
    protected String idHelpSeeker;
    protected String idVolunteer;
    protected String Date;
    protected String Location;
    protected String Status;

    public Request(String idHelpSeeker, String idVolunteer, String Date, String Location, String Status) {
        this.idHelpSeeker = idHelpSeeker;
        this.idVolunteer = idVolunteer;
        this.Date = Date;
        this.Location = Location;
    }

    public String getIdHelpSeeker() {
        return idHelpSeeker;
    }

    public String getIdVolunteer() {
        return idVolunteer;
    }

    public String getDate() {
        return Date;
    }

    public String getLocation() {
        return Location;
    }

}