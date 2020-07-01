package com.model;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface FilesOprn {
	public File createFile() throws IOException;
	public void DeleteFile(String filename);
	public File getFile(String filename);
	public List<File> listAllFiles();
	
}
