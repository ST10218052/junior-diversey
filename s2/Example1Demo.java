import java.util.*;
import java.io.*; 

public class Example1Demo
{
    public static void main(String [] args) throws Exception
    {
        int choice = -1;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        File file = new File("example1.txt");
        ArrayList<Example1> al = new ArrayList<Example1>();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;
        
        if(file.isFile())
        {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Example1>)ois.readObject();
            ois.close();
        }
        
        do
        {
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.println("6. Sort By Employee Number - On Screen");
            System.out.println("7. Sort By Employee Number - In File");
            System.out.println("8. Sort By Employee Name - On Screen");
            System.out.println("9. Sort By Employee Name - In File");
            System.out.println("10. Sort By Salary - Desc - On Screen");
            System.out.println("11. Sort By Salary - Asc - In File");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice = s.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter how many employees you want : ");
                    int n = s.nextInt();
                    for(int i = 0; i < n; i++)
                    {
                        System.out.println("Enter Employee Number : ");
                        int empno = s.nextInt();
                        
                        System.out.println("Enter Employee Name : ");
                        String ename = s1.nextLine();
                        
                        System.out.println("Enter Employee Salary : ");
                        int salary = s.nextInt();
                        
                        al.add(new Example1(empno, ename, salary));
                    }
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(al);
                    oos.close();
                break;
                case 2:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
                case 3:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                    boolean found = false;
                    System.out.println("Enter Employee Number to Search : ");
                    int empno = s.nextInt();
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                    {
                        Example1 e = (Example1)li.next();
                        if(e.empno == empno)
                        {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    
                    if(!found)
                    
                        System.out.println("Record Not Found...!");
                    System.out.println("-------------------------------------");
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
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                    boolean found = false;
                    System.out.println("Enter Employee Number to Delete : ");
                    int empno = s.nextInt();
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                    {
                        Example1 e = (Example1)li.next();
                        if(e.empno == empno)
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
                    System.out.println("-------------------------------------");
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
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                    boolean found = false;
                    System.out.println("Enter Employee Number to Update : ");
                    int empno = s.nextInt();
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                    {
                        Example1 e = (Example1)li.next();
                        if(e.empno == empno)
                        {
                            System.out.println("Enter New Employee Name : ");
                            String ename = s1.nextLine();
                            
                            System.out.println("Enter New Salary : ");
                            int sal = s.nextInt();
                            li.set(new Example1(empno, ename, sal));
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
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break; 
                case 6:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                        
                        Collections.sort(al, new Comparator<Example1>()
                        {
                            public int compare(Example1 e1, Example1 e2)
                            {
                                return e1.empno - e2.empno;
                            }
                        });
                        
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
                case 7:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                        
                        Collections.sort(al, new Comparator<Example1>()
                        {
                            public int compare(Example1 e1, Example1 e2)
                            {
                                return e1.empno - e2.empno;
                            }
                        }); 
                        
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                        
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
                case 8:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                        
                        Collections.sort(al, new Comparator<Example1>()
                        {
                            public int compare(Example1 e1, Example1 e2)
                            {
                                return e1.ename.compareTo(e2.ename);
                            }
                        });
                        
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
                case 9:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                        
                        Collections.sort(al, new Comparator<Example1>()
                        {
                            public int compare(Example1 e1, Example1 e2)
                            {
                                return e1.ename.compareTo(e2.ename);
                            }
                        }); 
                        
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                        
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
                case 10:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                        
                        Collections.sort(al, new Comparator<Example1>()
                        {
                            public int compare(Example1 e1, Example1 e2)
                            {
                                return e2.salary - e1.salary;
                            }
                        });
                        
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
                case 11:
                    if(file.isFile())
                    {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Example1>)ois.readObject();
                        ois.close();
                        
                        Collections.sort(al, new Comparator<Example1>()
                        {
                            public int compare(Example1 e1, Example1 e2)
                            {
                                return e1.salary - e2.salary;
                            }
                        }); 
                        
                        oos = new ObjectOutputStream(new FileOutputStream(file));
                        oos.writeObject(al);
                        oos.close();
                        
                    System.out.println("-------------------------------------");
                    li = al.listIterator();
                    while(li.hasNext())
                        System.out.println(li.next());
                    System.out.println("-------------------------------------");
                }
                else
                {
                    System.out.println("File not Exists...!");
                }
                break;
              }
        }while(choice != 0);
    }
}