import java.io.Serializable;

public class ReportData implements Serializable 
{
     String code;
    String Name ;
    String Warranty;
     String Category ;
     int  price;
     int  StrockLevels ;
     String supplier;
    public ReportData( String code,String Name,String Warranty,String Category,int price,int StrockLevels,String supplier   )
    {
        this .code = code;
        this . Name = Name;
        this. Warranty  = Warranty ;
        this .Category= Category;
        this. price = price;
        this. StrockLevels =StrockLevels;
        this .supplier= supplier;
        
    }
    public void setPrice(int price )
    {
        this .price = price ;
    }
    public int getPrice()
    {
        return price;
    }
    
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    
    public String getSupplier()
    {
        return supplier;
    }
    public void setSupplier()
    {
        this.supplier=supplier;
    }
    
    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code=code;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String toString(){
        return "\nPRODUCT CODE >> " +code+"\nPRODUCT NAME >>"+Name +"\nPRODUCT CATEGORY >> "+Category+ "\nPRODUCT WARRANTY >> "+Warranty+"\nPRODUCT PRICE >> "+price+"\nPRODUCT LEVEL >> " +StrockLevels+"\nSUPPLIER>>"+supplier; 
    }
}