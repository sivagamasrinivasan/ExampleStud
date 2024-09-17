/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentlist;

/** this is new comment
 *
 * @author sivagamasrinivasan
 */
public class PrintStudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // print 3 students name,sid using array of object
        Student s1 = new Student();
        s1.setName("peter");
        s1.setId(1);
        Student s2 = new Student();
        s2.setName("john");
        s2.setId(2);
        Student s3 = new Student();
        s3.setName("james");
        s3.setId(3);
        //s1 - name , sid - not in array - save  object
        Student[] list = new Student[2]; //  array of objects
        list[0]=s1;
        list[1]=s2;
        //list[2]=s3; //saved the objects in array
        //print 
        for(int i=0;i<list.length;i++)
        {
          System.out.println(list[i].getName()+ " "+list[i].getId());  
        }
        
    }
    
}
