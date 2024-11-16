import java.util.*;
import java.io.*;

class Products implements Serializable
{
     String str;
    int a;
    String name;
    String pro;
    String warranty;
    int price;
    int level;
    String supplier;
    
    Products(String str,int a, String name, String pro, String warranty, int price, int level, String supplier)
    {
        this.str = str;
        this.a = a;
        this.name = name;
        this.pro = pro;
        this.warranty = warranty;
        this.price = price;
        this.level = level;
        this.supplier = supplier;
    }
    
    public String getStr()
    {
        return this.str;
    }
    
    public int getA()
    {
        return this.a;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPro()
    {
        return this.pro;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public int getLevel()
    {
        return this.level;
    }
    
    public String getWarranty()
    {
        return this.warranty;
    }
    
    public String getSupplier()
    {
        return supplier;
    }
    
    public String toString()
    {
        return "\nPRODUCT CODE >> " + str + a + "\nPRODUCT NAME >> " + name + "\nPRODUCT CATEGORY >> " + pro + "\nPRODUCT WARRANTY >> " + warranty + "\nPRODUCT PRICE >> R" + price + "\nPRODUCT LEVEL >> " + level + "\nPRODUCT SUPPLIER >> " + supplier;
    }
}
