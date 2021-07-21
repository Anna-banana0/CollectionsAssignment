package javacollection.set.sorting;

import com.sun.xml.internal.ws.util.StringUtils;

public class Employeee implements Comparable{
    private String name;
    private Integer empno;
    private String DeptName;

    public Employeee(String name, int empno, String deptName) {
        this.name = name;
        this.empno = empno;
        DeptName = deptName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", empno=" + empno +
                ", DeptName='" + DeptName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employeee ee = (Employeee) o;

        return this.name.compareTo(ee.name);
    }
}
