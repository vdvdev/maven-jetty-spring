package training.mocking.internal;

import training.mocking.external.StaticService;

public class UseStaticService {

    public String useStatic(final Object obj) {
        StaticService.doStatic();
        //
        return StaticService.doStaticWithParams(obj);
    }
}
