package com.nostalgiaguy.cleantestcode;
/*
import com.nitorcreations.junit.runners.NestedRunner
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.security.crypto.password.PasswordEncoder;
 
import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
 
@RunWith(NestedRunner.class)
public class RepositoryUserServiceTest_2 {
 
    private static final String REGISTRATION_EMAIL_ADDRESS = "john.smith@gmail.com";
    private static final String REGISTRATION_FIRST_NAME = "John";
    private static final String REGISTRATION_LAST_NAME = "Smith";
    private static final SocialMediaService SOCIAL_SIGN_IN_PROVIDER = SocialMediaService.TWITTER;
 
    private RepositoryUserService registrationService;
 
    private PasswordEncoder passwordEncoder;
 
    private UserRepository repository;
 
    @Before
    public void setUp() {
		passwordEncoder = mock(PasswordEncoder.class);
		repository = mock(UserRepository.class);
	
		registrationService = new RepositoryUserService(passwordEncoder, repository);
    }
	
	public class RegisterNewUserAccount {
	
		public class WhenUserUsesSocialSignIn {
		
			private RegistrationForm registration;
			
			@Before
			public void setUp() {
		        RegistrationForm registration = new RegistrationFormBuilder()
		                .email(REGISTRATION_EMAIL_ADDRESS)
		                .firstName(REGISTRATION_FIRST_NAME)
		                .lastName(REGISTRATION_LAST_NAME)
		                .isSocialSignInViaSignInProvider(SOCIAL_SIGN_IN_PROVIDER)
		                .build();
			}
			
			public class WhenUserAccountIsFoundWithEmailAddress {
			    
				@Before
				public void setUp() {
					given(repository.findByEmail(REGISTRATION_EMAIL_ADDRESS)).willReturn(new User());
				}
				
				@Test
			    public void shouldThrowException() throws DuplicateEmailException {
			        catchException(registrationService).registerNewUserAccount(registration);
			        assertThat(caughtException()).isExactlyInstanceOf(DuplicateEmailException.class);
			    }
				
			    @Test
			    public void shouldNotSaveNewUserAccount() throws DuplicateEmailException {  
			        catchException(registrationService).registerNewUserAccount(registration);
			        verify(repository, never()).save(isA(User.class));
			    }
			}
			
			public class WhenEmailAddressIsUnique {
			
				@Before
				public void setUp() {
					given(repository.findByEmail(REGISTRATION_EMAIL_ADDRESS)).willReturn(null);
					
			        given(repository.save(isA(User.class))).willAnswer(new Answer<User>() {
			          	@Override
			            public User answer(InvocationOnMock invocation) throws Throwable {
			                Object[] arguments = invocation.getArguments();
			                return (User) arguments[0];
			            }
			        });
				}
			    
				@Test
			    public void shouldSaveNewUserAccount() throws DuplicateEmailException {  
			        registrationService.registerNewUserAccount(registration);
 
			        ArgumentCaptor<User> userAccountArgument = ArgumentCaptor.forClass(User.class);
			        verify(repository, times(1)).save(isA(User.class));
			    }
				
			    @Test
			    public void shouldSetCorrectEmailAddress() throws DuplicateEmailException { 
			        registrationService.registerNewUserAccount(registration);
 
			        ArgumentCaptor<User> userAccountArgument = ArgumentCaptor.forClass(User.class);
			        verify(repository, times(1)).save(userAccountArgument.capture());
			        User createdUserAccount = userAccountArgument.getValue();
 
			        assertThatUser(createdUserAccount)
			                .hasEmail(REGISTRATION_EMAIL_ADDRESS);
			    }
				
			    @Test
			    public void shouldSetCorrectFirstAndLastName() throws DuplicateEmailException { 
			        registrationService.registerNewUserAccount(registration);
 
			        ArgumentCaptor<User> userAccountArgument = ArgumentCaptor.forClass(User.class);
			        verify(repository, times(1)).save(userAccountArgument.capture());
			        User createdUserAccount = userAccountArgument.getValue();
 
			        assertThatUser(createdUserAccount)
			                .hasFirstName(REGISTRATION_FIRST_NAME)
			                .hasLastName(REGISTRATION_LAST_NAME)
			    }
				
			    @Test
			    public void shouldCreateRegisteredUser() throws DuplicateEmailException { 
			        registrationService.registerNewUserAccount(registration);
 
			        ArgumentCaptor<User> userAccountArgument = ArgumentCaptor.forClass(User.class);
			        verify(repository, times(1)).save(userAccountArgument.capture());
			        User createdUserAccount = userAccountArgument.getValue();
 
			        assertThatUser(createdUserAccount)
			                .isRegisteredUser()
			    }
				
			    @Test
			    public void shouldSetSignInProvider() throws DuplicateEmailException { 
			        registrationService.registerNewUserAccount(registration);
 
			        ArgumentCaptor<User> userAccountArgument = ArgumentCaptor.forClass(User.class);
			        verify(repository, times(1)).save(userAccountArgument.capture());
			        User createdUserAccount = userAccountArgument.getValue();
 
			        assertThatUser(createdUserAccount)
			                .isRegisteredByUsingSignInProvider(SOCIAL_SIGN_IN_PROVIDER);
			    }
				
			    @Test
			    public void shouldNotCreateEncodedPasswordForUser() throws DuplicateEmailException { 
			        registrationService.registerNewUserAccount(registration);
 
			        verifyZeroInteractions(passwordEncoder);
			    }
				
			    @Test
			    public void shouldReturnCreatedUserAccount() throws DuplicateEmailException {
			        User returnedUserAccount = registrationService.registerNewUserAccount(registration);
 
			        ArgumentCaptor<User> userAccountArgument = ArgumentCaptor.forClass(User.class);
			        verify(repository, times(1)).save(userAccountArgument.capture());
			        User createdUserAccount = userAccountArgument.getValue();
 
			        assertThat(returnedUserAccount)
			                .isEqualTo(createdUserAccount);
			    }
			}
		
		}
	}
}
*/
