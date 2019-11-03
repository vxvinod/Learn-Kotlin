package Building

open class BaseBuildingMaterial(var numberNeeded: Int = 1)

class Wood:BaseBuildingMaterial(4)

class Brick:BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(var buildingMaterial: T){
    var baseMaterialNeeded : Int = 100
    var actualMaterialNeeded: Int = baseMaterialNeeded.plus(buildingMaterial.numberNeeded)

    fun build(){
        println("${actualMaterialNeeded} ${buildingMaterial::class.simpleName} required")
        isSmallBuilding(Building(Wood()))
    }

    fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
        if(building.actualMaterialNeeded < 500) println("small building")
        else println("large building")

    }


}

fun main(args: Array<String>) {
    var wood = Building(Wood()).build()

}