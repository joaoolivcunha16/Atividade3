public class TesteCinema {
    public static void main(String[] args) {


        Ingresso[] y = new Ingresso[2];
        y[0] = new MeiaEntrada("Divertida Mente", 40, "123");
        y[1] = new Vip("Duna", 40, "setor A");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i].valorFinal());
        }
        System.out.println(y[0].resumo());
        System.out.println(y[0].resumo(true));
    }
}