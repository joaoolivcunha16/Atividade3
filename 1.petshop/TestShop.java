public class TestShop {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0] = new Cachorro("Rex", 3, "Labrador");
        a[1] = new Gato("Mia", 2, "Pelagem curta");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].descrever());
        }
        System.out.println(a[0].idadeemMeses());
        System.out.println(a[0].idadeemMeses(6));
    }

}
