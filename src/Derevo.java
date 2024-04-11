class Derevo
{
    Oreshek[] growUpOreshki(int kolvo) // метод ВыраститьМассивОрехов
    {
        Oreshek[] oreshki = new Oreshek[kolvo]; // Конструктор
        for (int i = 0; i < oreshki.length; i++)
        {oreshki[i] = new Oreshek();}           // Конструктор i элемента из класса Oreshek
        return oreshki;                         // Возврат
    }
}
