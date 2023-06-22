package academy.devdojo.maratonajava.javacore.ZZZHjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZZHjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZZHjdbc.repository.ProducerRepository;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
       return ProducerRepository.findAll();
    }

    private static void requireValidId(Integer id) {
        if (id <= 0 || id == null) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
