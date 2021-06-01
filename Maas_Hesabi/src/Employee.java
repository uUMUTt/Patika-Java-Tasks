
public class Employee {

    String name;
    double salary;
    double temp;
    double salaryIncrease;
    int workHours;
    int hireYear;
    int thisYear = 2021;
    double tax;
    int bonus;
    int extraHour = 5;

    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.temp = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        raiseSalary();
    }

    public void tax() {
        this.tax = this.salary * 0.03;
        this.salary -= (this.salary > 1000) ? tax : this.salary;
        System.out.println("sdad");
    }

    public void bonus() {
        this.bonus = extraHour * 30;
        this.salary += bonus;
    }

    public void raiseSalary() {
        int gap = this.thisYear - this.hireYear;
        if (gap < 10) {
            this.salaryIncrease = this.temp * 0.05;
        } else if (gap < 20) {
            this.salaryIncrease = this.temp * 0.1;
        } else {
            this.salaryIncrease = this.temp * 0.15;
        }
        this.salary += this.salaryIncrease;
    }

    @Override
    public String toString() {
        return "Adı = " + name + "\n"
                + "Maaşı = " + temp + "\n"
                + "Çalışma Saati = " + workHours + "\n"
                + "İşe Başlama Yılı = " + hireYear + "\n"
                + "Vergi = " + this.tax + "\n"
                + "Bonus = " + this.bonus + "\n"
                + "Maaş Artışı = " + this.salaryIncrease + "\n"
                + "Vergi ve Bonuslar ile birlikte maaş = " + (salary - salaryIncrease) + "\n"
                + "Toplam Maaşı = " + (this.salaryIncrease + this.temp) + "\n";
    }

}
