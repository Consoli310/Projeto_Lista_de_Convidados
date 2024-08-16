import java.util.*;

public class Convidados {

    Scanner sc = new Scanner(System.in);
    private String name;
    private List<String> listaConvidados = new ArrayList<>();
   private List<String> listaNoPay = new ArrayList<>();

    public void addList(String name) {
        listaConvidados.add(name);
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getListaConvidados(int indice) {
        return this.listaConvidados.get(indice);
    }
    public List<String> getListaConvidados(){
        return this.listaConvidados;
    }


    public List<String> getListaNoPay() {
        return listaNoPay;
    }


    public void mainUses() {
        System.out.println("**********************************");
        System.out.println("1 - Adicionar convidados");
        System.out.println("2 - Remover convidados");
        System.out.println("3 - Ver lista completa");
        System.out.println("4 - Ver lista não pagantes");
        System.out.println("5 - Calcular excedentes");
        System.out.println("**********************************");
    }

    public void removeList(int position) {
        this.listaConvidados.remove(position);
    }

    public void noPay() {
        for (String x : this.listaConvidados) {
            if (x.contains("-5")) {
                this.listaNoPay.add(x);
            }
        }
    }

    public void calcExcedentes() {
        System.out.println("O pacote da festa é para quantos convidados?");
        String entrada = sc.nextLine();
        int totalConvidadosPacote = 0;
        while (true) {
            if (Objects.equals(entrada, "sair")) {
                break;
            }
            try {
                totalConvidadosPacote = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente:");
                entrada = sc.nextLine();
            }
            if (totalConvidadosPacote > 0) {
                break;
            } else {
                System.out.println("Valor inválido, tente novamente:");
                entrada = sc.nextLine();
            }
        }

        System.out.println("Qual o valorTotal para cada excedente?");
        entrada = sc.nextLine();
        double valorTotal = 0;
        double valorExcedentes = 0;
        while (true) {
            if (Objects.equals(entrada, "sair")) {
                break;
            }
            try {
                valorExcedentes = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente:");
                entrada = sc.nextLine();
            }
            if (valorExcedentes > 0) {
                break;
            } else {
                System.out.println("Valor inválido, tente novamente:");
                entrada = sc.nextLine();
            }
        }
        if (totalPagantes() > totalConvidadosPacote) {
            valorTotal = (totalPagantes() - totalConvidadosPacote) * valorExcedentes;
            System.out.println("Número de excedentes = " + (totalPagantes() - totalConvidadosPacote));
            System.out.println(" -> -> -> Valor a ser pago: R$" + String.format("%.2f", valorTotal));
        } else {
            System.out.println("-> -> -> Não há excedentes");
        }
    }

    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int totalPagantes() {
        return listaConvidados.size() - listaNoPay.size();
    }
}
