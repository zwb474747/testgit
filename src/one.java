		import java.util.HashMap;
		import java.util.Map;
		import java.util.Objects;
		import java.util.Scanner;
		
				/**
		 * @Description �����û�
		 * @Author jp
		 * @Date 2020/2/22 17:58
		 **/
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Map<String, String> map = new HashMap<>();
		        map.put("��ɫ", "30");
		        map.put("��ɫ", "31");
		        map.put("��ɫ", "32");
		        map.put("��ɫ", "33");
		        map.put("��ɫ", "34");
		        map.put("�Ϻ�ɫ", "35");
		        map.put("����ɫ", "36");
		        map.put("��ɫ", "37");
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("��������Ҫ����ɫ����ɫ����ɫ����ɫ����ɫ����ɫ���Ϻ�ɫ������ɫ����ɫ");
		        String importText = scanner.next();
		        String colorCode = null;
		        for (String key : map.keySet()) {
		            if (Objects.equals(key, importText)) {
		                colorCode = map.get(importText);
		            }
		        }
		        System.out.println("\033[1;" + colorCode + "m" + importText + "\033[0m \n");
		        System.out.println("emmmmmmmm���Ǹ�ɶ");
		    }
		
	}


