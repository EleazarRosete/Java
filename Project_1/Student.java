public class Student {

    private String firstname, lastname, course, section, year, gender;
    private int midtermGrade, finalGrade;

    Student(String firstname, String lastname,String gender,String year, String course, String section,
            int midtermGrade, int finalGrade){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }
    void introduceSelf(){
        if ("male".equals(gender) || "Male".equals(gender) || "MALE".equals(gender)){
            gender = "he";
        }
        else {
            gender = "she";
        }
        System.out.println();
        System.out.println("The student's full name is " + firstname + " " + lastname +
                " , " + gender + " is currently in " + year + " yr and enrolled in " + course +
                " in block/section " + section + ".");
    }
    void evaluateGrade(){
        int avgGrade = (midtermGrade + finalGrade)/2;
        System.out.println(firstname + "'s average grade is " + avgGrade + "%.");
        if(avgGrade > 100)      System.out.println("Remarks: Invalid Grade");
        else if(avgGrade >= 98) System.out.println("Remarks: with Highest Honors \nCongratulations!!");
        else if(avgGrade >= 95) System.out.println("Remarks: with High Honors \nCongratulations!!");
        else if(avgGrade >= 90) System.out.println("Remarks: with Honors \nCongratulations!!");
        else if(avgGrade >= 75) System.out.println("Remarks: Passed \nCongratulations!!");
        else System.out.println("Remarks: Failed \nBetter luck next time");
    }
}
