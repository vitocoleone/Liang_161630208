package MY_TEST;

import org.apache.commons.lang3.*;

public class Mytest 
{
	//输入一个字符串，删除所有空格之后查询某个字符的位置,将当前字符串全部转化为小写后并输出所在字符串的位置
		public int main(String ch,String des)
		{
			System.out.println("输入一个字符串:");
			
			ch= first(ch);
			
			if(second(ch,des)!=0)
			{
				System.out.println(third(ch));
				return 1;
			}
			else 
			{
				System.out.println("当前字符串不含有所查字符！");
				return 0;
			}
		}
		// first second third 同级
		// first 删除字符串的空格
		public String first(String ch)
		{
			String ah;
				ah=StringUtils.deleteWhitespace(ch);
			
			System.out.println("得到字符串"+ah);
				return ah;
		}
		//查找字符
		public int second(String ch, String des)
		{
			int i;
				//注入错误
			for(i=0;i<=20;i++)
				{
					if(ch.charAt(i)== des.charAt(0))
						return i+1;
				}
			
				return 0;
		}
		//桩模块	
		public String third(String ch)
		{
			System.out.println("当前函数为函数third(桩模块)");
			String bh="全部小写";
			return bh;
		}


}
