
public class Employee {
    private static String _nameSurname;
    private static double _salary;
    private static int _workHours;
    private static int _hireYear;

    public static void main(String[] args) {
        Employee employee = new Employee("Ahmet Arif Akıncı" , 2000, 45,1985);
        toString(employee);

    }
    public Employee(String nameSurname,
                    double salary,
                    int workHours,
                    int hireYear){
        this._nameSurname = nameSurname;
        this._salary = salary;
        this._workHours = workHours;
        this._hireYear = hireYear;
    }

    public static double tax(){
        double taxValue = 0;

        if(_salary < 1000){
            return 0;
        }
        else if(_salary>=1000){
            taxValue = (_salary * 3) / 100;
            return taxValue;
        }
        else{
            System.out.println("Maaş 0dan küçük olamaz dalga mı geçiyorsunuz ? ");
        }
        return taxValue;

    }
    public static int bonus(){
        int bonusHours = 0;
        int bonusSalary = 0;
        if(_workHours > 40){
            bonusHours = _workHours - 40;
            bonusSalary = bonusHours * 30;
        }
        return bonusSalary;
    }
    public static double raiseSalary(){
        int thisYear = 2021;
        int workingYears = thisYear-_hireYear;
        double raise = 0;

        if(workingYears<=9){
            raise =(_salary * 5) / 100;
        }
        else if(workingYears>9 && workingYears <=19)
        {
            raise = (_salary * 10) / 100;
        }
        else if(workingYears>19){
            raise= (_salary * 15) / 100;
        }
        else{
            System.out.println("çalışma yılı - değer olamaz");
        }

        return raise;
    }
    public static void toString(Employee employee){
        System.out.println("Adı : " +employee._nameSurname);
        System.out.println("Maaşı : " + employee._salary);
        System.out.println("Çalışma Saati : " + employee._workHours);
        System.out.println("Başlangıç Yılı : " + employee._hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı :" + raiseSalary());
        double toplam = employee._salary + bonus() - tax();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + toplam);
        double toplam_maas = toplam + raiseSalary();
        System.out.println("Toplam Maaş : " + toplam_maas);


    }
}
