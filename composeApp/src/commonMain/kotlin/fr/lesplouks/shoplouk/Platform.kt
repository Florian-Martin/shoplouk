package fr.lesplouks.shoplouk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform