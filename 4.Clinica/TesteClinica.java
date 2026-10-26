public class TesteClinica {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        p[0] = new Paciente("Carla","Unimed");
        p[1] = new Medico("Diego" , "Clinica.");
        for(int i =0; i<p.length;i++){
            System.out.println(p[i].ficha());
        }
        System.out.println(p[0].agendar("12/10/2026"));
        System.out.println(p[0].agendar("12/10/2026", "14:00"));
    }
}