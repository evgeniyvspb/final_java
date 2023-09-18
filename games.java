// В метод put передаете последовательно несколько строк
// 1 2 конструктор;
// 2 2 робот;
// 3 6 кукла.
// Метод Get должен случайно вернуть либо “2”, либо “3” и соответствии с весом.
// В 20% случаях выходит единица
// В 20% двойка
// И в 60% тройка.

public class Games {
    Integer id;
    String about;
    Double probability;

    public Games(Integer id, String about, Double probability) {
        this.id = id;
        this.about = about;
        this.probability = probability;
    }

    public void put(String aboutOut, Double probabilityOut) {
        this.about = aboutOut;
        this.probability=probabilityOut;
    }

    public Integer id() {
        return id;
    }

    public Double getProbability() {
        return this.probability;
    }

    public void newId(Integer idPrev) {
        id=idPrev + 1;
    }

    public int get() {  // что делать когда не знаешь какой тип возвращать??! пересмотреть лекцию где то было
        return 1;
    }

    public String name(){
        return this.about;
    }
//     Метод Get должен случайно вернуть либо “2”, либо “3” и соответствии с весом.
// В 20% случаях выходит единица
// В 20% двойка
// И в 60% тройка.

}
