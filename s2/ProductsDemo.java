import java.util.*;
import java.io.*;
public class ProductsDemo
{
    public static void main(String [] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        List<Products> al = new ArrayList<Products>();
        
        System.out.println("BRIGTH FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        int input = s.nextInt();
        int option = -1;
        
        if(input == 1)
        {
            do
            {
                System.out.println("Please select one of the following menu items:");
                System.out.println("(1) Capture a new product.");
                System.out.println("(2) Search for a product.");
                System.out.println("(3) Update a product.");
                System.out.println("(4) Delete a product.");
                System.out.println("(5) Print report.");
                System.out.println("(6) Exit Application");
                option = s.nextInt();
                switch(option)
                {
                    case 1:
                        System.out.println("Enter how many employees you want : ");
                        int n = s.nextInt();
                        for(int i = 0; i < n; i++)
                        {
                            System.out.println("CAPTURE A NEW PRODUCT");
                            System.out.println("**********");
                            int a;
                            String str = "A";
                            System.out.print("Enter the product code : " + str);
                            a = s.nextInt();
                                
                            System.out.print("Enter the product name : ");
                            String name = s1.nextLine();
                                
                            System.out.println("Select the product category : ");
                            System.out.println("Desktop Computer - 1");
                            System.out.println("Laptop - 2");
                            System.out.println("Tablet - 3");
                            System.out.println("Printer - 4");
                            System.out.println("Gaming Console - 5\n");
                            
                            String pro = null;
                            int product;
                        
                            do
                           {
                               System.out.print("Product Category >> ");
                               product = s.nextInt();
                                
                               if(product == 1)
                               {
                                   pro = "Desktop Computer";
                               }
                        
                               if(product == 2)
                               {
                                   pro = "Laptop";
                               }
                        
                               if(product == 3)
                               {
                                   pro = "Tablet";
                               }
                        
                               if(product == 4)
                               {
                                  pro = "Printer";
                               }
                        
                               if(product == 5)
                               {
                                  pro = "Gaming Console";
                               }
                           }while(product >= 6);
                           
                           String warranty = null;
                           System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years.");
                           int choice = s.nextInt();
                        
                           if(choice == 1)
                           {
                               warranty = "6 months";
                           }
                           else
                           {
                               warranty = "2 years";
                           }
                            
                           System.out.print("Enter the price for EliteBook >> ");
                           int price = s.nextInt();
                            
                           System.out.print("Enter the stock level for EliteBook >> ");
                           int level = s.nextInt();
                           
                           System.out.print("Enter the supplier for EliteBook >> ");
                           String supplier = s1.nextLine();
                            
                           al.add(new Products(str, a, name, pro, warranty, price, level, supplier));
                        }
                        System.out.println("Product details has been saved successfully!!!");
                        returnMessage();
                        break;
                        case 2:
                            boolean found = false;
                            String str = "A";
                            System.out.print("Please enter the product code to search : " );
                            System.out.print(str);
                            int a = s.nextInt();
                            System.out.println("*****************");
                            System.out.println("PRODUCT SEARCH RESULTS");
                            Iterator i = al.iterator();
                            while(i.hasNext())
                            {
                                Products d = (Products)i.next();
                                if(d.getA() == a)
                                {
                                    System.out.print("*****************");
                                    System.out.println(d);
                                    found = true;
                                }
                            }
                            
                            if(!found) 
                            {
                                System.out.println("The product cannot be located. Invalid Product");
                            }
                            System.out.println("*****************");
                            returnMessage();
                        break;
                        case 3:
                            found = false;
                            str = "A";
                            System.out.print("Please enter the product code to update : " + str);
                            a = s.nextInt();
                            System.out.println("*****************");
                            ListIterator<Products>li = al.listIterator();
                            for(int l = 0;l < al.size(); l++)
                            {
                                Products d = (Products)li.next();
                                if(d.getA() == a)
                                {
                                     System.out.println("Update the warranty?\n(1) Yes, (2) No");
                                     int choice = s.nextInt();
                                     String warranty;
                                     if(choice == 1)
                                     {
                                         System.out.println( "Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years.");
                                         int t = s.nextInt() ;
                                         if (t == 1) 
                                         {
                                             al.get(l).warranty =" 6 months" ; 
                                         }
                                         else 
                                         {
                                             al.get(l).warranty= " 2 years " ;
                                         }
                                     }
                                     int price;
                                     System.out.println("Update the product price?\n(1) Yes, (2) No");
                                     int k = s.nextInt();
                                     if(k == 1)
                                     {
                                         System.out.println("Enter the new price for EliteBook >> ");
                                         price = s.nextInt();
                                         al.get(l).price = price;
                                     }
                                     System.out.println("Update the stock level?\n(1) Yes, (2) No");
                                     int p = s.nextInt();
                                     if(p == 1 )
                                     {
                                        System.out.print("Enter the new stock level >> ");
                                        int level = s.nextInt();
                                        al.get(l).level = level;
                                     }
                                     found = true;
                                }
                            }
                            
                            if(!found) 
                            {
                                System.out.println("The product not found");
                            }
                            else
                            {
                                System.out.println("*****************");
                                System.out.println("The product was updated successfully");
                            }
                            System.out.println("*****************");
                            returnMessage();
                        break;
                        case 4:
                            found = false;
                            str = "A";
                            System.out.println("Enter product code to Delete : " + str);
                            System.out.print(str);
                            a = s.nextInt();
                            System.out.println("*****************");
                            i = al.iterator();
                            while(i.hasNext())
                            {
                                Products d = (Products)i.next();
                                if(d.getA() == a)
                                {
                                    i.remove();
                                    found = true;
                                }
                            }
                            
                            if(!found) 
                            {
                                System.out.println("The product not found");
                            }
                            else
                            {
                                System.out.println("The product is deleled successfully");
                            }
                            System.out.println("*****************");
                            returnMessage();
                        break;
                        case 5:
                            int size = al.size();
                            int sum = 0;
                            System.out.println("PRODUCT REPORT");
                            System.out.println("=================================================");
                            i = al.iterator();
                            for(int count = 1; count <= size;count++)
                            {
                                Products d = (Products)i.next();
                                System.out.println("-------------------------------------------------");    
                                System.out.println("PRODUCT " + count);
                                System.out.print("-------------------------------------------------");
                                System.out.println(d);
                            }
                            for(int l = 0; l < size; l++)
                            {
                                sum += al.get(l).price;
                            }
                            int avarage = sum/size;
                            System.out.println("-------------------------------------------------");
                            System.out.println("=================================================");
                            System.out.println("TOTAL PRODUCT COUNT: " + size);
                            System.out.println("TOTAL PRODUCT VALUE: R " + sum);
                            System.out.println("AVARAGE TOTAL VALUE: R " + avarage);
                            System.out.println("=================================================");
                            returnMessage();
                        break;
                }
            }while(option != 6);
        }
        else
        {
            System.exit(0);
        }
    }
    
    public static void returnMessage()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter (1) to launch menu or any other key to exit");
        int i = s.nextInt();
        if(i == 1)
        {
            System.out.println("BACK to MENU");
            System.out.println("************");
        }
        else
        {
            System.exit(0);
        }
    }
}