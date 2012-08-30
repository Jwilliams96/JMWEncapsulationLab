package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the four other best practices as explained by your
 * instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;

    public Employee() {
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if (metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    /*
     * I did not remove the extra status checks because i feel that if there 
     * were to be extra criteria or requirements to be met in each step, then 
     * need to have them in there: metWithHr, metDeptStaff, & 
     * reviewedDeptPolicies are the ones that i did that with, and there 
     * related methods.
     */
    public void moveIntoCubicle(String cubeId) {

        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();

        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    /*
     * i removed all the other checks, because there is no way to have this 
     * check without the other ones.
     */
    public String getStatus() {
        if (movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

    //accessors for all properties & fields
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    /*
     * mutators for all but the checks. they should not be manipulated by the
     * main class. these should all have input validation as well.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }
}
