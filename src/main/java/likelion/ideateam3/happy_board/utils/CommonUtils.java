package likelion.ideateam3.happy_board.utils;

public class CommonUtils {
	private static final String FILE_EXTENSION_SEPARATOR = ".";
	private static final String TIME_SEPARATOR = "_";

	public static String buildFileName(String originalFileName) {
		int fileExtensionIndex = originalFileName.lastIndexOf(FILE_EXTENSION_SEPARATOR);
		String fileExtension = originalFileName.substring(fileExtensionIndex);
		String fileName = originalFileName.substring(0, fileExtensionIndex);
		String now = String.valueOf(System.currentTimeMillis());

		return fileName + TIME_SEPARATOR + now + fileExtension;
	}
}
