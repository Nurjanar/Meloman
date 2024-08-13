fun main() {
    println("Введите сумму покупки: ")
    var price = readln().toInt()
    println("Являетесь ли вы постоянным пользователем?")
    val input = readln()
    if (price < 0) {
        price = 0
    }
    if (price in 1001..10000) {
        price -= 100
    }
    if (price >= 10001) {
        price -= (price * 5 / 100)
    }
    if (input.equals("Да") || input.equals("да")) {
        price -= (price * 1 / 100)
    }
    println("Ваша сумма к оплате с учётом всех скидок составляет :")
    println("$price рублей")
}