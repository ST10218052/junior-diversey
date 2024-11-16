public abstract class Inspection implements iInspection
{
    private String location;
    private String hospitalName;
    private int YearsSinceInspection;
    private String inspectionNeeded;
    
    public Inspection()
    {
        
    }
    
    public Inspection(String loc, String hosp, int years, String in)
    {
        this.location = loc;
        this.hospitalName = hosp;
        this.YearsSinceInspection = years;
        this.inspectionNeeded = in;
    }
    
    public void setLocation(String loc)
    {
        this.location = loc;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public void setHospitalName(String hosp)
    {
        this.hospitalName = hosp;
    }
    
    public String getHospitalName()
    {
        return hospitalName;
    }
    
    public void setYearsSinceInspection(int years)
    {
        this.YearsSinceInspection = years;
    }
    
    public int getYearsSinceInspection()
    {
        return YearsSinceInspection;
    }
    
    public void setInspectionNeeded(String in)
    {
        this.inspectionNeeded = in;
    }
    
    public String getInspectionNeeded()
    {
        return inspectionNeeded;
    }
    
    public abstract void store();
    
    @Override public String toString()
    {
        return location + " " + hospitalName + " " + YearsSinceInspection + " " + inspectionNeeded;
    }
}