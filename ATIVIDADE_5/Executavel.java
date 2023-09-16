package ATIVIDADE_5;

public class Executavel {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Toyota Corolla", 1970);
        Moto moto = new Moto("Volkswagen (VW)", "Volkswagen Golf", 1974);
        Bicicleta bicicleta = new Bicicleta("Nissan", "Nissan Altima", 1992);

        System.out.println("Informações do Carro:");
        carro.exibirInfo();
        carro.acelerar(500);
        carro.ligarFarol();
        System.out.println();

        System.out.println("Informações da Moto:");
        moto.exibirInfo();
        moto.acelerar(300);
        moto.empinar();
        System.out.println();

        System.out.println("Informações da Bicicleta:");
        bicicleta.exibirInfo();
        bicicleta.pedalar();
    }
}

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidade;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("acelerando e sua velocidade agora é: " + velocidade + " km/h");
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        System.out.println("freando e sua velocidade agora é: " + velocidade + " km/h");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}

// Carro
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void ligarFarol() {
        System.out.println("Farol ligado");
    }
}

// Moto
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void empinar() {
        System.out.println("empinar a moto");
    }
}

// Bicicleta
class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta!");
    }
}




