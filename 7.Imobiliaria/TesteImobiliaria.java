public class TesteImobiliaria {
    public static void main(String[] args){
        Imovel [] im = new Imovel[2];
        im[0] = new Casa("Rua A,10",80,3);
        im[1] = new Apartamento("Rua B,200",60,5);
        for(int i = 0;i<im.length;i++){
            System.out.println(im[i].descrever());
        }
        System.out.println(im[0].valorEstimado(3000));
        System.out.println(im[0].valorEstimado(3000,2000));
    }
}
