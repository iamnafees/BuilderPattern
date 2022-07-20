public class Main {
    public static void main(String[] args) {


            Employee.Builder builder=new Employee.Builder(001,"jan@virtusa.com");
            builder.setName("Jan"); builder.setMobile(116);
            Employee employee= builder.build();
            System.out.println(employee);



    }
}