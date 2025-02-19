package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1,"Lorem Insurance",Plan.PLAN1);
        Healthplan plan2 = new Healthplan(2,"Ipsum Insurance",Plan.PLAN2);
        Healthplan plan3 = new Healthplan(3,"Dolor Insurance",Plan.PLAN3);



        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();
        healthplans[2] = plan3.getName();
        Employee developer = new Employee(1,"John Doe", "JohnDoe@workintech.com",1234, healthplans);
        Employee developer2 = new Employee(2,"John Woe", "JohnWoe@workintech.com",12345, healthplans);

        String[] developerNames = new String[3];
        Company company = new Company(1,"Workintech",100000, developerNames );

        System.out.println(developer);
        System.out.println(developer2);
        System.out.println("-------------");
        developerNames[0] = developer.getFullName();
        developerNames[1] = developer2.getFullName();


        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
