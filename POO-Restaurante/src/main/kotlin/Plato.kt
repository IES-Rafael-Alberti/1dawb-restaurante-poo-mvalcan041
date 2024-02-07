class Plato(nombre: String, precio: Double, tiempoPreparacion: Int, val ingredientes: MutableList<String> = mutableListOf()) {

    var nombre: String = nombre
        set(value) {
            requireNombre(nombre)
            field = value
        }
    var precio: Double = precio
        set(value) {
            field = value
        }
    var tiempoPreparacion: Int = tiempoPreparacion
        set(value) {
            field = value
        }

    init {
        requireNombre(nombre)
        require(precio > 0) { "El precio del plato debe ser mayor que 0." }
        require(tiempoPreparacion > 1) { "El tiempo de preparación no podrá ser igual o inferior a 1." }
    }

    private fun requireNombre(nombre) {
        require(nombre.isNotEmpty()) { "El nombre del plato no puede estar vacío." }
    }

    fun agregarIngrediente(ingrediente: String) {
        require(ingrediente.isNotEmpty()) { "Un ingrediente no puede estar vacío." }
        ingredientes.add(ingrediente)
    }

    override fun toString(): String {
        return "$nombre ($tiempoPreparacion min.) -> $precio€ (${ingredientes.joinToString(", ")})"
    }
}