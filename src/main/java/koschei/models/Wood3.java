package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Rabbit4 rabbit;  //неизменяемая зависимость

    @Autowired //внедряем автоматически через конструктор
    public Wood3(Rabbit4 rabbit) { //Этот конструктор используется для создания экземпляра Wood3 и внедрения зависимости rabbit
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
