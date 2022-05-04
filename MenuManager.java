import java.util.Scanner;

/**
 * GestioneMenu
 */
public class MenuManager {

  Scanner scan = new Scanner(System.in);

  private Queue q = new Queue();

  public boolean add(){
    String code, name, lastName;

    System.out.println("Type name: ");
    name = scan.nextLine();
    System.out.println("Type last name: ");
    lastName = scan.nextLine();
    System.out.println("Type code: ");
    code = scan.nextLine();

    Person p = new Person(code, name, lastName);
    
    return (q.pushPerson(p) == true) ? true : false;
  }

  public Person del(){
    return q.popPerson();
  }
  

  public void read(){
    q.read();
  }
}