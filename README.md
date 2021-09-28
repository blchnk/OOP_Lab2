# OOP_Lab2

Используя результат первой лабораторной работы:

- Добавить диагностические сообщения в конструкторы и сеттеры классов Employee, Car и Pet. Реализовать в них методы init() и destroy() с диагностическими сообщениями.
Пример:
public void init() {
System.out.println("Class Person: init method");
}
- Реализовать IoC и DI из первой лабораторной с помощью аннотаций. Обязательно наличие аннотаций: @Component, @Autowired, @Qualifier, @Value, @Scope, @PostConstruct и @PreDestroy.
- Создать конфигурационный класс и релизовать IoC и DI для классов Employee, Car и Pet вторым способом (без сканирования).
