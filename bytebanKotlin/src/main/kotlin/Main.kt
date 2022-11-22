fun main() {
    println("Bem vindo ao ByteBank")
    val contaErasmo = Conta()
    contaErasmo.titular = "Erasmo"
    println("Conta ${contaErasmo.titular}, Saldo inicial: ${contaErasmo.saldo}")

    contaErasmo.depositar(10.0);
    println("Conta ${contaErasmo.titular}, Saldo : ${contaErasmo.saldo}")
    contaErasmo.sacar(100.0)
    println("Conta ${contaErasmo.titular}, Saldo : ${contaErasmo.saldo}")

//    contaErasmo.sacar(50.0);
//    println("Saldo : ${contaErasmo.saldo}")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    contaJoao.saldo = 100.0;
    println("Saldo conta ${contaJoao.titular}: ${contaJoao.saldo}")

    if (contaJoao.transferirPara(contaErasmo, 50.0)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Falha na transferência")
    }

    println("Saldo conta ${contaErasmo.titular}: ${contaErasmo.saldo}")

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(valor: Double) {
        println("Depositando $valor")
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        println("Sacando $valor")
        if (this.saldo >= valor) {
            saldo -= valor
        }
        println("Saldo insuficiente")
    }

    fun transferirPara(destino: Conta, valor: Double): Boolean {
        println("Transferindo $valor para ${destino.titular}")
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }


}

fun testaCopiasEReferencias() {
    val contaErasmo = Conta()
    contaErasmo.numero = 1000
    contaErasmo.titular = "Erasmo"
    contaErasmo.saldo = 200.0
    println(contaErasmo.numero)
    println(contaErasmo.titular)
    println(contaErasmo.saldo)

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    println("Titular da conta Joao: ${contaJoao.titular}")
    println("Titular da conta Maria: ${contaMaria.titular}")

    val numeroX = 10
    var numeroY = numeroX
    println("numero y $numeroY")

}
