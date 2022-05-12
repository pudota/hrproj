package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DispEmpBySalary {

    public static void main(String[] args) {
    List<Employee> empList=new ArrayList<Employee>();
    empList.add(new  Employee(1, 500));
    empList.add(new  Employee(2, 3500));
    empList.add(new  Employee(3, 1500));
    empList.add(new  Employee(4, 1000));
    empList.add(new  Employee(5, 2500));
    empList.add(new  Employee(6, 2000));
    empList.add(new  Employee(7, 3000));
    System.out.println("empList"+empList);

    List<Employee> empSortedList=empList.stream().sorted(((o1, o2) -> (int) (o2.getSalary()- o1.getSalary()))).collect(Collectors.toList());
        System.out.println("\n----\n empList reverse order"+empSortedList);

        List<Employee> empSortedListId=empList.stream().sorted(((o1, o2) -> (int) (o2.getEmpId())- o1.getEmpId())).collect(Collectors.toList());
        System.out.println("\n-----\n empList upon id"+empSortedListId);

        List<Employee> empAscSortedList=empList.stream().sorted(((o1, o2) -> (int) (o1.getSalary()- o2.getSalary()))).collect(Collectors.toList());
        System.out.println("\n----\n empList Asc order"+empAscSortedList);

    }


}

