package academy.devdojo.maratonajava.javacore.ZZZHjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZZHjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZZHjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection coon = ConnectionFactory.getConnection(); Statement stmt = coon.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
          log.info("Inserted producer '{}' in the database, rows affected '{}'",producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}", producer.getName());
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection coon = ConnectionFactory.getConnection(); Statement stmt = coon.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Delete producer '{}' in the database, rows affected '{}'",id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}", id);
            e.printStackTrace();
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
        try (Connection coon = ConnectionFactory.getConnection(); Statement stmt = coon.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("updated producer '{}', rows affected '{}'",producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}", producer.getId());
            e.printStackTrace();
        }
    }


    public static List<Producer> findAll() {
        log.info("find all Producers");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id, name FROM anime_store.producer;";
        try (Connection coon = ConnectionFactory.getConnection(); Statement stmt = coon.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
          while (rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("name");
               Producer producer = Producer.builder().id(id).name(name).build();
               producers.add(producer);
          }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}", e);
            e.printStackTrace();
        }
        return producers;
    }
}
