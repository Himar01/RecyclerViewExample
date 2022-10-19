package es.ulpgc.moreno101.himar.recyclerviewexample

class SuperAppProvider {
    companion object{
        val superAppList = listOf<SuperApp>(
            SuperApp("Google Tasks",
                "Google",
                "Create to do's and subtasks.",
                "https://play-lh.googleusercontent.com/pjUulZ-Vdo7qPKxk3IRhnk8SORPlgSydSyYEjm7fGcoXO8wDyYisWXwQqEjMryZ_sqK2=w240-h480-rw"),
            SuperApp("Google Calendar",
                "Google",
                "Improve your day to day",
                "https://play-lh.googleusercontent.com/Jsbb0EeesKUbDTl3UyDKO6sNz45RCMh7gnoI6giQcQz1f5Mj0J4TRh7Psyu53vShh-qm=w240-h480-rw"),
            SuperApp("Wallet",
                "BudgetMakers",
                "Track your finances",
                "https://play-lh.googleusercontent.com/DqAKT8mJJWAQMzPuNTFL1CyhwVJkCEfQlv8CGlh7tNLPe81h92T-SwWG6UQLXydpEBNz=w240-h480-rw")
        )
    }
}