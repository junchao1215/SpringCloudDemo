package dubbo.api;

import entity.Organ;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class OrganzationDubboApiImpl implements OrganzationDubboApi {
    public void edit(Organ organ) {
        System.out.println(organ);
    }
}
