public class Banco {
    public static void main(String[] args) {
        //Criando dois objetos ana e caio
        Cliente ana = new Cliente("Ana da Silva", "Rua X, 10");
        Cliente caio = new Cliente("Caio de Souza", "Rua Y, 20");
        
        //Criando dois objetos contaAna e contaCaio
        Conta contaAna = new Conta(1, 500, 1000, ana);
        Conta contaCaio = new Conta(2, 800, 1500, caio);
        
        System.out.printf("Saldo da %s é de %.2f\n", ana.nome, contaAna.saldo);
        System.out.printf("Saldo da %s é de %.2f\n", caio.nome, contaCaio.saldo);
    }
    
}
