package JavaTraining;


	import java.io.*;
	import java.util.*;

	public class FileHandlingExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the Directory path");
	String path = sc.nextLine();
	File fileRef = new File(path);
	if (fileRef.exists()) {
	System.out.println(fileRef);
	//FileFilter filter = new FileFilter() {
	//public boolean accept(File fileRef) {
	//return fileRef.getName().endsWith("java");
	//}
	//};
	File[] files = fileRef.listFiles(file->{return file.getName().endsWith("java");});
	System.out.println("Files are:");
	Arrays.stream(files).map(file->file.getName()).forEach(name->System.out.println(name));
	
	} else {
	System.out.println("please check the path you give");
	}
	}
	}

