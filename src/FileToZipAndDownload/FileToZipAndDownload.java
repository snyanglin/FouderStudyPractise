package FileToZipAndDownload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.junit.Test;

public class FileToZipAndDownload {

	/**
	 * discription:将单个文件压缩成Zip格式的压缩文件
	 * @throws Exception
	 */
	@Test
	public void sigleFileToZip() throws Exception{
		 File file = new File("d:" + File.separator + "aaa.java");  
		 File zipFile = new File("d:" + File.separator + "hello.zip");  
		 InputStream input = new FileInputStream(file);  
		 ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));  
		 zipOut.putNextEntry(new ZipEntry(file.getName()));  
		 // 设置注释  
		 zipOut.setComment("hello");  
		 int temp = 0;  
		 while((temp = input.read()) != -1){  
		     zipOut.write(temp);  
		 }  
		 input.close();  
		 zipOut.close(); 
	}
	
	/**
	 * discription:将文件夹压缩成Zip格式的压缩文件
	 * @throws Exception
	 */
	@Test
	public void sigleFileFloderToZip() throws Exception{
	  File file = new File("d:" + File.separator + "temp");  
      File zipFile = new File("d:" + File.separator + "zipFile.zip");  
      InputStream input = null;  
      ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(  
              zipFile));  
      zipOut.setComment("hello");  
      if(file.isDirectory()){  
          File[] files = file.listFiles();  
          for(int i = 0; i < files.length; ++i){  
              input = new FileInputStream(files[i]);  
              zipOut.putNextEntry(new ZipEntry(file.getName()  
                      + File.separator + files[i].getName()));  
              int temp = 0;  
              while((temp = input.read()) != -1){  
                  zipOut.write(temp);  
              }  
              input.close();  
          }  
      }  
      zipOut.close();  

	}
	
	/**
	 * discription:将Zip格式的压缩文件解压成普通文件
	 * @throws Exception
	 */
	@Test
	public void sigleZipfileTofile() throws Exception{
		File file = new File("d:" + File.separator + "hello.zip");  
		File outFile = new File("d:" + File.separator + "unZipFileHello.txt");  
		ZipFile zipFile = new ZipFile(file);  
		ZipEntry entry = zipFile.getEntry("aaa.java");//aaa.java 为压缩包中文件的名称  
		InputStream input = zipFile.getInputStream(entry);  
		OutputStream output = new FileOutputStream(outFile);  
		int temp = 0;  
		while((temp = input.read()) != -1){  
		    output.write(temp);  
		}  
		input.close();  
		output.close();  
	}

	/**
	 * discription:将Zip格式的压缩文件夹解压成普通文件
	 * @throws Exception
	 */
	@Test
	public void ZipfileFolderTofile() throws Exception{
		File file = new File("d:" + File.separator + "zipFile.zip");  //要解压的压缩文件
	   File outFile = null;  
	   ZipFile zipFile = new ZipFile(file);  
	   ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));  
	   ZipEntry entry = null;  
	   InputStream input = null;  
	   OutputStream output = null;  
	   while((entry = zipInput.getNextEntry()) != null){  
	       System.out.println("解压缩" + entry.getName() + "文件");//entry.getName()获得压缩包内的文件及文件路径（aaaa/bb.txt）  
	       outFile = new File("d:" + File.separator + entry.getName());  
	       if(!outFile.getParentFile().exists()){  
	           outFile.getParentFile().mkdir();  
	       }  
	       if(!outFile.exists()){  
	           outFile.createNewFile();  
	       }  
	       input = zipFile.getInputStream(entry);  
	       output = new FileOutputStream(outFile);  
	       int temp = 0;  
	       while((temp = input.read()) != -1){  
	           output.write(temp);  
	       }  
	       input.close();  
	       output.close();  
	   }  
	}}

