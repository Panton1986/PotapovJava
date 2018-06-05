public class Main  {
   
    public static void main(String args[]){
      Employe [] empArray = new Employe[5];
      empArray[0] = new Employe("Ivanov Ivan Ivanovich", "Head", "1@mail.ru", "8 (999) 99 9999", "100 000 rub", 35);
      empArray[1] = new Employe("Ivanov Petr Ivanovich", "Head", "2@mail.ru", "8 (999) 88 9999", "90 000 rub", 30);
      empArray[2] = new Employe("Ivanov Stepan Ivanovich", "Head", "3@mail.ru", "8 (999) 77 9999", "110 000 rub", 41);
      empArray[3] = new Employe("Ivanov Anton Ivanovich", "Head", "4@mail.ru", "8 (999) 66 9999", "120 000 rub", 45);
      empArray[4] = new Employe("Ivanov Saveliy Ivanovich", "Head", "5@mail.ru", "8 (999) 55 9999", "200 000 rub", 63);
      

      for (int i =0 ; i < empArray.length; i++){
        if (empArray[i].age > 40){
        System.out.println("ФИО: " + empArray[i].name+ "\nДолжность: " + empArray[i].position + "\nEmail: " + empArray[i].email + "\nНомер телефона: " + empArray[i].phone_number + "\nЗарплата: " + empArray[i].salary + "\nВозраст: " + empArray[i].age);
        System.out.println();
        }
       }
      }    
}

public class Employe  {
   String name;
   String position;
   String email;
   String phone_number;
   String salary;
   int age;
    public Employe(String name, String position, String email, String phone_number, String salary, int age){
    this.name = name;
    this.position = position;
    this.email = email;
    this.phone_number = phone_number;
    this.salary = salary;
    this.age = age;
    }
   
}
