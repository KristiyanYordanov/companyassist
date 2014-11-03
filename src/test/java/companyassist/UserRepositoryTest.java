/*package companyassist;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.Test;

import com.krissoft.companyassist.config.StandaloneDataJpaConfig;
import com.krissoft.companyassist.model.User;
import com.krissoft.companyassist.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { StandaloneDataJpaConfig.class })
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testFindAdmin() {
		User admin = userRepository.findOne(1L);
		Assert.assertNotNull(admin);
		Assert.assertEquals("admin", admin.getName());
	}

	@Test
	public void testFindByName() {

		User admin = userRepository.findByName("admin");
		Assert.assertNotNull(admin);
		Assert.assertEquals("admin", admin.getName());
	}

	@Test
	public void testFindByNameIgnoreCase() {

		User admin = userRepository.findByNameIgnoreCase("AdMIn");
		Assert.assertNotNull(admin);
		Assert.assertEquals("admin", admin.getName());
	}

	@Test
	public void testInsertUser() {

		User newUser = new User();
		newUser.setName("inserted");
		userRepository.save(newUser);
	}

}*/