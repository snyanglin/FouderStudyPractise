package RuleStationStudy;
/**
 * ****************************************************************************
 * @Package:      [RuleStationStudy.PointRuleEngine.java]  
 * @ClassName:    [PointRuleEngine]   
 * @Description:  [这是规则接口]   
 * @Author:       [yang.lin@founder.com.cn]  
 * @CreateDate:   [2016年1月13日 上午9:43:18]   
 * @UpdateUser:   [Administrator(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateDate:   [2016年1月13日 上午9:43:18，(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateRemark: [说明本次修改内容,(如多次修改保留历史记录，增加修改记录)]  
 * @Version:      [v1.0]
 */
public interface PointRuleEngine {

	/**
	 * 初始化规则引擎
	 */
	public void initEngine();
	
	/**
	 * 刷新规则引擎中的规则
	 */
	public void refreshEnginRule();
	
	/**
	 * 执行规则引擎
	 * @param pointDomain 积分Fact
	 */
	public void executeRuleEngine(final PointDomain pointDomain);
}
