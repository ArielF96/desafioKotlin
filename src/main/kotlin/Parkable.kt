data class Parkable(
    var vehicle: Vehicle,
    var parking: Parking
    ) {


    fun checkOutVehicle(plate: String) {
        val isParked = parking.vehicles.find { it.plate == plate }
        if (isParked!=null) {
            val fee = calculateFee(isParked.type, isParked.parkedTime.toInt(), isParked.discountCard.isNullOrEmpty())

            onSuccess(isParked.plate, fee)
            parking.updateProfits(fee)
            parking.vehicles.remove(isParked)
            println("AlkeParking has ${parking.vehicles.size} vehicles now!")
            println(" ")
        } else {
            onError()
        }
    }

    private fun calculateFee(type: VehicleType, parkedTime: Int,
        hasDiscountCard: Boolean): Int {
        var fee = 0

        if (parkedTime <= 120) {
            fee += type.fee
        } else {
            val minutes = parkedTime - 120
            val plus = minutes / 15
            if  ((plus % 2) == 0) {
                fee = type.fee + (plus * 5)
            } else {
                fee = type.fee + ((plus + 1) * 5)
            }
        }

        if (hasDiscountCard) {
            fee = (fee - (fee*0.15)).toInt()
        }

        return fee
    }

    private fun onSuccess(plate: String, fee: Int) {
        println("${plate}: Your parking fee is $${fee}. Come back soon!")
    }

    private fun onError() {
        println("Sorry, the check-out failed")
    }



}