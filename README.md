## Тестирование формы входа в интернет банк

### Начало работы 
1. Скачайте проект по ссылке: https://github.com/Mikhail9030/AQASQL.git
2. Запустите проект в IntelliJIDEA
3. Скачайте Docker Desktop

### Запуск
1. Запускаем контейнер с базой данных MySQL.
Все параметры для запуска уже есть в docker-compose.yml. Введите команду в терминале: docker-compose up
2. После того как завешится запуск контейнера, запускаем SUT. Для этого в новой вкладке терминала вводим команду: java -jar artifacts/app-deadline.jar -P:jdbc.url=jdbc:mysql://localhost/app -P:jdbc.user=app -P:jdbc.password=pass.
3. Запускаем автотесты. Открываем также, новую вкладку в терминале, вводим команду: gradlew clean test.
4. Автотесты должны проходить корректно и в терминале должно выводится такое сообщение: BUILD SUCCESSFUL.