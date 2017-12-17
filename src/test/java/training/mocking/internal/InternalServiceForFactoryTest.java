package training.mocking.internal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import training.mocking.external.ExternalService;
import training.mocking.external.ExternalServiceFactory;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ExternalServiceFactory.class, ExternalService.class })

public class InternalServiceForFactoryTest {
    private final ExternalService externalService = PowerMockito.mock(ExternalService.class);
    private final ExternalServiceFactory externalServiceFactory;
    private final InternalService internalService;

    public InternalServiceForFactoryTest() throws Exception {
        PowerMockito.whenNew(ExternalService.class)
                .withNoArguments()
                .thenReturn(externalService);

        externalServiceFactory = new ExternalServiceFactory();
        internalService = new InternalService(externalService);
    }

    @Before
    public void before() {
        Mockito.reset(externalService);
    }

    @Test
    public void doWorkTest() {
        internalService.useExternalServiceDoStaff();

        Mockito.verify(externalService).doStaff();
    }

}