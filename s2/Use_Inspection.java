public class Use_Inspection
{
    public static void main(String [] args)
    {
        Inspection in = new HospitalInspections();
        //Run the code
        in.store();
        String p = in.toString();
        System.out.println("HOSPITAL INSPECTION REPORT");
        System.out.println("************");
        System.out.println(p);
    }
}