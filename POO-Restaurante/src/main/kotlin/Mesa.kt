class Mesa(val numero: Int, val capacidad: Int, var estado: String = "libre", val pedidos: MutableList<Pedido> = mutableListOf()) {

    init {
        require(capacidad in 1..6) {"La capacidad de la mesa debe estar entre 1 y 6." }
        }

    fun ocuparMesa() {
        if (estado == "libre") {
            estado = "ocupada"
        }
    }

    fun ocuparReserva() {
        if (estado == "reservada") {
            estado = "ocupada"
        }
    }

    fun liberarMesa() {
        estado = "libre"
        pedidos.clear()
    }

    fun agregarPedido(pedido: Pedido) {
        pedidos.add(pedido)
    }

    override fun toString(): String {
        return "Mesa $numero ($capacidad personas): $estado\nPedidos:\n${pedidos.joinToString("\n")}"
    }
}