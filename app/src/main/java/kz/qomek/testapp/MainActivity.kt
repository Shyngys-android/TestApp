package kz.qomek.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
Задача:
Правильно определите наименьшее количество монет,
которые следует передать покупателю, чтобы сумма стоимости монет равнялась правильной сумме сдачи.
Результат выводить в Toast.

Если сумма сдачи меньше суммы наименьшей монеты, то выводить "Сдачи нет"

Пример:
Сумма сдачи = 15
Монеты = [1, 5, 10, 25, 100]
Результат = [5, 10]
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}