package RuleStationStudy;
/**
 * ****************************************************************************
 * @Package:      [RuleStationStudy.PointDomain.java]  
 * @ClassName:    [PointDomain]   
 * @Description:  [���Ǹ�С��Ŀ��javaBean�����ּ������ ]   
 * @Author:       [yang.lin@founder.com.cn]  
 * @CreateDate:   [2016��1��13�� ����9:42:14]   
 * @UpdateUser:   [Administrator(�����޸ı�����ʷ��¼�������޸ļ�¼)]   
 * @UpdateDate:   [2016��1��13�� ����9:42:14��(�����޸ı�����ʷ��¼�������޸ļ�¼)]   
 * @UpdateRemark: [˵�������޸�����,(�����޸ı�����ʷ��¼�������޸ļ�¼)]  
 * @Version:      [v1.0]
 */
public class PointDomain {
	// �û���
		private String userName;
		// �Ƿ�������
		private boolean birthDay;
		// ���ӻ�����Ŀ
		private long point;
		// ���¹������
		private int buyNums;
		// �����˻�����
		private int backNums;
		// ���¹����ܽ��
		private double buyMoney;
		// �����˻��ܽ��
		private double backMondy;
		// �������ÿ��������
		private int billThisMonth;
		
		/**
		 * ��¼���ַ�����ˮ����ֹ�ظ�����
		 * @param userName �û���
		 * @param type ���ַ�������
		 */
		public void recordPointLog(String userName, String type){
			System.out.println("���Ӷ�"+userName+"������Ϊ"+type+"�Ļ��ֲ�����¼.");
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public boolean isBirthDay() {
			return birthDay;
		}

		public void setBirthDay(boolean birthDay) {
			this.birthDay = birthDay;
		}

		public long getPoint() {
			return point;
		}

		public void setPoint(long point) {
			this.point = point;
		}

		public int getBuyNums() {
			return buyNums;
		}

		public void setBuyNums(int buyNums) {
			this.buyNums = buyNums;
		}

		public int getBackNums() {
			return backNums;
		}

		public void setBackNums(int backNums) {
			this.backNums = backNums;
		}

		public double getBuyMoney() {
			return buyMoney;
		}

		public void setBuyMoney(double buyMoney) {
			this.buyMoney = buyMoney;
		}

		public double getBackMondy() {
			return backMondy;
		}

		public void setBackMondy(double backMondy) {
			this.backMondy = backMondy;
		}

		public int getBillThisMonth() {
			return billThisMonth;
		}

		public void setBillThisMonth(int billThisMonth) {
			this.billThisMonth = billThisMonth;
		}

}
