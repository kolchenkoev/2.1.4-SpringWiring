package koschei.models;


//через конструктор
public class Island2 {

    private Wood3 wood; //зависимость класса Island2 от класса Wood3

    public Island2(Wood3 wood) { //Этот конструктор используется для создания экземпляра Island2 и внедрения зависимости wood
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
