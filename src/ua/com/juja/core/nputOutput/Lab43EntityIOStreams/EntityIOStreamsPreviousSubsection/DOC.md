В системе есть два класса сущностей class Point class Person.
Для работы с этими сущностями было создано два интерфейса EntityOutput EntityInput, которые декларируют методы записи и считывания сущностей.
Интерфейс EntityOutput уже реалиован в классе EntityOutputStream.
По образу и подобию нужно реализовать интерфейс EntityInput в классе EntityInputStream.
Для класса EntityInputStream необходимо создать конструктор со следующей сигнатурой:
public EntityInputStream(InputStream in)