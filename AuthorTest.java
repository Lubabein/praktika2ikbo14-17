import java.util.Scanner;
class Author{
  private String name;
  private String email;
  private char gender;

  public Author (String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
  }
  public Author (){
    name="Stiven King";
    email="S.King@gmail.ru";
    gender='M';
  }

  public String getName (){
    return name;
  }
  public String getEmail (){
    return email;
  }
  public void setEmail (String email){
    this.email = email;
  }
  public char getGender (){
    return gender;
  }
  public String ToString (){
    return name + " (" + gender + ") at " + email;
  }
}
public class AuthorTest{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    Author a= new Author();
    int k = 100;
    String s;
    while (k != 6){
        System.out.println ("Enter: \n 2-print name \n 3-print email \n 4-print gender \n 5-print info \n 6-end \n");
        k=sc.nextInt();
        switch (k) {
            case 2:
                System.out.println (a.getName());
                break;
            case 3:
                System.out.println (a.getEmail());
                break;
            case 4:
                System.out.println (a.getGender());
                break;
            case 5:
                System.out.println (a.ToString());
                break;
        }
    }
  }
}
