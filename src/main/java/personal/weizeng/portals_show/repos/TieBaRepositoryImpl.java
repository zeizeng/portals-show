package personal.weizeng.portals_show.repos;

import org.springframework.stereotype.Repository;
import personal.weizeng.portals_show.model.Tieba;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12.
 */

@Repository("tiebaRepository")
public class TieBaRepositoryImpl extends BaseEntityRepository<Tieba> implements TieBaRepository {

    @Override
    public Tieba findTieBaByUuid(String uuid) {
        return entityManager.find(Tieba.class, uuid);
    }

    @Override
    public List<Tieba> findTieBaBySuperCategory(String superCategory) {
        return (List<Tieba>) entityManager.createNativeQuery("select * from tieba where super_category = '" + superCategory + "'", Tieba.class).getResultList();
    }

    @Override
    public List<Tieba> getAll() {
        return (List<Tieba>) entityManager.createNativeQuery("select * from tieba", Tieba.class).getResultList();
    }

    @Override
    public void updateCategory(Tieba tieba) {
        entityManager.merge(tieba);
    }


}
