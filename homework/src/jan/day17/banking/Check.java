package jan.day17.banking;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Check {

	public FileCheck find() {
		String folderPath = "C:\\temp";
		String fileName = "list.db";

		Path folder = Paths.get(folderPath);
		Path filePath = folder.resolve(fileName);

		if (Files.exists(filePath)) {
			return FileCheck.EXIST;
		} else {
			return FileCheck.NON_EXIST;
		}
	}
}
