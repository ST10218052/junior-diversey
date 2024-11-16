import java .util .*;
import java .util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class Assignment 
{
    public static void main(String [] args)
    {
        int menu = -1;
        Scanner sc = new Scanner (System.in);
         Scanner c2 = new Scanner (System.in);
         //ObjectOutputStream oos = null;
       //ObjectInputStream ois = null;
       
        System.out.println(" BRIGHT FUTURE TECHNOLOGIES APPLICATION " );
        System.out.println(" ***************************************" );
        System.out.println("Enter (1) to launch menu or any othyer key to exit   " );
         //Integer.parseInt(JOptionPane.showInputDialog("Enter (1) to launch menu or any other key to exit"));;
        //menu =sc. nextInt() ;System.out.println(" done" );
         menu =sc. nextInt() ;
        //ArrayList<junior >F1 = new ArrayList<junior >();
        ArrayList<ReportData>al=new ArrayList<ReportData>();
        int salary;
        ListIterator it = null;
       //Iterator it=ReportData.Iterator();
      //ListIterator li = null;
         int empno;
         int n;
        if (menu == 1)
        {
          
        
            
            //menu =sc. nextInt() ;
            System.out.println(" done" );
            int choice =0;
           
            do 
           {
            //System.out.println("(1) Capture a new product.");
              //  System.out.println("(2) Search for a product.");
              //  System.out.println("(3) Update a product.");
              //  System.out.println("(4) Delete a product.");
               // System.out.println("(5) Print report.");
               // System.out.println("(6) Exit Application");
            choice =Integer.parseInt(JOptionPane.showInputDialog("(1) Capture a new product.\n(2) Search for a product.\n(3) Update a product.\n(4) Delete a product.\n(5) Print report.\n(6) Exit Application")) ;
            switch(choice)
            {
               case 1://1. Insert
                    //insect(salary,Name);
                     //System.out.println("Enter how many Products  you want to enter : ");
                         n = Integer.parseInt(JOptionPane.showInputDialog("Enter how many Products  you want to enter " ));
                        for(int i =0;i<n;i++)
                        {
                            System.out.println("CAPTURE A NEW PRODUCT");
                            System.out.println("**************************");
                           
                            
                            
                             String Name =JOptionPane.showInputDialog(" Enter the product Name " );
                            //System.out.println(Name );
                            String code =JOptionPane.showInputDialog(" Enter the product code");;
                           
                            
                            //System.out.println(" select product cartegory " );
                             String Category = null;;
                             Boolean  N= true  ;;
                             String T = null;
                             int Q ;
                             while (N ){
                            do
                            {
                                //System.out.println("1: Desktop computer" );
                                //System.out.println("2: Laptop" );
                                //System.out.println("3: Tablet" );
                                //System.out.println("4: Printer" );
                                //System.out.println("5: Gaming console" );
                                int c =Integer.parseInt(JOptionPane.showInputDialog("select product cartegory\n1: Desktop computer\n2: Laptop\n3: Tablet\n4: Printer\n5: Gaming console " )); ;
                                switch (c)
                                {
                                    case 1 : Category= " Desktop computer";
                                    break;
                                    case 2 : Category= " Laptop";
                                    break;
                                    case 3 : Category= " Tablet";
                                    break;
                                    case 4 : Category= " Printer";
                                    break;
                                    case 5 : Category= " Gaming console";
                                    break;
                                } 
                                //System.out.println( Category );
                                //N = c2.nextLine();
                                
                            }while (T ==" " );
                            //System.out.println(" Did you choose the right  cartegory enter 1 if  yes or any nomber if its no " );
                                Q= Integer.parseInt(JOptionPane.showInputDialog(" Did you choose the right  cartegory enter 1 if  yes or any nomber if its no "));
                                
                                if (Q== 1 )
                                {
                                    N = false;
                                    break;
                                }
                                
                           }
                           
                           String Warranty;
                           //System.out.println("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years.");
                           int t=Integer.parseInt(JOptionPane.showInputDialog("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years.")) ;
                           if (t==1) 
                           {
                               Warranty =" 6 months" ; 
                           }
                           else 
                           {
                                Warranty= " 2 years " ;
                           }
                           
                           
                            
                            
                            //System.out.println(" please enter product price" );
                           int price = Integer.parseInt(JOptionPane.showInputDialog(" please enter product price" ));
                           
                           //System.out.println(" Please enter product StrockLevels" );
                           int StrockLevels= Integer.parseInt(JOptionPane.showInputDialog(" Please enter product StrockLevels" ));
                           
                           //System.out.println(" Please enter product Supplyer" );
                            String supplier =JOptionPane.showInputDialog(" Please enter product Supplyer");
                           
                           al.add(new ReportData(code,Name,Warranty,Category,price,StrockLevels,supplier));
                        }
                        // System.out.println("Product details has been saved successfully...!");
                        JOptionPane.showMessageDialog(null,"Product details has been saved successfully...!"); 
                        // System.out.println("Enter (1) to launch menu or any other key to exit");
                        int z =  Integer.parseInt(JOptionPane.showInputDialog("Enter (1) to launch menu or any other key to exit"));
                        if(z == 1)
                        {
                            System.out.println("Back to MENU");
                        }
                        else
                        {
                            System.exit(0);
                        }
                        
                        break;
                    case 2://Display
                         
                      // System.out.print("Please enter the product code to search : " );
                        String Acode = JOptionPane.showInputDialog("Please enter the product code to search : ");
                        //al = ArrayList<ReportData>readObject();
                       it= al.listIterator();
                      // public String next()
                       // ReportData display =(ReportData)al.next();
                       boolean found = false;
                       
                        //System.out.println(ReportData);
                        while (it.hasNext())
                        {
                            ReportData display =(ReportData)it.next();
                            if (display.code.equals(Acode) ) 
                            {
                                JOptionPane.showMessageDialog(null,(display));
                                    found = true; 
                                    
                            }
                            
                        }
                        if(!found)                    
                                JOptionPane.showMessageDialog(null,"The product cannot be located");
                           // System.out.println("************************************");
                          //   System.out.println("Enter (1) to launch menu or any other key to exit");
                        int Z =  Integer.parseInt(JOptionPane.showInputDialog("Enter (1) to launch menu or any other key to exit"));;
                        if(Z == 1)
                        {
                            System.out.println("Back to MENU");
                        }
                        else
                        {
                            System.exit(0);
                        }
                        break;
                   case 3://update
                        // System.out.print("Please enter the product code to update : " );
                    String a = JOptionPane.showInputDialog("Please enter the product code to update : " );
                    it= al.listIterator();
                      //while(it.hasNext())
                      for(int i=0;i<al.size();i++)
                    {
                        
                        ReportData display = (ReportData)it.next();
                        if(al.get(i).getCode().contains(a) &&display.code.equals(a)  )
                        {
                           // System.out.println("Update the warranty?\n(1) Yes, (2) No");
                            
                           int choice2 = Integer.parseInt(JOptionPane.showInputDialog("Update the warranty?\n(1) Yes, (2) No"));
                            String Warranty2 ;
                            
                            if(choice2==1)
                            {
                              // System.out.println( "Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years.");
                               int t=Integer.parseInt(JOptionPane.showInputDialog("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 y")) ;
                              if (t==1) 
                                {
                               al.get(i).Warranty =" 6 months" ; 
                                }
                                else 
                              {
                                al.get(i).Warranty= " 2 years " ;
                             }
                                // al.get(i).Warranty="2" ; 
                                //it.set(Warranty);
                            }
                            int price1;
                            //System.out.println("Update the product price?\n(1) Yes, (2) No");
                            int k = Integer.parseInt(JOptionPane.showInputDialog("Update the product price?\n(1) Yes, (2) No"));
                            if(k==1)
                            {
                                System.out.println("Enter the new price for EliteBook >> ");
                                 price1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the new price for EliteBook >> "));
                                //it.set(price);
                                al.get(i).price = price1;
                            }
                            
                            //System.out.println("Update the stock level?\n(1) Yes, (2) No");
                            int l = Integer.parseInt(JOptionPane.showInputDialog("Update the stock level?\n(1) Yes, (2) No"));
                             
                            
                            if(l==1 )
                            {
                                //System.out.print("Enter the new stock level >> ");
                                 int StrockLevels1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the new stock level >> "));
                                al.get(i). StrockLevels=StrockLevels1 ;
                            }
                             
                            found = true;
                        }
                        
                    }
                    break ;
                    case 4://delete
                        boolean found1 = false;
                          // String str = "A";
                           //System.out.println("Enter product code to Delete : " );
                           String Bcode = JOptionPane.showInputDialog("Enter product code to Delete : " );
                          // System.out.println("*************************************");
                           it = al.listIterator();
                           while (it.hasNext())
                        {
                            ReportData display =(ReportData)it.next();
                            if (display.code.equals(Bcode) ) 
                            {
                                //System.out.println(display);
                                    found1 = true; 
                                    it.remove();
                            }
                            
                        }
                          
                           if(found1)
                           {
                               
                               //System.out.println("Record Deleted Successfully...!");
                               JOptionPane.showMessageDialog(null,"Record Deleted Successfully...!");
                           }
                           else
                           {
                               //System.out.println("Record Not Found...!");
                               JOptionPane.showMessageDialog(null,"Record Not Found...!");
                           }
                           System.out.println("***********************************");
                           break;
                   case 5://update
                             int size = al.size();
                           System.out.println("PRODUCT REPORT");
                           System.out.println("====================================");
                           //System.out.println("*************************************");
                           //System.out.println("Product " + size);
                           it = al.listIterator();
                        // while(it.hasNext()){
                            int sum=0;
                            int size1= 1 ;
                           for (int o=0;o<size;o++)
                           {
                               // while(it.hasNext()){
                               //int size1= 1 ;
                               System.out.println("-------------------------------------");
                               System.out.println("Product " + size1);
                               System.out.print("-------------------------------------");
                               System.out.println(it.next());
                                size1=size1+1;
                           }
                           for(int i = 0;i<size;i++)
                           {
                               sum+=al.get(i).price;
                               
                           }
                           System.out.println("-------------------------------------");
                           System.out.println("=====================================");
                           int average = sum/size;
                           System.out.println("TOTAL PRODUCT COUNT : "+ size);
                           System.out.println("TOTAL PRODUCT VALUE : "+ sum);
                            System.out.println("AVERAGE PRODUCT VALUE  : "+ average);
                        break;
                   case 6:   
                       System.out.println("Thank You for using the Application...!");
                   
                       default:
                           System.out.println("");
                          System. exit(0);
                    break;
            }
           }while(menu ==1) ;
            
        
      }
    }
    /*
     * 
     *
   
    public static String insect (int salary,String Name)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many employees you want : ");
                    int n = sc.nextInt();
                    for(int i = 0; i < n; i++)
                    {
                        System.out.println("Enter Employee Number : ");
                        // empno = sc.nextInt();
                        
                        System.out.println("Enter Employee Name : ");
                        ename = sc.nextLine();
                        
                        System.out.println("Enter Employee Salary : ");
                      salary = sc.nextInt();
                        
                        F .add(new junior( Name, salary));
                    }
                    return F1.add(new Junior( Name, salary));
    }*/
}