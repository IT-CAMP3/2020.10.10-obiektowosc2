public class Main {
    public static void main(String[] args) {
        Square kwadrat = new Square(5);

        System.out.println(kwadrat.getBok());
        System.out.println(kwadrat.getPole());
        System.out.println(kwadrat.getObw());

        kwadrat.setBok(10);

        System.out.println(kwadrat.getBok());
        System.out.println(kwadrat.getPole());
        System.out.println(kwadrat.getObw());

        kwadrat.setPole(121);

        System.out.println(kwadrat.getBok());
        System.out.println(kwadrat.getPole());
        System.out.println(kwadrat.getObw());
    }
}
