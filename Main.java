public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        
        q.pushPerson(new Person("aaa", "Luigi", "Niso"));
        q.pushPerson(new Person("bbb", "Maria", "Mastroleo"));
        q.pushPerson(new Person("ccc", "Mario", "Rossi"));
        q.pushPerson(new Person("ddd", "Giuseppe", "Verdi"));
        q.pushPerson(new Person("eee", "Antonio", "Gialli"));

        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        
        q.read();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

        System.out.println(q.popPerson());

        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        
        q.read();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

        
        q.pushPerson(new Person("fff", "Francesco", "LaGrotta"));
        q.read();

        System.out.println(q.popPerson());

        q.read();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        q.pushPerson(new Person("ggg", "Francesco", "Colazzo"));

        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

        
        q.read();
    }
}
