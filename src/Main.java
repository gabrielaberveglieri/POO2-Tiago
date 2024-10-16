public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Larissa ");

        cachorro.FazerSom();
        cachorro.dormir();

        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();

        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();
    }
}