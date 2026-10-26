public class TestePapelaria {
    public static void main(String[] args){
      Produto [] p = new Produto[2];
      p[0] = new Caderno("Universitario", 20,96);
      p[1] = new Caneta("Bic", 5, "Azul");
      for(int i = 0;i<p.length;i++){
          System.out.println(p[i].descrever());
      }
        System.out.println(p[0].precocomDesconto(10));
        System.out.println(p[0].precocomDesconto(90 , 8));
    }

}
