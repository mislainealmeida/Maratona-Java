package academy.devdojo.maratonajava.Njdbc.teste;

import academy.devdojo.maratonajava.Njdbc.dominio.Producer;
import academy.devdojo.maratonajava.Njdbc.repositorio.ProducerRepository;
import academy.devdojo.maratonajava.Njdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class Teste01 {
    public static void main(String[] args) throws SQLException {
        /*Producer producer = Producer.ProducerBuilder.builder()
                .name("NHK").build();*/
        Producer producer= Producer.builder().name("Studio Deen").build();
        /*log.info("INFO");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.trace("trace");*/
        //ProducerRepository.save(producer);
        /*ProducerService.save(producer);

        ProducerService.delete(2);
        ProducerService.delete(5);*/

        Producer producerUpdate= Producer.builder().id(8).name("MADHOUSE").build();
        //ProducerService.update(producerUpdate);

        //List<Producer> producers = ProducerService.findAll();
       // List<Producer> producers = ProducerService.findByName("Mad");
       // log.info("Producers found '{}'", producers);

        ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData();



    }
}