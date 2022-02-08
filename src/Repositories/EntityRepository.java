package Repositories;

import java.util.List;

public interface EntityRepository<Entity> {
    Entity get(int id);
    List<Entity> getAll();
}
