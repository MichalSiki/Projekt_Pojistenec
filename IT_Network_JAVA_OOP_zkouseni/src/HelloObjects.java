public class HelloObjects {
    public static void main(String[] args) {
       Zdravic zdravic = new Zdravic();
       zdravic.text = "By dem";
        System.out.println(zdravic.pozdrav("Michal"));
       zdravic.pozdrav("Pepa");

    }
}