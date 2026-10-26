public class TesteLanchonete {
    public static void main(String[] args) {
        Item[] x = new Item[2];
        x[0] = new Lanche("X-burguer", 18, 2);
        x[1] = new Bebida("Suco", 18, 300);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].descrever());
        }
        System.out.println(x[0].total());
        System.out.println(x[0].total(2));
    }
}