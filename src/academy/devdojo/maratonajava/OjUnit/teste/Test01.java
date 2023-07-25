package academy.devdojo.maratonajava.OjUnit.teste;

import academy.devdojo.maratonajava.OjUnit.dominio.Person;
import academy.devdojo.maratonajava.OjUnit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));

    }
}
