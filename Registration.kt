class Registration {
    var email: String = ""
        get() = field.toUpperCase() // Геттер для email, возвращает в верхнем регистре

    var password: String = ""
        set(value) {
            if (value.length < 6) {
                println("Длина пароля должна быть не менее 6 символов.")
            } else {
                field = value // Устанавливаем значение, если длина корректная
            }
        }
}