import java.io.*;

class Example1 implements Serializable 
{
    int empno;
    String ename;
    int salary;
    
    Example1(int empno, String ename, int salary)
    {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    
    public String toString()
    {
        return empno + " " + ename + " " + salary;
    }
}