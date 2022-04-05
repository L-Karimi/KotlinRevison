fun main(){
 var car1 =mobile("Toyota","Jeep","KDP 202T")
    println(car1.brand)
    println(car1.model)
    println(car1.mrp)
    var name = names("Lucy","Karimi",22)
    println(name.firstName)
    println(name.lastName)
    println(name.age)
    var employeee= employee("Preston","toopreston@gmail.com","Safaricom")
    println(employeee.name)
    println(employeee.email)
    println(employeee.company)
    var submit=submissions("English",45,"Deepack")
    println(submit.subject)
    println(submit.name)
    println(submit.marks)
}
class mobile( var model:String,var brand:String,var mrp:String){
}
class names( var firstName:String,var lastName:String,var age:Int){
}
class employee( var name:String,var email:String,var company:String){
}
data class submissions(var subject: String, var marks:Int, var name:String) {

}
fun Arrays(){
    var arrays = intArrayOf(1,2,3,4,5,6)
}
