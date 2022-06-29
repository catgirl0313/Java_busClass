public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();

        bus.onBoard(12);
        bus.isRunning();
        bus.changeSpeed(30);
        System.out.println("-----" + bus.status + "-----");
        bus.changeSpeed(-10);

        bus.onBoard(1);
        bus.isRunning();
        bus.changeSpeed(20);
        bus.changeSpeed(-20);
        System.out.println("-----" + bus.status + "-----");

        bus.onBoard(2);
        bus.isRunning();
        bus.changeSpeed(30);
        bus.changeSpeed(-30);
        System.out.println("-----" + bus.status + "-----");

        bus.onBoard(16);
        bus.isRunning();
        bus.changeSpeed(40);
        bus.changeSpeed(-40);
        System.out.println("-----" + bus.status + "-----");
    }
}