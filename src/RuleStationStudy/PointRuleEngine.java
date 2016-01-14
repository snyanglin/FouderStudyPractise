package RuleStationStudy;
/**
 * ****************************************************************************
 * @Package:      [RuleStationStudy.PointRuleEngine.java]  
 * @ClassName:    [PointRuleEngine]   
 * @Description:  [���ǹ���ӿ�]   
 * @Author:       [yang.lin@founder.com.cn]  
 * @CreateDate:   [2016��1��13�� ����9:43:18]   
 * @UpdateUser:   [Administrator(�����޸ı�����ʷ��¼�������޸ļ�¼)]   
 * @UpdateDate:   [2016��1��13�� ����9:43:18��(�����޸ı�����ʷ��¼�������޸ļ�¼)]   
 * @UpdateRemark: [˵�������޸�����,(�����޸ı�����ʷ��¼�������޸ļ�¼)]  
 * @Version:      [v1.0]
 */
public interface PointRuleEngine {

	/**
	 * ��ʼ����������
	 */
	public void initEngine();
	
	/**
	 * ˢ�¹��������еĹ���
	 */
	public void refreshEnginRule();
	
	/**
	 * ִ�й�������
	 * @param pointDomain ����Fact
	 */
	public void executeRuleEngine(final PointDomain pointDomain);
}
