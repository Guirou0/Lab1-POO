class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String nascimento;
    private int numero;

    public Pessoa(String nome, int idade, String cpf, String nascimento, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("João", 20, "123.456.789-00", "01/01/2000", 123456);

        System.out.println("Meu nome é " + pessoa.getNome());
        System.out.println("Eu tenho " + pessoa.getIdade() + " anos");
        System.out.println("Meu CPF é " + pessoa.getCpf());
        System.out.println("Nasci em " + pessoa.getNascimento());
        System.out.println("Meu número é " + pessoa.getNumero());
    }
}
