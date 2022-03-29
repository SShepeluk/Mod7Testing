import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class fileTest {

	@Test
	void fileTest() {
		main test = new main();
		File testFile = new File("C:\\Users\\sharl\\Desktop\\2022HW\\SoftwareDev\\Mod7Testing\\poem.txt");
		assertTrue(testFile.exists());
	}

}
