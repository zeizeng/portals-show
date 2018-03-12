package personal.weizeng.portals_show.repos;

import org.springframework.transaction.annotation.Transactional;
import personal.weizeng.portals_show.model.Tieba;

import java.util.List;

/**
 * Created by Administrator on 2018/3/12.
 */

@Transactional
public interface TieBaRepository {

    Tieba findTieBaByUuid(String id);

    List<Tieba> findTieBaBySuperCategory(String superCategory);

    void save(Tieba tieba);

    List<Tieba> getAll();

    void updateCategory(Tieba tieba);
}
