package com.gupaoedu.vip.delegate;

/**
 * ί��ģʽ����ע��ʹ���ģʽ���֣�
 * 1���������н�Ĺ��ܣ�ί�л��ƣ�
 * 2�����б�ί���˵�����
 * 3�������Ĺ��̣�ֻ���Ľ��������ģʽ���Ĺ��̣�
 * IOC�����У���һ��Register����������Ϊ��
 * ��ĳ���౻��ʼ���Ĺ����У���Ҫ���ܶ಻ͬ���߼���������Ҫʵ�ֶ������ִ���ߣ��ֱ�ʵ�ָ��Թ��ܡ�
 * @author Administrator
 *
 */
public class DispatcherTest {

	
	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher(new ExectorA());
//		Dispatcher dispatcher = new Dispatcher(new ExectorB());
		//����ȥ���������ǵ���Ŀ�����ڸɻ�
		//��ʵ�ʸɻ��������ͨԱ��
		//����ǵ��ͣ��ɻ����ҵģ����������
		dispatcher.doing();
	}
	
}