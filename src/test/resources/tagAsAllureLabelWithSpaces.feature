#language: ru
Функционал: Тег как аллюр лейбл с пробелами

  @allure.label.component=third_party_reader
  Сценарий: Тег с нижним подчеркиванием
  """
    У сценария должен быть лейбл "component" с значением "third party reader"
    У сценария не должно быть тегов
    """
    Дано бутерброд с вареньем
    Когда его роняют
    Тогда он падает вареньем вниз


  @allure.label.component="third party reader"
  Сценарий: Тег с кавычками
  """
    У сценария должен быть лейбл "component" с значением "third party reader"
    У сценария не должно быть тегов
    """
    Дано бутерброд с вареньем
    Когда его роняют
    Тогда он падает вареньем вниз