object Typography {
    val body1: Body = Body
}

object Body {
    fun copy(color: String): Body = this
}

enum class TextAlign {
    START, END, MIDDLE
}
