class Pedido( val numero: Int = ++contPedidos, val platos: MutableList<Plato> = mutableListOf(), var estado: String = "pendiente") {
    companion object {
        var contPedidos = 0
    }

    fun agregarPlato(plato: Plato) {
        platos.add(plato)
    }

    fun eliminarPlato(nombrePlato: String) {
        platos.removeIf { it.nombre == nombrePlato }
    }

    fun calcularPrecio(): Double {
        return platos.sumOf { it.precio }
    }

    fun calcularTiempo(): Int {
        return platos.sumOf { it.tiempoPreparacion }
    }

    override fun toString(): String {
        return "Pedido $numero:\n${platos.joinToString("\n")}\nEstado: $estado"
    }
}