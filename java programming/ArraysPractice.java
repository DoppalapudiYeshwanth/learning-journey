// import java.util.Scanner;
public class ArraysPractice {
    public static void main(String[]args){
    //  Scanner sc=new Scanner(System.in);
    // int num[]={1,2,3,4};
    // num[2]=num[0];
    // System.out.println(num[2]);
    // int arr[]=new int[5];
    // for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    // }
    // System.out.println(arr);

    // int arr1[][]=new int[3][4];

    // for(int i=0;i<arr1.length;i++){
    //     for(int j=0;j<arr1.length;j++){
        
    //     arr1[i][j]=sc.nextInt();
    //     System.out.println(arr1[i][j]);
    //     }
    // }
    // int arr3[][]=new int[2][2];
    Student s1 = new Student();
        s1.name = "yesh";
        s1.rollno = 23;

        Student s2 = new Student();
        s2.name = "mohan";
        s2.rollno = 24;

        Student s3 = new Student();
        s3.name = "jesh";
        s3.rollno = 25;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].rollno);
        }
    }
    
}

class Student {
    int rollno;
    String name;
}



