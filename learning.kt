fun main() 
{
//     var x: Int = 5
//     println("Hello World")
//     println("$x")
//     if(x==5)
//     {
//         println("x is $x")
//     }
//     
//     var age: Int = 18
//     if(age==18)
//     {
//         println("Eligible to vote")
//     }
//     else
//     {
//         println("Not Eligible to vote")
//     }
//     
//     var name: String = "ABC"
//     when(name)
//     {
//         "ABC"->
//         {
//         println("")    
//         }
//         "DEF"->
//         {
//         println("")   
//         }
//         else ->
//         {
//         println("")   
//         }
//     }
//     
//     val names = arrayOf("abc","def","ghi")
//     for(name in names)
//     {
//         println(name)
//     }
// RANGES
// 
// for(i in 0..3)
//     {
//         println(i)
//     }
//     
//     for(i in 2..8 step 2)
//     {
//         println(i)
//     }
//     
//     for(i in 3 downTo 0)
//     {
//         println(i)
//     }
//     
//     val x=2
//     if(x in 1..5)
//     {
//         println("$x is in The Range of 1 to 5")
//     } 
//     
//     val names = mutableListOf("abc","def","ghi",1)
//     names[0]="pqr"
//     println(names[0])  
//     
//     val names = mutableListOf<String>("abc","def","ghi")
//     names[0]="pqr"
//     println(names[0])
// println(add(3,4))
// greet("Good Morning")
// greet()
// greet(name= "DEF",g= "Good Morning")
val value = op(4,5,
{
    a,b->
    print("Adding : ")
    a+b
})   //Lambda Function
print(value)
}

fun add(a: Int,b: Int) : Int
{
    return(a+b)
}
fun greet(g: String = "Good Morning" , name:String = "ABC")
{
    print("$g\n$name")
}
fun op(a:Int,b:Int,operate: (Int,Int)-> Int) : Int //Lambda Function Operate
{
    return operate(a,b)
}

