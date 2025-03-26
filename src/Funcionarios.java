public class Funcionarios {

private String nome;
private double salarioBase;
private int horasTrabalhadas;

//Construtor
    public Funcionarios(String nome, double salarioBase, int horasTrabalhadas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

//Metodo para calcular salário final
    public double calcularSalarioFinal(){
        int horasNormais = 160;
        double valorHora = salarioBase / horasNormais;
        if(horasTrabalhadas > horasNormais){
            int horasExtras = horasTrabalhadas - horasNormais;
            return salarioBase + (horasExtras * valorHora *1.5);
        }
        return salarioBase;
    }

//Metodo para exibir dados do fúncionario
    public void exibirDados(){
        System.out.printf("Fúncionario: %s\n", nome);
        System.out.printf("Sálario Base: R$%.2f\n", salarioBase);
        System.out.printf("Horas Trabalhadas: %d\n",horasTrabalhadas);
        System.out.printf("Sálario Final: R$%.2f\n",calcularSalarioFinal());
        System.out.println("________________________________");
    }
}

