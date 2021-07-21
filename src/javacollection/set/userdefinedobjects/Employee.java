package javacollection.set.userdefinedobjects;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Employee){
            Employee other = (Employee) obj;
            //return (this.name && (this.age == other.age));
            if((this.name == other.name) && (this.age == other.age)){
                return true;
            }
            return false;
        }

        return false;
    }
      @Override
      public int hashCode(){
        return Objects.hash(this.name,this.age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    /*  @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
