import java.util.*;
public class HospitalInspections extends Inspection
{
    String location;
    String hospitalName;
    int YearsSinceInspection;
    String inspectionNeeded;
    public void store()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hospital location: ");
        location = scan.nextLine();
        
        System.out.print("Enter the hospital name: ");
        hospitalName = scan.nextLine();
        
        System.out.print("Enter years since last inspection: ");
        YearsSinceInspection = scan.nextInt();
        System.out.println();
        if(YearsSinceInspection < 3)
        {
            inspectionNeeded = "NO";
        }
        else
        {
            inspectionNeeded = "YES";
        }
    }
    
    @Override public String toString()
    {
        return "HOSPTITAL LOCATION: " + location + "\nHOSPITAL NAME: " + hospitalName + "\nYEARS SINCE INSPECTION: " + YearsSinceInspection + "\nINSPECTION NEEDED: " + inspectionNeeded;
    }
}