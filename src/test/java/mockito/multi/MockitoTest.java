package mockito.multi;

import org.junit.*;
import org.mockito.Matchers;
import system.model.User;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

public class MockitoTest {

    private User user = new User("user", "password");

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass");
    }

    @Before
    public void before() {
//        System.out.println("Before");
    }

    @After
    public void after(){
//        System.out.println("After");
    }


    @Test
    public void testToString() throws Exception {
        String expectedToString = "User{name='user', password='password'}";
        assertEquals(expectedToString , user.toString());
        System.out.println("Test");
    }

    @Test
    public void testMock(){
        User mockUser = mock(User.class);
        String mockString = "mockString";
        when(mockUser.getName()).thenReturn("mockString");
        assertEquals(mockString, mockUser.getName());
        System.out.println("Mock Test");
    }

    @Test
    public void testMockListSizeMultiple(){
        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(2).thenReturn(3);
        assertEquals(mockList.size(), 2);
        assertEquals(mockList.size(), 3);
        System.out.println("MockListSizeMultiple Test");
    }

    @Test
    public void testMockListGetAny(){
        List mockList = mock(List.class);
        String mockString = "mockString";
        when(mockList.get(anyInt())).thenReturn(mockString);
        assertEquals(mockList.get(2), mockString);
        assertEquals(mockList.get(7), mockString);
        System.out.println("MockListGetAny Test");
    }

    @Test(expected = NullPointerException.class)
    public void testException(){
        List mockList = mock(List.class);
        when(mockList.get(anyInt())).thenThrow(new NullPointerException());
        System.out.println("Exception Test");
        mockList.get(2);
    }

    @Test
    public void testVerify(){
        List mockList = mock(List.class);
        mockList.get(2);
        mockList.get(2);
        mockList.add("");
        verify(mockList).add(Matchers.anyObject());
        verify(mockList, atLeast(1)).get(anyInt());
        verify(mockList, never()).clear();
        System.out.println("Verify Test");

    }

}