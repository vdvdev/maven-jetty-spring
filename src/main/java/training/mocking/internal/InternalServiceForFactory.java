package training.mocking.internal;

import training.mocking.external.ExternalServiceFactory;

public class InternalServiceForFactory {
    private final ExternalServiceFactory externalServiceFactory;

    public InternalServiceForFactory(final ExternalServiceFactory externalServiceFactory) {
        this.externalServiceFactory = externalServiceFactory;
    }

    public void useExternalServiceDoStaff() {
        externalServiceFactory.createExternalService().doStaff();
    }
}
