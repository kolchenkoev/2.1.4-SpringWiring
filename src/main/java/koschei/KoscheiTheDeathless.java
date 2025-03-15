package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;  //автоматическое внедрение зависимостей
import org.springframework.stereotype.Component; //указываем что компонент спринга и должен управляться контейнером спринга


//внедрение через сеттер
@Component //Spring будет создавать экземпляры этого класса, управлять их жизненным циклом и внедрять в них зависимости
public class KoscheiTheDeathless {

    private Ocean1 ocean; //объявляем зависимость

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired //Spring должен автоматически внедрить зависимость Ocean1 в этот метод
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
