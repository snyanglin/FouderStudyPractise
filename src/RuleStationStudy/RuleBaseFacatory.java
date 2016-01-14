package RuleStationStudy;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;


/**
 * ****************************************************************************
 * @Package:      [RuleStationStudy.RuleBaseFacatory.java]  
 * @ClassName:    [RuleBaseFacatory]   
 * @Description:  [�����࣬RuleBaseFacatory ��ʵ��RuleBase���ɹ���]   
 * @Author:       [yang.lin@founder.com.cn]  
 * @CreateDate:   [2016��1��13�� ����9:41:47]   
 * @UpdateUser:   [Administrator(�����޸ı�����ʷ��¼�������޸ļ�¼)]   
 * @UpdateDate:   [2016��1��13�� ����9:41:47��(�����޸ı�����ʷ��¼�������޸ļ�¼)]   
 * @UpdateRemark: [˵�������޸�����,(�����޸ı�����ʷ��¼�������޸ļ�¼)]  
 * @Version:      [v1.0]
 */
public class RuleBaseFacatory {
	
	private static RuleBase ruleBase;
	public static RuleBase getRuleBase(){
		return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
	}
}
