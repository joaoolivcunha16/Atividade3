public class TesteEscola {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[2];
        f[0] = new Professor("Ana", 3000, "POO");
        f[1] = new Coordenador("Bruno", 4500,"Setor pedagógico");
   for(int i =0; i<f.length;i++){
       System.out.println(f[i].descrever());
   }
        System.out.println(f[0].bonificacao());
        System.out.println(f[0].bonificacao(20));
    }
}