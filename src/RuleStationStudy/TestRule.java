package RuleStationStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestRule {
	public static void main(String[] args) throws IOException {
		PointRuleEngine pointRuleEngine = new PointRuleEngineImpl();
		while(true){
			InputStream is = System.in;
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String input = br.readLine();
			
			if(null != input && "s".equals(input)){
				System.out.println("��ʼ����������...");
				pointRuleEngine.initEngine();
				System.out.println("��ʼ�������������.");
			}else if("e".equals(input)){
				final PointDomain pointDomain = new PointDomain();
				pointDomain.setUserName("hello kity");
				pointDomain.setBackMondy(100d);
				pointDomain.setBuyMoney(500d);
				pointDomain.setBackNums(1);
				pointDomain.setBuyNums(5);
				pointDomain.setBillThisMonth(5);
				pointDomain.setBirthDay(true);
				pointDomain.setPoint(0l);
				
				pointRuleEngine.executeRuleEngine(pointDomain);
				
				System.out.println("ִ�����BillThisMonth��"+pointDomain.getBillThisMonth());
				System.out.println("ִ�����BuyMoney��"+pointDomain.getBuyMoney());
				System.out.println("ִ�����BuyNums��"+pointDomain.getBuyNums());
				
				System.out.println("ִ����Ϲ�������������ͻ��֣�"+pointDomain.getPoint());
			} else if("r".equals(input)){
				System.out.println("ˢ�¹����ļ�...");
				pointRuleEngine.refreshEnginRule();
				System.out.println("ˢ�¹����ļ�����.");
			}
		}
	}
}
