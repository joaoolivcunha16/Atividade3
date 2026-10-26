public class TesteBiblioteca {
    public static void main(String[] args) {
        Publicacao[] publi = new Publicacao[2];
        publi[0] = new Livro("Dom Casmurro", 1899, 256);
        publi[1] = new Revista("Ciência hoje", 2024, 301);
        for (int i = 0; i < publi.length; i++) {
            System.out.println(publi[i].citar());
        }
    System.out.println(publi[0].emprestar(7));
    System.out.println(publi[0].emprestar(7,"Ana"));
    }
}
