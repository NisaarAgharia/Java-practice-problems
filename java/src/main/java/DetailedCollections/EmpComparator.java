package DetailedCollections;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmpDOB().before(o2.getEmpDOB()))
        {
            return -1;
        }
       else if(o1.getEmpDOB().after(o2.getEmpDOB()))
        {
            return 1;
        }
       else
           return 0;



    }
}
