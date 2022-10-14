public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente cliente; //Atributos do cliente
    
    public Conta(int numero, double saldo, double limite, Cliente cliente){
    this.numero = numero;
    this.saldo = saldo;
    this.limite = limite;
    this.cliente = cliente;
}
    
    void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else{
            if(valor > this.saldo && valor <= this.limite){
                System.out.println("Cuidado voce esta usando seu limite");
                this.saldo -= valor;
            }else{
                System.out.println("saldo insuficiente");
            }
        }
    }    

    void depositar(double valor){
        this.saldo += valor;
    }
    
}
