import java.util.Scanner;

interface Resume {
    void biodata();
    // TODO: Declare method void biodata();
}

class Teacher implements Resume {
    String name;
    String qual;
    int exp;
    public void setteacher(String a, String b, int c){
        name=a;
        qual=b;
        exp=c;
    }
    public void biodata(){
        System.out.println("Name: "+ name);
        System.out.println("Qualification: "+ qual);
        System.out.println("Experience: "+ exp);
    }

    // TODO: Implement biodata() method to print details in the required format
}

public class InterfaceResume {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n1= sc.next();
        String n2= sc.next();
        int n3= sc.nextInt();
        Teacher tch1=new Teacher();
        tch1.setteacher(n1, n2, n3);
        tch1.biodata();


}
        
        // TODO: Read input (Name, Qualification, Experience)
        // Assign to teacher object attributes
        
        // TODO: Call teacher.biodata()
    
}
