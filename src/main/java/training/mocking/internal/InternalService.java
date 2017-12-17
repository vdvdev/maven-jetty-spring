package training.mocking.internal;

import training.mocking.external.ExternalService;

public class InternalService {
    private final ExternalService externalService;

    public InternalService(ExternalService externalService){
        this.externalService = externalService;
    }

    public void useExternalServiceDoStaff(){
        System.out.println("InternalService " + externalService.doStaff());
    }
}
