package personal.weizeng.portals_show.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.weizeng.portals_show.model.Tieba;
import personal.weizeng.portals_show.repos.TieBaRepository;

/**
 * Created by Administrator on 2018/3/12.
 */

@RestController
public class SampleController {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private TieBaRepository tieBaRepository;


    @RequestMapping("/")
    String home() {

        Test tieBa = testRepository.findTieBaByUuid("12345678");

        return tieBa.toString();
    }
    @RequestMapping("/1")
    String home1() {

        Tieba tieba = tieBaRepository.findTieBaByUuid("0004e196f6e84418a16a20adc211dfc9");

        return tieba.toString();
    }
}
