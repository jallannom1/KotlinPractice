package ex_any_class

class Building(val name: String = "",
               val date: String = "",
               val area: Int = 0){
    override fun toString() =
            "name : ${this.name}\n" +
            "date : ${this.date}\n" +
            "area : ${this.area} m2\n"
}