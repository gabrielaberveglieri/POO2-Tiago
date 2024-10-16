abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void FazerSom(); // método

    public void dormir() { // método
        System.out.println(nome + "Está dormindo.");
    }
}

// Anotações em Sala:
// A classe abstrata pode ter implementacao nos metodos, embora ela nao tenha instancia