package JunitTest;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		creatFilefolder();
	}
	public static   void creatFilefolder(){
		File file =new File("D:\\workspace2\\DroolsDemo\\src\\com\\drools\\demo\\point");    
		//如果文件夹不存在则创建    
		if  (!file .exists()  && !file .isDirectory())      
		{       
		    System.out.println("//不存在");  
		    file .mkdir();    
		    System.out.println("目录创建成功！");
		} else   
		{  
		    System.out.println("//目录存在");  
		}  
	}
}
