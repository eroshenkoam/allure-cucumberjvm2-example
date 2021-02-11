#language: ru
Функционал: Простые теги на сценарии

  @simple
  Сценарий: Сценарий с маслом
    """
    У сценария должен быть один тег - "simple"
    """
    Дано бутерброд с маслом
    Когда его роняют
    Тогда он падает маслом вниз

  @простой
  Сценарий: Сценарий с медом
    """
    У сценария должен быть один тег - "простой"
    """
    Дано бутерброд с медом
    Когда его роняют
    Тогда он падает медом вниз


  @simple @простой
  Структура сценария: Параметризованый сценарий с <ингридиент>
    """
    У сценария должно быть два тега - "simple" и "простой"
    """
    Дано бутерброд с <ингридиент>
    Когда его роняют
    Тогда он падает <ингридиент> вниз

    Примеры:
    | ингридиент   |
    | икра красная |