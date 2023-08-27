import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " - Quantidade: " + quantidade;
    }
}

class Estoque {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public void atualizarQuantidade(Item item, int novaQuantidade) {
        item.setQuantidade(novaQuantidade);
    }
}

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar itens");
            System.out.println("4. Atualizar quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarItem(new Item(nome, quantidade));
                    break;
                case 2:
                    System.out.print("Nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    for (Item item : estoque.getItens()) {
                        if (item.getNome().equals(nomeRemover)) {
                            estoque.removerItem(item);
                            break;
                        }
                    }
                    break;
                case 3:
                    estoque.listarItens();
                    break;
                case 4:
                    System.out.print("Nome do item a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    for (Item item : estoque.getItens()) {
                        if (item.getNome().equals(nomeAtualizar)) {
                            estoque.atualizarQuantidade(item, novaQuantidade);
                            break;
                        }
                    }
                    break;
        }
    }
}
