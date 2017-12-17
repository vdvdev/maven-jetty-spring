package training.mocking.internal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import training.mocking.external.ExternalService;

import static org.powermock.api.mockito.PowerMockito.when;


@RunWith(PowerMockRunner.class)
@PrepareForTest(ExternalService.class)
public class InternalServiceTest {

    private final ExternalService externalService = PowerMockito.mock(ExternalService.class);
    private final InternalService internalService = new InternalService(externalService);

    @Before
    public void before() {
        Mockito.reset(externalService);
    }

    @Test
    public void useExternalServiceDoStaff() throws Exception {

        when(externalService.doStaff()).thenReturn("mockedExternalService");

        internalService.useExternalServiceDoStaff();

        Mockito.verify(externalService).doStaff();
    }
}