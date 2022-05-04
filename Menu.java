import java.util.InputMismatchException;
import java.util.Scanner;

class Menu{
    public static void main(String[] args) {

        //Management variables
        Scanner scan = new Scanner(System.in);
        boolean insert = false;
        boolean exit = false;
        byte choise = -1;
        //----------------------

        //Program variables
        MenuManager gm = new MenuManager();
        //----------------------

        do{
            System.out.println("1. Insert person");
            System.out.println("2. Delete person");
            System.out.println("3. Read queue");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            try{
                choise = scan.nextByte();
                scan.nextLine();

                switch(choise){
                    case 0:{
                        exit = true;
                        break;
                    }
                    case 1:{
                        insert = true;
                        gm.add();
                        break;
                    }
                    case 2:{
                        if(insert){
                            gm.del();
                        }else{
                            System.out.println("Have to insert first.");
                        }
                        break;
                    }
                    case 3:{
                        if(insert){
                            gm.read();
                        }else{
                            System.out.println("Have to insert first.");
                        }
                        break;
                    }
                    default:{
                        System.out.println("Invalid value!");
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("Type a number!");
                scan.next();
            }
        }while(!exit);
        scan.close();
    }
}