package fileOperations;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFile {

	void findallfilesrepo() {
		String directory = System.getProperty("user.dir");
		File f = new File(directory);
		//List of all files and directories
		List<String> contents = Arrays.asList(f.list());
		Collections.sort(contents);
		System.out.println("Sorted File Names in ascending order : " + contents);
	}
}
