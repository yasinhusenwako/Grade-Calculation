/*
 This is java Program that accept marks of student and their credit hour
 from user and calculate each subject grade,GPT andPGA
 */
import java.util.Scanner;

public class StudentGrade {
    static String Name,Department ,sex;
    static int ID,Year,Semister;

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            student();
            double GPT1 = 0.00;
            double GPT2 = 0.00;
            double GPT3 = 0.00;
            double GPT4 = 0.00;
            double GPT = 0.00;
            double TotalCredithr = 0.00;
            char Grade1 = ' ';
            char Grade2 = ' ';
            char Grade3 = ' ';
            char Grade4 = ' ';
            double GradeValue1 = 0;
            double GradeValue2 = 0;
            double GradeValue3 = 0;
            double GradeValue4 = 0;

            String subject[] = {"java","Networking","Stracture","Statics","COA","OS"};
            Scanner input = new Scanner(System.in);
            System.out.print("Eneter Valid mark of "+subject[0]+" :");
            int mark1 = input.nextInt();
            System.out.print("Enter Credit Hour of "+subject[0]+" :");
            int creditHuor1 = input.nextInt();

            if (mark1 >= 80 && mark1 <= 100) {
                Grade1 = 'A';
                if (Grade1 == 'A')
                    GradeValue1 = 4;
            } else if (mark1 >= 70 && mark1 < 80) {
                Grade1 = 'B';
                if (Grade1 == 'B')
                    GradeValue1 = 3;
            } else if (mark1 >= 60 && mark1 < 70) {
                Grade1 = 'C';
                if (Grade1 == 'C')
                    GradeValue1 = 2;
            } else if (mark1 >= 50 && mark1 < 60) {
                Grade1 = 'D';
                if (Grade1 == 'D')
                    GradeValue1 = 1;
            } else if (mark1 < 50 && mark1 >=0) {
                Grade1 = 'F';
                if (Grade1 == 'F')
                    GradeValue1 = 0;
            } else {
                System.out.println("Invalid mark ");
            }
            GPT1 = creditHuor1 * GradeValue1;

            System.out.print("Eneter Valid mark  of "+subject[1]+" :");
            int mark2 = input.nextInt();

            System.out.print("Enter Credit Hour of "+subject[1]+" :");
            int creditHuor2 = input.nextInt();

            if (mark2 >= 80 && mark2 <= 100) {
                Grade2 = 'A';
                if (Grade2 == 'A')
                    GradeValue2 = 4;
            } else if (mark2 >= 70 && mark2 < 80) {
                Grade2 = 'B';
                if (Grade2 == 'B')
                    GradeValue2 = 3;
            } else if (mark2 >= 60 && mark2 < 70) {
                Grade2 = 'C';
                if (Grade2 == 'C')
                    GradeValue2 = 2;
            } else if (mark2 >= 50 && mark2 < 60) {
                Grade2 = 'D';
                if (Grade2 == 'D')
                    GradeValue2 = 1;
            } else if (mark2 < 50 && mark2 >=0) {
                Grade2 = 'F';
                if (Grade2 == 'F')
                    GradeValue2 = 0;
            } else {
                System.out.println("Invalid mark ");
            }
            GPT2 = creditHuor2 * GradeValue2;

            System.out.print("Eneter Valid mark  of "+subject[2]+" :");
            int mark3 = input.nextInt();

            System.out.print("Enter Credit Hour of "+subject[2]+" :");
            int creditHuor3 = input.nextInt();

            if (mark3 >= 80 && mark3 <= 100) {
                Grade3 = 'A';
                if (Grade3 == 'A')
                    GradeValue3 = 4;
            } else if (mark3 >= 70 && mark2 < 80) {
                Grade3 = 'B';
                if (Grade3 == 'B')
                    GradeValue3 = 3;
            } else if (mark3 >= 60 && mark2 < 70) {
                Grade3 = 'C';
                if (Grade3 == 'C')
                    GradeValue3 = 2;
            } else if (mark3 >= 50 && mark2 < 60) {
                Grade3 = 'D';
                if (Grade3 == 'D')
                    GradeValue3 = 1;
            } else if (mark3 < 50&& mark3 >=0) {
                Grade3 = 'F';
                if (Grade3 == 'F')
                    GradeValue3 = 0;
            } else {
                System.out.println("Invalid mark ");
            }
            GPT3 = creditHuor3 * GradeValue3;

            System.out.print("Eneter Valid mark  of "+subject[3]+" :");
            int mark4 = input.nextInt();

            System.out.print("Enter Credit Hour of "+subject[3]+" :");
            int creditHuor4 = input.nextInt();

            if (mark4 >= 80 && mark2 <= 100) {
                Grade4 = 'A';
                if (Grade4 == 'A')
                    GradeValue4 = 4;
            } else if (mark4 >= 70 && mark2 < 80) {
                Grade4 = 'B';
                if (Grade4 == 'B')
                    GradeValue4 = 3;
            } else if (mark4 >= 60 && mark2 < 70) {
                Grade4 = 'C';
                if (Grade4 == 'C')
                    GradeValue4 = 2;
            } else if (mark4 >= 50 && mark2 < 60) {
                Grade4 = 'D';
                if (Grade4 == 'D')
                    GradeValue4 = 1;
            } else if (mark4 < 50 && mark4 >=0) {
                Grade4 = 'F';
                if (Grade4 == 'F')
                    GradeValue4 = 0;
            } else {
                System.out.println("Invalid mark ");
            }
            GPT4 = creditHuor4 * GradeValue4;

            GPT = GPT1 + GPT2 + GPT3 + GPT4;
            TotalCredithr = creditHuor1 + creditHuor2 + creditHuor2 + creditHuor2;

            float GPA = (float) (GPT / TotalCredithr);

            System.out.println("_____________________________________________________________________________");
            System.out.println("Name                       :" + Name+"                                       ");
            System.out.println("ID                         :" + ID+"                                         ");
            System.out.println("Sex                        :" + sex+"                                        ");
            System.out.println("Department                 :" + Department+"                                 ");
            System.out.println("Year                       :" + Year + "/" + Semister+"                      ");
            System.out.println("_____________________________________________________________________________");
            System.out.println("Course                    CreditHuor              Grade              GPT"+" ");
            System.out.println("____________________________________________________________________________");
            System.out.println(subject[0]+"                        " +creditHuor1 + "                    " + Grade1 + "                 " + GPT1+"  ");
            System.out.println(subject[1]+"                  " + creditHuor2 + "                    " + Grade2 + "                 " + GPT2+"       ");
            System.out.println(subject[2]+"                   " + creditHuor3 + "                    " + Grade3 + "                 " + GPT3+"      ");
            System.out.println(subject[3]+"                     " + creditHuor4 + "                    " + Grade4 + "                 " + GPT4+"    ");
            System.out.println("_____________________________________________________________________________");
            System.out.println("GPA           :" + GPA+"                                                     ");
            System.out.println("_____________________________________________________________________________");
            System.out.println();


        }
        i++;
    }
    public static void student(){
        Scanner n = new Scanner(System.in);

        StudentGrade student1 = new StudentGrade();

        System.out.print("Enter Student Name :");
        student1.Name = n.nextLine();

        System.out.print("Enter Studet ID :");
        student1.ID = n.nextInt();

        System.out.print("sex :");
        student1.sex = n.next();

        System.out.print("Enter Department :");
        student1.Department = n.next();

        System.out.print("Enter year :");
        student1.Year = n.nextInt();

        System.out.print("semister :");
        student1.Semister = n.nextInt();
    }

}

