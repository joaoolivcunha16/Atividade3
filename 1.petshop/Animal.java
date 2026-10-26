public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String descrever() {
return "nome: " + nome + " , " +
        "idade:" + idade;
    }
    public int idadeemMeses(){
       return idade * 12;
    }
    public int idadeemMeses(int mesesJaVividos){
        return idade * 12 + mesesJaVividos;
    }
}
