package JunitTest;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		creatFilefolder();
	}
	public static   void creatFilefolder(){
		File file =new File("D:\\workspace2\\DroolsDemo\\src\\com\\drools\\demo\\point");    
		//����ļ��в������򴴽�    
		if  (!file .exists()  && !file .isDirectory())      
		{       
		    System.out.println("//������");  
		    file .mkdir();    
		    System.out.println("Ŀ¼�����ɹ���");
		} else   
		{  
		    System.out.println("//Ŀ¼����");  
		}  
	}
}
