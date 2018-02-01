# Project Shine


## ТРАНСПОРТНАЯ СИСТЕМА ПРОДАЖИ И БРОНИРОВАНИЯ БИЛЕТОВ.

Особенности кодовой базы:
- максимальная безопасность и защита от ошибок.
- система реального времени.
- возможность интеграции со сторонними системами.
- расширяемость функционала.

Идея в виде функций:

1. Добавление рейса овопределенного типа транспорта между городами.
2. Поиск рейсов.
3. Бронирование билетов.
4. Покупка билетов.
5. Отмена билетов.
6. Интеграция со сторонними сервисами (социальные сети для авторизации)


### Требования

Номер | Название | Роль | Описание

1 | Добавление населенного пункта | Менеджер | Менеджер заходит на страницу добавления населенного пункта, заполняет необходимые поля и добавляет пункт в систему.

2 | Добавление рейса | Менеджер | Менеджер заходит на страницу добавления рейса, заполняем необходимые поля и добавляет рейс в систему

3 | Поиск рейса | Клиент | Клиент заходит на страницу поиска рейсов, заполняет критерии поиска, и система выдает ему найденные варианты

4 | Бронирование билетов | Клиент | Клиент выбирает один из найденных рейсов, вводит информацию о билете и бронирует его. Система высылает ему информацию о подтверждении бронирования

5 | Покупка билетов | Клиент | Клиент выбирает один из найденных рейсов, вводит информацию о билете и покупает его. Система высылает ему информацию о подтверждении покупки

6 | Покупка бронированных билетов | Клиент | Клиент заходит на страницу своего профиля, выбирает забронированный билет и выкупает его

7 | Отмена бронированных билетов | Клиент | Клиент заходит на страницу своего профиля, выбирает забронированный билет и отменяет его

8 | Отмена истекшей брони | Планировщик системы | Планировщик проверяет все забронированные билеты и отменяет те, для которых истек срок оплаты

### Выбор платформы

- Насколько команда разработчиков знакома с платформой
- Насколько платформа популярна
- Насколько легко изучить ее с нуля или наоборот человеку, уже знакомому с программированием
- Сколько стоят средства разработки, дополнительные библиотеки и плагины

### Язык программирования

- Scala
- Clojure
- Groovy
- Kotlin

### Архитектура

- Изменение каркаса практически всегда приводит к обрушению строения и создания заново
- Каркас должны создавать самые опытные специалисты
- Для уменьшения риска и затрат по времени предпочтительно использовать типовые решения

#### Архитектурные шаблоны

- Клиент-серверное приложение
- Веб-приложение
- Мобильное приложение
- Сервис-ориентированное приложение