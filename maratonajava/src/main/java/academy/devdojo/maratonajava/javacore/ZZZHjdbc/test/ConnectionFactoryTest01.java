package academy.devdojo.maratonajava.javacore.ZZZHjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZZHjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZZHjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZZHjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = new Producer("NHK");
//        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer one_piece = Producer.builder().name("One Piece").build();
        ProducerRepository.save(one_piece);
        Producer producerUpdate = Producer.builder().id(1).name("Studio Deen").build();

//        ProducerService.save(producer);
        ProducerService.delete(3);

//        ProducerService.update(producerUpdate);
        List<Producer> all = ProducerService.findAll();
        log.info(all);
    }
}
