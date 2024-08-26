fun main() {
    //problem 8
    fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
        return "There's a new sign-in request on $operatingSystem for your Google Account $emailId";
    }

    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))





    //problem 9
    fun pedometerStepsToCalories(numberOfSteps: Int): Double {
        val caloriesBurnedForEachStep = 0.04
        val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
        return totalCaloriesBurned
    }

    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")




    //problem 10
    fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
        return timeSpentToday > timeSpentYesterday
    }
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")




    //problem 11
    fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
        println("City: $cityName")
        println("Low temperature: $lowTemp, High temperature: $highTemp")
        println("Chance of rain: $chanceOfRain%")
        println()
    }
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)


}


