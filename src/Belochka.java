class Belochka
{
    void sayOnOreh(){
        System.out.println("Белка: 'Ура, ещё орех!' ");}

    double sum(Oreshek[] oreshki) // Метод, определяющий сумму орешков
    {
        double result = 0;
        for (int i = 0; i < oreshki.length; i++){
            result = result + oreshki[i].ves;
            System.out.println(" ");
            sayOnOreh();
        }
        System.out.println(" ");
        System.out.println("Белка: 'А всего я собрала " + result + " грамм орешков!' ");
        return result;
    }
}
