import java.util.*;
import java.io.*;

public class SoftwareDevelopmentDemo 
{
    public static void main(String [] args) throws Exception
    {
        int option = -1;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        File file = new File("softwaredevelopment.txt");
        ArrayList<SoftwareDevelopment> al = new ArrayList<SoftwareDevelopment>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;
        //int size = al.size();
        /*if(file.isFile())
        {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<SoftwareDevelopment>)ois.readObject();
            ois.close();
        }*/
        
        System.out.println("BRIGTH FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        int input = s.nextInt();
        if(input == 1)
        {
            do
           {
                /*System.out.println("Enter (1) to launch menu or any other key to exit");
                input = s.nextInt();*/
        
                System.out.println("Please select one of the following menu items:");/*\n(1) Capture a new product.\n"
                               + "(2) Search for a product.\n(3) Update a product.\n(4) Delete a product.\n"
                               + "(5) Print report.\n(6) Exit Application");*/
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
                            System.out.println("**************************");
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
                            System.out.println("Gaming Console - 5");
                                
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
                            System.out.println(pro);
                                
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
                           System.out.println(warranty);
                            
                           System.out.print("Enter the price for EliteBook >> ");
                           int price = s.nextInt();
                            
                           System.out.print("Enter the stock level for EliteBook >> ");
                           int level = s.nextInt();
                            
                           al.add(new SoftwareDevelopment(str, a, name, pro, warranty, price, level));
                           /*int size = al.size();
                           System.out.println("Product " + size);*/
                        }
                        System.out.println("Product details has been saved successfully...!");
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                    
                        System.out.println("Enter (1) to launch menu or any other key to exit");
                        int b = s.nextInt();
                        if(b == 1)
                        {
                            System.out.println("Back to MENU");
                        }
                        else
                        {
                            System.exit(0);
                        }
                    break;
                    case 2:
                        if(file.isFile())
                        {
                            ois = new ObjectInputStream(new FileInputStream(file));
                            al = (ArrayList<SoftwareDevelopment>)ois.readObject();
                            ois.close();
                            boolean found = false;
                            String str = "A";
                            System.out.print("Please enter the product code to search : " );
                            System.out.print(str);
                            int a = s.nextInt();
                            //String c = str + a;
                            System.out.println("************************************");
                            li = al.listIterator();
                            while(li.hasNext())
                            {
                                SoftwareDevelopment display = (SoftwareDevelopment)li.next();
                                if(display.a == a)
                                {
                                    System.out.println(display);
                                    found = true;
                                }
                            }
                    
                            if(!found)                    
                                System.out.println("The product cannot be located");
                            System.out.println("************************************");
                        }
                        else
                        {
                            System.out.println("Invalid Product...!");
                        }
                
                        System.out.println("Enter (1) to launch menu or any other key to exit");
                        int i = s.nextInt();
                        if(i == 1)
                        {
                            System.out.println("BACK to MENU");
                            System.out.println("************************************");
                        }
                        else
                        {
                            System.exit(0);
                        }
                    break;
                    case 3:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<SoftwareDevelopment>)ois.readObject();
                        ois.close();
                    boolean found = false;
                    String str = "A";
                    System.out.print("Please enter the product code to update : " + str);
                    int a = s.nextInt();
                    System.out.println("******************************************");
                    li = al.listIterator();
                    while(li.hasNext())
                    {
                        SoftwareDevelopment display = (SoftwareDevelopment)li.next();
                        if(display.a == a)
                        {
                            System.out.println("Update the warranty?\n(y) Yes, (n) No");
                            String choice = s1.nextLine();
                            if(choice == "y")
                            {
                                System.out.println("Enter New Warranty >> ");
                                String warranty = s1.nextLine();
                            }
                            
                            System.out.println("Update the product price?\n(y) Yes, (n) No");
                            String k = s1.nextLine();
                            if(k == "y")
                            {
                                System.out.println("Enter the new price for EliteBook >> ");
                                int price = s.nextInt();
                            }
                            
                            System.out.println("Update the stock level?\n(y) Yes, (n) No");
                            String d = s1.nextLine();
                            if(d == "y")
                            {
                                System.out.print("Enter the new stock level >> ");
                                int level = s.nextInt();
                            }
                          
                            //li.set(new SoftwareDevelopment(str, a, warranty, price, level));
                            found = true;
                        }
                    }
                    
                    if(found)
                    {
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                        System.out.println("Record Updated Successfully...!");
                    }
                    else
                    {
                        System.out.println("Record Not Found...!");
                    }
                    System.out.println("**************************************");
                    }
                    else
                    {
                    System.out.println("File not Exists...!");
                    } 
                   break;
                   case 4:
                       if(file.isFile())
                       {
                           ois = new ObjectInputStream(new FileInputStream(file));
                           al = (ArrayList<SoftwareDevelopment>)ois.readObject();
                           ois.close();
                           boolean found = false;
                           String str = "A";
                           System.out.println("Enter product code to Delete : " + str);
                           int a = s.nextInt();
                           System.out.println("*************************************");
                           li = al.listIterator();
                           while(li.hasNext())
                           {
                               SoftwareDevelopment display = (SoftwareDevelopment)li.next();
                               if(display.a == a)
                               {
                                   li.remove();
                                   found = true;
                               }
                           }
                    
                           if(found)
                           {
                               oos = new ObjectOutputStream(new FileOutputStream(file));
                               oos.writeObject(al);
                               oos.close();
                               System.out.println("Record Deleted Successfully...!");
                           }
                           else
                           {
                               System.out.println("Record Not Found...!");
                           }
                           System.out.println("***********************************");
                       }
                       else
                       {
                           System.out.println("File not Exists...!");
                       }        
                   break;
                   case 5:
                       if(file.isFile())
                       {
                           ois = new ObjectInputStream(new FileInputStream(file));
                           al = (ArrayList<SoftwareDevelopment>)ois.readObject();
                           ois.close();
                           int size = al.size();
                           System.out.println("PRODUCT REPORT");
                           System.out.println("====================================");
                           //System.out.println("*************************************");
                           //System.out.println("Product " + size);
                           li = al.listIterator();
                        
                           while(li.hasNext())
                           {
                               System.out.println("-------------------------------------");
                               System.out.println("Product " + size);
                               System.out.print("-------------------------------------");
                               System.out.println(li.next());
                           }
                           System.out.println("-------------------------------------");
                    
                       }
                       else
                       {
                           System.out.println("File not Exists...!");
                       }   
                    
                       System.out.println("=================================================");
                       System.out.println("Enter (1) to launch menu or any other key to exit");
                       int e = s.nextInt();
                       if(e == 1)
                       {
                           System.out.println("BACK to MENU");
                           //System.out.println("======================================");
                       }
                       else
                       {
                           System.exit(0);
                       }
                   break;
                   case 6:
                       System.out.println("Thank You for using the Application...!");
                   break;
                       default:
                           System.out.println("");
                }
           }while(option != 6);
        }
        else
        {
            System.exit(0);
        }
    }
}
