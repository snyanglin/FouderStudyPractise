package RuleStationStudy;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;


/**
 * ****************************************************************************
 * @Package:      [RuleStationStudy.RuleBaseFacatory.java]  
 * @ClassName:    [RuleBaseFacatory]   
 * @Description:  [工厂类，RuleBaseFacatory 单实例RuleBase生成工具]   
 * @Author:       [yang.lin@founder.com.cn]  
 * @CreateDate:   [2016年1月13日 上午9:41:47]   
 * @UpdateUser:   [Administrator(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateDate:   [2016年1月13日 上午9:41:47，(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateRemark: [说明本次修改内容,(如多次修改保留历史记录，增加修改记录)]  
 * @Version:      [v1.0]
 */
public class RuleBaseFacatory {
	
	private static RuleBase ruleBase;
	public static RuleBase getRuleBase(){
		return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
	}
}
