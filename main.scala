import scala.io.StdIn.readLine
object Main extends App{
    //var int i,j
    var A = List(2,5,4,9,10,19)
    var L = A.length
    var h : Int = 0
    /*Kを入力*/
    println("Kを入力してください--->")
    var K = readLine().toInt
    var B = A.map( K - _)
    
    //var i=2
    //    println(L)
    for (i <- 0 to  L-1;j <-  i+1 to L-1 ) {
        //        println(i,j)
        if (A(i)==B(j))
        {
            h = 1
            println(A(i),A(j))
        }
    }
    if (h == 1){
        println("A[i] + A[j] == K を満たす i<j は存在します")
    }
    else {println("A[i] + A[j] == K を満たす i<j は存在しません")
    }
    }
