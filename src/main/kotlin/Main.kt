import java.util.*

fun main() {

    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTO, Calendar.getInstance())
    val minibus = Vehicle("CC333CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("DD444DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val car2 = Vehicle("AA222AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_003")
    val moto2 = Vehicle("B333BBB", VehicleType.MOTO, Calendar.getInstance())
    val minibus2 = Vehicle("CC444CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus2 = Vehicle("DD666DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_004")
    val car3 = Vehicle("AA777AA", VehicleType.CAR, Calendar.getInstance())
    val moto3 = Vehicle("B888BBB", VehicleType.MOTO, Calendar.getInstance())
    val minibus3 = Vehicle("CC999CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus3 = Vehicle("DD222DD", VehicleType.BUS, Calendar.getInstance())
    val car4 = Vehicle("AA663AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_005")
    val moto4 = Vehicle("B747BBB", VehicleType.MOTO, Calendar.getInstance())
    val minibus4 = Vehicle("CC475CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus4 = Vehicle("DD775DD", VehicleType.BUS, Calendar.getInstance())
    val car5 = Vehicle("AA989AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_006")
    val moto5 = Vehicle("B698BBB", VehicleType.MOTO, Calendar.getInstance())
    val minibus5 = Vehicle("CC151CC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus5 = Vehicle("DD779DD", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_007")
    val soldOut = Vehicle("SOLDOUT", VehicleType.CAR, Calendar.getInstance())


    val parking = Parking(mutableSetOf())

    val vehicles = mutableListOf(car, moto, minibus, bus, car2, moto2, minibus2, bus2, car3, moto3, minibus3, bus3, car4, moto4, minibus4, bus4,
    car5, moto5, minibus5, bus5, soldOut)

    for (v in vehicles) {
        if (parking.addVehicle(v)) {
            println("Welcome to AlkeParking!")
        } else {
            println("Sorry, the check-in failed")
        }
    }


    println("-----------------List of vehicles---------------------")
    println("AlkeParking has ${parking.vehicles.size} vehicles now!")
    parking.listVehicles()

    println("-------------------Check-outs--------------------------")
    val parkable = Parkable(car, parking)
    parkable.checkOutVehicle("AA111AA")
    parkable.checkOutVehicle("B222BBB")
    parkable.checkOutVehicle("CC333CC")
    parkable.checkOutVehicle("DD444DD")










    //Muestra la patente
    //if (parking.vehicles.contains(car)) {
    //    println(car.plate) }

    //True si se agregan al set
    //println(parking.vehicles.contains(car))


    //No agrega patentes repetidas
    //val car2 = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    //val isCar2Inserted = parking.vehicles.add(car2)
    //println(isCar2Inserted)

    //Eliminar
    // parking.vehicles.remove(moto)
    //println(parking.vehicles.size)


}