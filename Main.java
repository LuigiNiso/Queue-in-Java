public class Main {
    public static void main(String[] args) {
        MenuManager gm = new MenuManager();

        gm.add();
        gm.add();
        gm.add();
        System.out.println(gm.del());
        gm.add();
        gm.add();
        gm.add();

        gm.read();
    }
}
