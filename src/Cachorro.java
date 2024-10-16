class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void FazerSom() {
        System.out.println(getNome() + "Diz: Au Au!");
    }

}
