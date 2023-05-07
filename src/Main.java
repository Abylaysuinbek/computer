 public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Laptop laptop = new Laptop("LED","OWER","optic");
        laptop.setBattarey("5000mA");
        laptop.setCamera("20mpx");
        laptop.setName("DELL");

        System.out.println("My computer:"+ laptop.getName());
        System.out.println("My computer battery:" + laptop.getBattarey());
        System.out.println("My computer camera:" + laptop.getCamera());

        System.out.println("My computer muse: " + laptop.getMouse());
    }
}

