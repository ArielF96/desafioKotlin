data class Parking(
    val vehicles: MutableSet<Vehicle>,
    val max: Int = 20,
    var profits: Pair<Int,Int> = Pair(0,0)
    ) {

    fun addVehicle(vehicle: Vehicle): Boolean {
        if (vehicles.size < max) {
            vehicles.add(vehicle)
            return true
        } else {
            return false
        }
    }

    fun updateProfits(fee: Int) {
        profits = Pair(profits.first + 1, profits.second + fee)
        println("${profits.first} vehicles have checked out and have earnings of $ ${profits.second}")
    }

    fun listVehicles() {
        for (v in vehicles) {
            println("PLATE: ${v.plate}")
        }
    }



}