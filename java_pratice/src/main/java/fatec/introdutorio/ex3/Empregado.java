package fatec.introdutorio.ex3;

class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0;  // Atribuição direta
    }

    // Métodos Getters e Setters
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = (salarioMensal > 0) ? salarioMensal : 0.0;
    }

    // Método para calcular o salário anual
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para aplicar aumento
    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * (percentual / 100);
    }
}