package MY_TEST;

import org.apache.commons.lang3.*;

public class Mytest 
{
	//����һ���ַ�����ɾ�����пո�֮���ѯĳ���ַ���λ��,����ǰ�ַ���ȫ��ת��ΪСд����������ַ�����λ��
		public int main(String ch,String des)
		{
			System.out.println("����һ���ַ���:");
			
			ch= first(ch);
			
			if(second(ch,des)!=0)
			{
				System.out.println(third(ch));
				return 1;
			}
			else 
			{
				System.out.println("��ǰ�ַ��������������ַ���");
				return 0;
			}
		}
		// first second third ͬ��
		// first ɾ���ַ����Ŀո�
		public String first(String ch)
		{
			String ah;
				ah=StringUtils.deleteWhitespace(ch);
			
			System.out.println("�õ��ַ���"+ah);
				return ah;
		}
		//�����ַ�
		public int second(String ch, String des)
		{
			int i;
				//ע�����
			for(i=0;i<=20;i++)
				{
					if(ch.charAt(i)== des.charAt(0))
						return i+1;
				}
			
				return 0;
		}
		//׮ģ��	
		public String third(String ch)
		{
			System.out.println("��ǰ����Ϊ����third(׮ģ��)");
			String bh="ȫ��Сд";
			return bh;
		}


}
