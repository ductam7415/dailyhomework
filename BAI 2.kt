fun main() {
    var born: Int = 0
    var age: Int = 0
    var university: Int = 0

    println("Cứ cho là bạn sẽ đỗ đại học năm 18 tuổi và năm 22 tuổi bạn sẽ tốt nghiệp thì")
    println("Điền năm sinh của bạn ")
    born = readLine()!!.toInt()
    age = 2021 - born

    if (born >2021) {
        println("nam nay 2021 ma sinh nam $born kinh chu thi kinh oii")
    } else {
        println("nam nay toi $age tuoi")
        if (born < 2021) {
            if (age > 22) {
                println("bat ngo day do dai hoc roi co a")
            } else {
                if (age > 18) {
                    university = age - 18
                    println("dang hoc roi a ,van con $university nua nhe ")
                } else {
                    university = 22 - age
                    println("van con em chua 18 a, còn $university nua moi vao doi e nhe ")
                }
            }
        }
    }
}