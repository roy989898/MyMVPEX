package poly.pom.myfirstmvpex;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import poly.pom.myfirstmvpex.model.User;
import poly.pom.myfirstmvpex.presentation.UserPresenterImpl;
import poly.pom.myfirstmvpex.repository.UserRepository;
import poly.pom.myfirstmvpex.view.Userview;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;


/**
 * Created by User on 27/8/2016.
 */
public class PresenterTest {
    private UserRepository repositiry;
    private Userview view;
    private UserPresenterImpl userPrestener;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        repositiry = mock(UserRepository.class);
        view = mock(Userview.class);

        User user = new User("May");
        when(repositiry.getUser(anyInt())).thenReturn(user);

        userPrestener = new UserPresenterImpl(repositiry);
        userPrestener.setView(view);

    }

    @Test
    public void haveInterationWithViewWhensaveUser(){
        userPrestener.saveUser();
//        verifyZeroInteractions();
        verify(view,atLeastOnce()).showSuccessToast();
    }
}
