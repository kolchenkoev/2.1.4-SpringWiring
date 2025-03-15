package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//связывание через аннотацию
@Component //говорит Spring, что нужно создать бин (экземпляр класса) Ocean1 и поместить его в Spring-контейнер
public class Ocean1 {

    @Autowired //указывает Spring, что нужно автоматически внедрить зависимость в поле island. Spring будет искать бин типа Island2 в Spring-контейнере и внедрит его в это поле
    private Island2 island; //зависимость класса Ocean1 от класса Island2

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
