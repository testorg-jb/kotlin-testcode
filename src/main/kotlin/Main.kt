val STATIC_STRING = "foo";

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    SomeClassWithManyConstructorArgs(
        var0 = FontWeight.NORMAL,
        var1 = MaterialTheme.typography.body1.copy(color = STATIC_STRING),
        var2 = TextAlign.START,
        var3 = buildAnnotatedString {
            "foo"
        }
    )

    SomeClassWithManyConstructorArgs(
        var0 = FontWeight.NORMAL,
        var1 = MaterialTheme.typography.body1.copy(color = STATIC_STRING),
        var2 = TextAlign.START,
        var3 = buildAnnotatedString {
            "bar"
        }
    )


    SomeClassWithManyConstructorArgs(
        FontWeight.NORMAL,
        MaterialTheme.typography.body1.copy(color = STATIC_STRING),
        TextAlign.START,
        buildAnnotatedString {
            "foo"
        }
    )

    SomeClassWithManyConstructorArgs(
        FontWeight.NORMAL,
        MaterialTheme.typography.body1.copy(color = STATIC_STRING),
        TextAlign.START,
        buildAnnotatedString {
            "bar"
        }
    )
}

fun buildAnnotatedString(action: () -> String) = action()
