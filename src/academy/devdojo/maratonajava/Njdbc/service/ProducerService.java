package academy.devdojo.maratonajava.Njdbc.service;

import academy.devdojo.maratonajava.Njdbc.dominio.Producer;
import academy.devdojo.maratonajava.Njdbc.repositorio.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        requireValid(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer) {
        requireValid(producer.getId());
        ProducerRepository.uptade(producer);
    }

    private static void requireValid (Integer id){
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }
    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }


    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
