class Plato(val nombre: String, val precio: Double, val tiempoPreparacion: Int, val ingredientes: MutableList<String> = mutableListOf()) {

    init {
        require(nombre.isNotEmpty()) { "El nombre del plato no puede estar vacío." }
        require(precio > 0) { "El precio del plato debe ser mayor que 0." }
        require(tiempoPreparacion > 1) { "El tiempo de preparación no podrá ser igual o inferior a 1." }
    }

    fun agregarIngrediente(ingrediente: String) {
        require(ingrediente.isNotEmpty()) { "Un ingrediente no puede estar vacío." }
        ingredientes.add(ingrediente)
    }

    override fun toString(): String {
        return "$nombre ($tiempoPreparacion min.) -> $precio€ (${ingredientes.joinToString(", ")})"
    }
}