package week5.streams.intermadiate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntermadiateOperations {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Ali"));
        customerList.add(new Customer("Veli"));
        customerList.add(new Customer("Ayşe"));
        customerList.add(new Customer("Ayşe"));
        customerList.add(new Customer("Veli"));
        customerList.add(new Customer("Veli"));
        customerList.add(new Customer("Elif"));
        customerList.add(new Customer("Emir"));
        customerList.add(new Customer("Nehir"));

        List<Customer> filteredCustomerList = new ArrayList<>();

        for (Customer customer : customerList) {
            if (customer.getName().startsWith("A")) {
                filteredCustomerList.add(customer);

            }
        }

            System.out.println("Foreach ile: " + filteredCustomerList);

            List<Customer> customerList1 = customerList.stream()
                    .filter(customer -> customer.getName().startsWith("A"))
                    .toList();

            System.out.println("Stream ile :" + customerList1);

        List<String> stringsNames = customerList.stream()
                .map(customer -> customer.getName().toUpperCase())
                .toList();

        System.out.println(stringsNames);

        List<String> names = customerList.stream()
                .map(customer -> customer.getName().toUpperCase())
                .distinct()
                .toList();

        System.out.println(names);

        List<String> sortedCustomers = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName())
                .toList();

        System.out.println(sortedCustomers);

        List<String> sortedCustomerList = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName())
                .distinct()
                .toList();

        System.out.println(sortedCustomerList);

        List<String> reversedCustomers = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();

        System.out.println(reversedCustomers);


        List<String> reversedCustomerLimitedList = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .toList();

        System.out.println(reversedCustomerLimitedList);


        List<String> strings = reversedCustomers.stream()
                .skip(2)
                .toList();

        System.out.println(strings);






    }
    }

