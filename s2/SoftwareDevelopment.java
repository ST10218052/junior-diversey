import java.io.*;

class SoftwareDevelopment implements Serializable
{
    String str;
    int a;
    String name;
    String pro;
    String warranty;
    int price;
    int level;
    
    SoftwareDevelopment(String str,int a, String name, String pro, String warranty, int price, int level)
    {
        this.str = str;
        this.a = a;
        this.name = name;
        this.pro = pro;
        this.warranty = warranty;
        this.price = price;
        this.level = level;
    }
     
    public void setName(String name )
    {
        name= name ;
    }
    public String getName( )
    {
        return  name ;
    }
    
    public void setStr(String str )
    {
        str= str ;
    }
    public String getStr( )
    {
        return  str;
    }
    
    public void setWarranty(String warranty )
    {
        warranty= warranty ;
    }
    public String getWarranty( )
    {
        return  warranty ;
    }
    
    public void seta(int a )
    {
        a= a ;
    }
    public int geta( )
    {
        return  a ;
    }
    
     public void setPrice(int price )
    {
        price=price ;
    }
    public int getPrice( )
    {
        return  price ;
    }
    
    public void setlevel(int level )
    {
        level= level;
    }
    public int getlevel( )
    {
        return  level ;
    }
    
    public void setPro(String pro  )
    {
        pro= pro;
    }
    public String getPro( )
    {
        return  pro ;               
    }
    
    public String toString(){
        return "\nPRODUCT CODE >> " + str + a + "\nPRODUCT NAME >> " + name + "\nPRODUCT CATEGORY >> " + pro + "\nPRODUCT WARRANTY >> " + warranty + "\nPRODUCT PRICE >> " + price + "\nPRODUCT LEVEL >> " + level;
    }
}
