
public class Main {
    public static void main(String[] args) {
        Funcionarios[] funcionarios = {
          new Funcionarios("Ana",3000.0, 170),
          new Funcionarios ("Carlos", 2800.00, 160),
          new Funcionarios ("Mariana ", 3500.0, 180),
          new Funcionarios ("João", 2500.00, 155)
        };

        //Exibição do relátorio
        System.out.println("\nRelátorio de Funcionários:");
        for (Funcionarios funcionario : funcionarios){
            funcionario.exibirDados();
        }
    }
}