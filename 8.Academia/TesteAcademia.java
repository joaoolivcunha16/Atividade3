public class TesteAcademia {
public static void main(String[] args) {
    Atleta[] a = new Atleta[2];
    a[0] = new Corredor("Lia", 10);
    a[1] = new Nadador("Paulo", "crawl");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i].apresentar());
    }
    System.out.println(a[0]. registrarTempo(55.2));
    System.out.println(a[0].registrarTempo(58, "100m"));
}

}
