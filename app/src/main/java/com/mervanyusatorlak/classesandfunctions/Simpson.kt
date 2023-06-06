package com.mervanyusatorlak.classesandfunctions
//primary constructor
class Simpson(var name:String,var age:Int,var job : String,var weight:Int) {
    //parantez içi zorunlu kalanlar isteğe bağlı
    var height = 0

    fun setHegiht(num: Int) {
        if (num > 100) {
            height = num
        }
        /*
    //Property
    var name=""
    var age=0
    var weight=0
    var job=""

    //secondary constructor
    constructor(name:String,age:Int,job:String,weight:Int){
        this.name=name
        this.age=age
        this.job=job
        this.weight=weight
    }
     */
    }
}