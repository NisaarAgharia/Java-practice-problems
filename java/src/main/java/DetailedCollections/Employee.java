package DetailedCollections;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Employee implements Serializable {
    private int empID;
    private String empName;
    private String empAddress;
    private Date empDOB;
    private int Weight;


    public Employee(int empID, String empName, String empAddress, Date empDOB, int weight) {
        this.empID = empID;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDOB = empDOB;
        Weight = weight;
    }

    public Employee() {
    }

    public Employee(int empID, String empName, String empAddress, int weight) {
        this.empID = empID;
        this.empName = empName;
        this.empAddress = empAddress;
        Weight = weight;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(Date empDOB) {
        this.empDOB = empDOB;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID &&
                Weight == employee.Weight &&
                empName.equals(employee.empName) &&
                empAddress.equals(employee.empAddress) &&
                Objects.equals(empDOB, employee.empDOB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, empName, empAddress, empDOB, Weight);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empDOB=" + empDOB +
                ", Weight=" + Weight +
                '}';
    }


}
